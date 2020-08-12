package com.example.ndkdemo

/**
 * @author qiuyawei
 * @createTime 2020/8/7 2:12 PM
 * @describe
 */
class BlueCat : Cat() {
    override
    fun play(what:String){
        System.out.println("BlueCat play $what")
    }
}