package com.hrithik.dailynews.di

import com.hrithik.dailynews.articles.data.ArticlesService
import com.hrithik.dailynews.articles.domain.ArticlesUseCase
import org.koin.dsl.module

val articlesModule = module {

    single<ArticlesService> { ArticlesService(get()) }
    single<ArticlesUseCase> { ArticlesUseCase(get()) }

}