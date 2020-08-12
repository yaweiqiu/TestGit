package com.example.ndkdemo

/**
 * @author qiuyawei
 * @createTime 2020/8/7 1:54 PM
 * @describe
 */
interface Animal {
    var name: String
    var age: Int

    /**
     * 0 male
     * 1 woman
     */
    var sex: Int
    fun walk()
    fun speak()
}