package com.troywuma.daggermvvm.core.base

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.troywuma.daggermvvm.R
import com.troywuma.daggermvvm.core.MyPrint
import com.troywuma.daggermvvm.core.base.viewmodel.BaseViewModel

import javax.inject.Inject
import javax.inject.Named

import dagger.android.support.DaggerFragment
import kotlinx.android.synthetic.main.fragment_base.*

class BaseFragment : DaggerFragment() {

    private lateinit var viewModel: BaseViewModel

    @field:[Inject Named("base")]
    lateinit var viewModelFactory: ViewModelProvider.Factory

    @Inject
    lateinit var myPrint: MyPrint

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewModel = ViewModelProviders.of(this, viewModelFactory).get(BaseViewModel::class.java)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_base, container, false)
    }

    override fun onStart() {
        super.onStart()

        tv_hello_world.text = myPrint.print()
    }
}
