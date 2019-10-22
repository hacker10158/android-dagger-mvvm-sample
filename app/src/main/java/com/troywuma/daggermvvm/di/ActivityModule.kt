package com.troywuma.daggermvvm.di

import com.troywuma.daggermvvm.MainActivity
import com.troywuma.daggermvvm.di.scope.MainScope
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityModule {

    @MainScope
    @ContributesAndroidInjector(modules = [MainActivityModule::class])
    internal abstract fun bindMainActivity(): MainActivity
}
