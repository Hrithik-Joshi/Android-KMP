package com.hrithik.dailynews.di

import com.hrithik.dailynews.articles.ArticleViewModel
import com.hrithik.dailynews.articles.ArticlesService
import com.hrithik.dailynews.articles.ArticlesUseCase
import org.koin.dsl.module

val articlesModule = module {

    single<ArticlesService> { ArticlesService(get()) }
    single<ArticlesUseCase> { ArticlesUseCase(get()) }

}