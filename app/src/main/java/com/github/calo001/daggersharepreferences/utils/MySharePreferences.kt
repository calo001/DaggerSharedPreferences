package com.github.calo001.daggersharepreferences.utils

import android.content.SharedPreferences
import javax.inject.Inject

class MySharePreferences @Inject constructor(val mSharedPreferences: SharedPreferences){
    fun putData(key: String, data: Int) = mSharedPreferences.edit().putInt(key, data).apply()
    fun getData(key: String): Int = mSharedPreferences.getInt(key, 0)
}