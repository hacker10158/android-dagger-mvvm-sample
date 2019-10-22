package com.troywuma.daggermvvm

import android.os.Bundle
import androidx.fragment.app.Fragment
import com.troywuma.daggermvvm.core.MyPrint
import com.troywuma.daggermvvm.core.PrintObject
import com.troywuma.daggermvvm.core.base.BaseFragment
import dagger.android.support.DaggerAppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showFragment(BaseFragment())
    }

    private fun showFragment(fragment: Fragment) {

        val ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.fl_fragment_container, fragment, fragment.javaClass.name)
        ft.commitAllowingStateLoss()
    }
}
