package com.hrithik.dailynews.articles

import com.hrithik.dailynews.BaseViewModel
import io.ktor.client.HttpClient
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.serialization.kotlinx.json.json
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import kotlinx.serialization.json.Json

class ArticleViewModel : BaseViewModel() {

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

    private val useCase: ArticlesUseCase

    init {
        val httpClient = HttpClient {
            install(ContentNegotiation) {
                json(Json {
                    prettyPrint = true
                    isLenient = true
                    ignoreUnknownKeys = true
                })
            }
        }

        val service = ArticlesService(httpClient)

        useCase = ArticlesUseCase(service)

        getArticles()
    }

    fun getArticles(forceFetch: Boolean = false) {
        scope.launch {
            val fetchedArticles = useCase.getArticles(forceFetch)

            _articleState.emit(ArticleState(articles = fetchedArticles))
        }
    }
}
