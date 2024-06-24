package com.hrithik.dailynews.articles.presentation

import com.hrithik.dailynews.BaseViewModel
import com.hrithik.dailynews.articles.domain.ArticlesUseCase
import com.hrithik.dailynews.articles.presentation.ArticleState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class ArticleViewModel(
    private val useCase: ArticlesUseCase
) : BaseViewModel() {

    /* It holds an initial state of ArticleState.
    MutableStateFlow is a state holder observable that holds a single value
    and can be updated.
    */
    private val _articleState: MutableStateFlow<ArticleState> =
        MutableStateFlow(ArticleState(loading = true))

    /* This is a public, read-only StateFlow property that exposes the state to observers.
    It returns the _articleState which means any changes to _articleState
    can be observed through articleState.
    */
    val articleState: StateFlow<ArticleState>
        get() = _articleState


    init {
        getArticles()
    }

    private fun getArticles() {
        scope.launch {
            val fetchedArticles = useCase.getArticles()

            _articleState.emit(ArticleState(articles = fetchedArticles))
        }
    }
}
