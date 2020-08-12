package com.example.ndkdemo

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Example of a call to a native method
        sample_text.text = stringFromJNI()
//        val testBean = JSON.parseArray(Test.covertToJson(this),TestBean::class.java)
        var type = object : TypeToken<MutableList<TestBean>>() {}.type
        val data = Gson().fromJson<MutableList<TestBean>>(
            Test.covertToJson(this), type
        )
    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    external fun stringFromJNI(): String

//    external fun callStaticMethod(): Void

    companion object {
        // Used to load the 'native-lib' library on application startup.
        init {
            System.loadLibrary("native-lib")
        }
//        fun logMessage(msg: String?) {
//            Log.d("NDK", msg)
//        }
    }
}
