package com.github.calo001.daggersharepreferences.utils

import com.github.calo001.daggersharepreferences.di.components.MyComponent
import com.github.calo001.daggersharepreferences.interfaces.ComponentProvider
import com.github.calo001.daggersharepreferences.views.MainActivity

val MainActivity.sharePrefComponent: MyComponent get() {
    return (application as ComponentProvider).myComponent
}