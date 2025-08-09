package com.mobile.petra.application

import android.app.Application
import com.mobile.petra.presentation.di.initKoin
import org.koin.android.ext.koin.androidContext
import org.koin.android.logger.AndroidLogger
import org.koin.core.logger.Level

class PetraApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        initKoin {
            androidContext(this@PetraApplication)
            AndroidLogger(Level.DEBUG)
        }
    }

//    private fun AndroidLogger(all: Level) {
//
//    }
}