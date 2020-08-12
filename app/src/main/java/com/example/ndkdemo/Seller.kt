package com.example.ndkdemo

/**
 * @author qiuyawei
 * @createTime 2020/8/7 3:25 PM
 * @describe
 */
class Seller {
    lateinit var ticket: Ticket

    constructor(ticket: Ticket) {
        this.ticket = ticket
    }

    @Synchronized()
    fun sellTicket() {
        if (ticket.totalTickets == 0) {
            println("${Thread.currentThread().name}票卖完了呢")
            return
        }
        ticket.sellComplete()
        println("${Thread.currentThread().name}还剩：${ticket.totalTickets}张票")
    }
}