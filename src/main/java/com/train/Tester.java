package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Ticket ticket = new Ticket(1000);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number of tickets: ");
        int ticketNum = scanner.nextInt();
        System.out.println("Please enter number of round-trip tickets: ");
        int roundNum = scanner.nextInt();
        ticket.print(ticketNum,roundNum);
    }
}
