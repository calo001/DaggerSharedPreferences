package com.github.calo001.daggersharepreferences.di.modules

import android.content.Context
import android.content.SharedPreferences
import com.github.calo001.daggersharepreferences.utils.Constants
import dagger.Module
import dagger.Provides

@Module
class SharePreferencesModule (val context: Context) {
    @Provides
    fun provideSharedPreferences(): SharedPreferences =
        context.getSharedPreferences(Constants.SP_FILE, Context.MODE_PRIVATE)
}