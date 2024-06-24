package com.hrithik.dailynews.articles.presentation

import com.hrithik.dailynews.articles.domain.Article

data class ArticleState(
    val articles: List<Article> = listOf(),
    val loading: Boolean = false,
    val error: String? = null
)