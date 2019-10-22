package com.troywuma.daggermvvm.di

import com.troywuma.daggermvvm.core.base.BaseFragment
import com.troywuma.daggermvvm.core.base.di.BaseModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class MainActivityModule {
    @ContributesAndroidInjector(modules = [BaseModule::class])
    internal abstract fun provideBaseFragment(): BaseFragment
}
