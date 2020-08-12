package com.example.ndkdemo

import java.util.concurrent.Callable

/**
 * @author qiuyawei
 * @createTime 2020/8/12 1:52 PM
 * @describe
 */
class MyCallAble : Callable<String> {
    override fun call(): String {
        return Thread.currentThread().name
    }

    fun goWalk(){
        println("walk")
    }

    fun speak(){

    }
}

