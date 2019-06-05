package com.github.calo001.daggersharepreferences.interfaces

import com.github.calo001.daggersharepreferences.di.components.MyComponent

interface ComponentProvider {
    val myComponent: MyComponent
}