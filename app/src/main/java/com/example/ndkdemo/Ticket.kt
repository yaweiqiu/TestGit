package com.example.ndkdemo

import java.util.concurrent.locks.Lock

/**
 * @author qiuyawei
 * @createTime 2020/8/7 3:13 PM
 * @describe 火车票仓库
 */
class Ticket {
    @Volatile
    var totalTickets: Int = 10


    /**
     * 买票完成了
     */
    @Synchronized()
    fun sellComplete() {
        totalTickets--
    }
}