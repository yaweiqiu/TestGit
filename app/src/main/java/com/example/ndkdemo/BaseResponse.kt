package com.example.ndkdemo

/**
 * @author qiuyawei
 * @createTime 2020/8/11 11:10 AM
 * @describe
 * code = 200 is correct
 */
data class BaseResponse<T>(var code: Int, var message: String,var data:T) {
}