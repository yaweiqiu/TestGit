package com.example.ndkdemo

/**
 * @author qiuyawei
 * @createTime 2020/8/7 1:56 PM
 * @describe
 */
open class Cat : Animal {
    @Volatile
    var flag: Boolean = true
    override var name: String
        get() = "kite"
        set(value) {}
    override var age: Int
        get() = 0
        set(value) {}
    override var sex: Int
        get() = 0
        set(value) {}

    override fun walk() {
        while (flag) {
            System.out.println("${name} is walk !")
        }
    }

    fun stopWalk(stop:Boolean){
        this.flag = stop
    }

    override fun speak() {
        System.out.println("${name} is speak !")
    }

    open fun play(what: String) {
        System.out.println("play ${what}")
    }

    fun play(what: String, time: Long) {
        System.out.println("play ${what},how long $time")
    }


}