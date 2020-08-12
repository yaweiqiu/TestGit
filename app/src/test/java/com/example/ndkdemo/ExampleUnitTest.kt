package com.example.ndkdemo

import android.icu.text.RelativeDateTimeFormatter
import kotlinx.coroutines.delay
import org.junit.Test

import org.junit.Assert.*
import org.junit.rules.Timeout
import java.util.*
import java.util.concurrent.Executors
import java.util.concurrent.Future
import java.util.concurrent.TimeUnit
import kotlin.collections.ArrayList

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        println(Math.sqrt(2.0))
    }

    @Test
    fun sellTick() {
        calculate(10, 20, 30) {
            println(it)
        }
    }

    @Test
    fun testObserver() {
        var children1 = Children("zhangSan", 10)
        var children2 = Children("LiSi", 20)
        var father = Father()
        father.registerObserver(children1)
        father.registerObserver(children2)
        father.notifyChild()
    }

    @Test
    fun testThread() {
        var futures = ArrayList<Future<*>>()
        var flag = false
        val executorService = Executors.newFixedThreadPool(5)
        var startTime = System.currentTimeMillis()
        for (i in 0 until 7) {
            var future = executorService.submit(MyCallAble())
            futures.add(future)
        }

        while (!flag) {
            for (i in 0 until futures.size) {
                flag = futures[i].isDone
                println(futures[i].get())
            }
            if (flag) {
                println("all task finished")
                println("costTime is ${System.currentTimeMillis()-startTime}")
            }
        }


        //设置主线程超时时间
        Thread.sleep(10000)
    }


    fun calculate(a: Int, b: Int, x: Int, callBack: (value: Int) -> Unit) {
        callBack(decrease(add(a, b), x))
    }

    fun add(a: Int, b: Int): Int {
        return a + b
    }

    fun decrease(a: Int, b: Int): Int {
        return a - b
    }
}