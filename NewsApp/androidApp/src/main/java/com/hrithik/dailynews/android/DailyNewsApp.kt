package com.hrithik.dailynews.android

import android.app.Application
import com.hrithik.dailynews.android.di.viewModelsModule
import com.hrithik.dailynews.di.sharedKoinModules
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.GlobalContext.startKoin

class DailyNewsApp : Application() {
    override fun onCreate() {
        super.onCreate()
        initKoin()
    }

    private fun initKoin() {
        val modules = sharedKoinModules + viewModelsModule
        startKoin {
            androidContext(this@DailyNewsApp)
            modules(modules)
        }
    }
}