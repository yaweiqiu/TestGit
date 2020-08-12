package com.example.ndkdemo

/**
 * @author qiuyawei
 * @createTime 2020/7/27 2:24 PM
 * @describe
 */
data class TestBean(var name: String = "", var age: Int = 0) {
    override fun equals(other: Any?): Boolean {
        if (other is TestBean){
            val ob = other as TestBean
            return ob.age == age
        }else{
            return false
        }
    }
}