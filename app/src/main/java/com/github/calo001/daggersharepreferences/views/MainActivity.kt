package com.github.calo001.daggersharepreferences.views

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.github.calo001.daggersharepreferences.R
import com.github.calo001.daggersharepreferences.utils.MySharePreferences
import com.github.calo001.daggersharepreferences.utils.sharePrefComponent
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var mSharedPreferences: MySharePreferences
    val PS_DATA: String = "number"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sharePrefComponent.inject(this)
        initCount()
    }

    private fun initCount() {
        val number = mSharedPreferences.getData(PS_DATA)
        txtNumber.text = number.toString()
    }

    fun addOne(view: View) {
        var newNum: Int? = txtNumber.text.toString().toInt()
        newNum?.let {
            newNum++
            txtNumber.text = newNum.toString()
            mSharedPreferences.putData(PS_DATA, newNum)
        }
    }
}
