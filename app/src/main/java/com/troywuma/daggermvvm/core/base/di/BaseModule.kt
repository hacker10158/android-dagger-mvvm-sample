package com.troywuma.daggermvvm.core.base.di

import android.content.Context
import androidx.lifecycle.ViewModelProvider
import com.troywuma.daggermvvm.core.MyPrint
import com.troywuma.daggermvvm.core.MyPrintImpl
import com.troywuma.daggermvvm.core.base.viewmodel.BaseViewModel
import com.troywuma.daggermvvm.core.utility.ViewModelProviderFactory
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class BaseModule {

    @Provides
    fun provideMyPrint(context : Context): MyPrint {
        return MyPrintImpl(context)
    }

    @Provides
    fun provideBaseViewModel(): BaseViewModel {
        return BaseViewModel()
    }

    @Provides
    @Named("base")
    internal fun provideBaseViewModelProviderFactory(viewModel: BaseViewModel): ViewModelProvider.Factory {
        return ViewModelProviderFactory(viewModel)
    }
}