package com.mob.till.restapiapp

import android.app.Application
import ru.skornei.restserver.RestServerManager

class App : Application() {
    override fun onCreate() {
        super.onCreate()

        RestServerManager.initialize(this)
    }
}