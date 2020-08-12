package com.example.ndkdemo

import android.content.Context
import android.util.Log
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader

/**
 * @author qiuyawei
 * @createTime 2020/7/27 1:58 PM
 * @describe
 */
object Test {
    init {
        System.out.println("class loader init")
    }
    fun covertToJson(context: Context): String {
        var jsonStr: String? = ""
        val stringBuilder = StringBuilder()
        try {
            val assetManager = context.assets
            val inputStreamReader =
                InputStreamReader(assetManager.open("name.json"))
            val bufferedReader = BufferedReader(inputStreamReader)
            while (bufferedReader.readLine().also { jsonStr = it } != null) {
                stringBuilder.append(jsonStr)
            }
            bufferedReader.close()
            inputStreamReader.close()
            Log.i("Test", "json:$stringBuilder")
        } catch (e: IOException) {
            e.printStackTrace()
        } finally {
            return stringBuilder.toString()
        }
    }
}