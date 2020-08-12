package com.example.ndkdemo

import android.content.Context
import androidx.lifecycle.*
import com.blankj.utilcode.util.LogUtils
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.merge
import java.util.concurrent.ForkJoinPool
import kotlin.random.Random

/**
 * @author qiuyawei
 * @createTime 2020/7/31 2:03 PM
 * @describe
 */
const val TAG = "HomeViewModel"

class HomeViewModel : AndroidViewModel(AppUtils.getInstance().getApplication()) {
    val loginResult = MutableLiveData<String>()
    val loading = MutableLiveData<Boolean>()
    fun login(name: String, pwd: String) {
        loading.value = true
        viewModelScope.launch {
            val asy1 = async {
                //切换到工作线程执行网络请求，属于耗时操作
                val value1 = withContext(Dispatchers.IO) {
                    delay(4000)
                    LogUtils.i(TAG, "value1执行完毕")
                    100
                }
            }

            val asy2 = async {
                val value2 = withContext(Dispatchers.IO) {
                    delay(2000)
                    LogUtils.i(TAG, "value2执行完毕")
                    200
                }
            }
            asy1.await()
            LogUtils.i(TAG, "ALL执行完毕")
            loginResult.postValue("value:")
            loading.value = false
        }
    }

    /**
     * 多图上传
     */
    fun manyImageUploads(pics: MutableList<String>) {
        viewModelScope.launch {
            val asynList = mutableListOf<Deferred<Unit>>()
            for (i in 0 until pics.size) {
                val result = async {
                    uploadSimpleImage(pics[i])
                }
                asynList.add(result)
            }
            asynList.awaitAll()
            LogUtils.i(TAG, "end upload")
        }
    }

    suspend fun uploadSimpleImage(pic: String) {
        val time = Random.nextInt(10).toLong() * 1000
        delay(time)
        LogUtils.i(TAG, "pic:" + pic + "_time:" + time)
    }


    fun doWork() {
        loading.value = true
        viewModelScope.launch {
            //耗时任务
            withContext(Dispatchers.IO) {
                delay(3000)
                loading.postValue(false)
            }
        }

    }
}