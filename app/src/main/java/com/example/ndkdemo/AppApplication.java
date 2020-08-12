package com.example.ndkdemo;

import android.app.Application;

/**
 * @author qiuyawei
 * @createTime 2020/7/28 11:07 AM
 * @describe
 */
public class AppApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        AppUtils.Companion.getInstance().init(this);
    }

    static {
        System.loadLibrary("native-lib");
    }
}
