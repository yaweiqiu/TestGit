package com.example.ndkdemo;

import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.List;

/**
 * @author qiuyawei
 * @createTime 2020/7/27 2:55 PM
 * @describe
 */
class TypeTokenUtils {
    public static Type getType(){
        return new TypeToken<List<TestBean>>(){}.getType();
    }
}
