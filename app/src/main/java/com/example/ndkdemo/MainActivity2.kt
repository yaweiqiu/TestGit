package com.example.ndkdemo

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProvider.NewInstanceFactory
import androidx.lifecycle.ViewModelStore
import com.blankj.utilcode.util.ToastUtils
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    lateinit var adapter: ContactAdapter
    var list = ArrayList<ContactBean>()

    lateinit var homeViewModel: HomeViewModel


    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        homeViewModel = ViewModelProvider.NewInstanceFactory().create(HomeViewModel::class.java)
        btTest.setOnClickListener {
            homeViewModel.doWork()
        }

        homeViewModel.loading.observe(this, Observer {
            if (it) {
                ToastUtils.showShort("start loading")
            } else {
                ToastUtils.showShort("stop loading")
            }
        })
    }

}