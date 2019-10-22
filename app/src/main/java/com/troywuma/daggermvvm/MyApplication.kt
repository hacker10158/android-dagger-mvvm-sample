package com.troywuma.daggermvvm

import com.troywuma.daggermvvm.di.AppComponent
import com.troywuma.daggermvvm.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

class MyApplication : DaggerApplication() {
    private var appComponent: AppComponent? = null

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        appComponent = DaggerAppComponent.builder().application(this).build()
        appComponent!!.inject(this)
        return appComponent!!
    }
}
