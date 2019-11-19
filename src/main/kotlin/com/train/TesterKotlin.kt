package com.train.kotlin

import java.util.*

fun main() {
    val ticket = Ticket(1000)
    val scanner = Scanner(System.`in`)
    println("Please enter number of tickets: ")
    val ticketNum = scanner.nextInt();
    println("How many round-trip tickets: ")
    val roundNum = scanner.nextInt();
    ticket.print(ticketNum,roundNum)
}

class Ticket(private val ticketAmount:Int){
    fun print(ticketNum:Int,roundNum:Int){
        val newTicketNum : Int = if (ticketNum > roundNum) ticketNum - roundNum else 0
        val total : Int = (newTicketNum * ticketAmount +
                (roundNum * ticketAmount * 1.8)).toInt()
        println("Total ticket: $ticketNum Round-trip: $roundNum Total: $total")
    }
}