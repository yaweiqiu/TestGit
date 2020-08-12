package com.example.ndkdemo

import java.util.concurrent.Callable

/**
 * @author qiuyawei
 * @createTime 2020/8/12 1:49 PM
 * @describe
 */
class MyThread :Runnable {
    override fun run() {
        Thread.sleep(3000)
        println(Thread.currentThread().name)
    }
}