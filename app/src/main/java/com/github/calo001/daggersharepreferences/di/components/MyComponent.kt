package com.github.calo001.daggersharepreferences.di.components

import com.github.calo001.daggersharepreferences.views.MainActivity
import com.github.calo001.daggersharepreferences.di.modules.SharePreferencesModule
import dagger.Component

@Component(modules = [SharePreferencesModule::class])
interface MyComponent {
    fun inject(mainActivity: MainActivity)
}