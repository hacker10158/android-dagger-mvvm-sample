package com.troywuma.daggermvvm.core

import android.content.Context
import com.troywuma.daggermvvm.R

class MyPrintImpl(private val context: Context) : MyPrint {
    override fun print(): String {
        return context.getString(R.string.app_name)
    }
}