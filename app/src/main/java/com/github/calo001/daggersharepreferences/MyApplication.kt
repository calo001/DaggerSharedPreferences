package com.github.calo001.daggersharepreferences

import android.app.Application
import com.github.calo001.daggersharepreferences.di.components.DaggerMyComponent
import com.github.calo001.daggersharepreferences.di.components.MyComponent
import com.github.calo001.daggersharepreferences.di.modules.SharePreferencesModule
import com.github.calo001.daggersharepreferences.interfaces.ComponentProvider

class MyApplication : Application(), ComponentProvider {
    override val myComponent: MyComponent by lazy {
        DaggerMyComponent.builder()
            .sharePreferencesModule(SharePreferencesModule(
                applicationContext)
            ).build()
    }

    override fun onCreate() {
        super.onCreate()
    }
}