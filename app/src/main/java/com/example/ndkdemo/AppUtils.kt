package com.example.ndkdemo

/**
 * @author qiuyawei
 * @createTime 2020/7/31 3:26 PM
 * @describe
 */
class AppUtils {
    private constructor()

    private var appApplication: AppApplication? = null

    companion object {
        private var instance: AppUtils? = null
        fun getInstance(): AppUtils {
            if (instance == null) {
                instance = AppUtils()
            }
            return instance!!
        }
    }

    public fun init(application: AppApplication) {
        appApplication = application
    }

    public fun getApplication():AppApplication {
        return appApplication!!
    }
}