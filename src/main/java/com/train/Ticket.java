package com.train;

public class Ticket {
    private int ticketAmout;

    public Ticket(int ticketAmout) {
        this.ticketAmout = ticketAmout;
    }

    public void print(int ticketNum, int roundNum){
        int newTicket = 0;
        int total = 0;
        if(roundNum < ticketNum){
            newTicket = ticketNum - roundNum;
        }
        total = (int) (newTicket * ticketAmout + (roundNum * ticketAmout * 1.8));
        System.out.println("Total ticket: " + ticketNum + " Round-trip: " + roundNum +
                " Total: " + total);;
    }
}
