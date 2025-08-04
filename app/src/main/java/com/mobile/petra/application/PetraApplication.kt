package com.mobile.petra.application

import android.app.Application
import com.mobile.petra.presentation.di.initKoin
import org.koin.android.ext.koin.androidContext


class PetraApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        initKoin {
            androidContext(this@PetraApplication)
//            AndroidLogger(Level.ALL)
        }
    }

//    private fun AndroidLogger(all: Level) {
//
//    }
}