package com.hrithik.dailynews.articles

import com.hrithik.dailynews.BaseViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class  ArticleViewModel : BaseViewModel() {

    /* It holds an initial state of ArticleState.
    MutableStateFlow is a state holder observable that holds a single value
    and can be updated.
    */
    private val _articleState: MutableStateFlow<ArticleState> = MutableStateFlow(ArticleState())

    /* This is a public, read-only StateFlow property that exposes the state to observers.
    It returns the _articleState which means any changes to _articleState
    can be observed through articleState.
    */
    val articleState: StateFlow<ArticleState>
        get() = _articleState
}