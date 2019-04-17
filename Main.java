package com.hristodaskalov;

import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
	    Theatre theatre = new Theatre("Olympian", 8, 12);

	    boolean quit = false;
	    int choice;
	    do{
	        printMenu();
            System.out.println("Enter choice: ");
            choice = scan.nextInt();
            scan.nextLine();
	        switch (choice){
                case 1:
                    reserveSeat(theatre);
                    break;
                case 2:
                    getSeats(theatre);
                    break;
                case 3:
                    cancelSeat(theatre);
                    break;
                case 4:
                    quit = true;
                    break;
            }
        } while (!quit);
    }

    private static void reserveSeat(Theatre theatre)
    {
        System.out.println("Enter seat you wish to reserve: ");
        String seat = scan.nextLine();
        theatre.reserveSeat(seat);
    }

    private static void getSeats(Theatre theatre){
        theatre.getFreeSeats();
    }

    private static void cancelSeat(Theatre theatre){
        System.out.println("Enter seat you wish to cancel: ");
        String seat = scan.nextLine();
        theatre.cancelSeat(seat);
    }

    private static void printMenu(){
        System.out.println(
                "1. Reserve seats\n" +
                "2. Get free seats\n" +
                "3. Cancel seat\n" +
                "4. Quit");
    }
}
