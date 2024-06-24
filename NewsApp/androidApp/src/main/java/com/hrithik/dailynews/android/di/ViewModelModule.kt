package com.hrithik.dailynews.android.di

import com.hrithik.dailynews.articles.ArticleViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelsModule = module {

    viewModel { ArticleViewModel(get()) }
}