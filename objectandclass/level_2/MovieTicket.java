package com.gla.objectandclass.level_2;

//Program to Model a Movie Ticket Booking System
//Problem Statement: Create a MovieTicket class with attributes movieName,
//        seatNumber, and price. Add methods to:
//        ● Book a ticket (assign seat and update price).
//        ● Display ticket details.
//        Explanation: The MovieTicket class organizes ticket information with attributes. The
//methods handle booking logic and display ticket details

public class MovieTicket {
    private String  movieName;
    private int     seatNumber;
    private double  price;
    private boolean isBooked;

    public MovieTicket(String movieName, double price) {
        this.movieName  = movieName;
        this.price      = price;
        this.seatNumber = 0;        // 0 means no seat assigned yet
        this.isBooked   = false;
    }

    public String  getMovieName()  { return movieName; }
    public int     getSeatNumber() { return seatNumber; }
    public double  getPrice()      { return price; }
    public boolean isBooked()      { return isBooked; }

    public void bookTicket(int seatNumber) {
        if (isBooked) {
            System.out.println("  Seat " + this.seatNumber + " is already booked for " + movieName + "!");
            return;
        }
        this.seatNumber = seatNumber;
        this.isBooked   = true;
        System.out.println("  Ticket booked successfully!");
        System.out.println("  Movie  : " + movieName);
        System.out.println("  Seat   : " + seatNumber);
        System.out.printf ("  Price  : Rs. %.2f%n", price);
    }

    public void cancelTicket() {
        if (!isBooked) {
            System.out.println("  No ticket is booked to cancel.");
            return;
        }
        System.out.println("  Ticket for seat " + seatNumber + " (" + movieName + ") has been cancelled.");
        this.seatNumber = 0;
        this.isBooked   = false;
    }

    public void displayTicketDetails() {
        System.out.println("  Movie Name  : " + movieName);
        System.out.println("  Seat Number : " + (isBooked ? seatNumber : "Not Assigned"));
        System.out.printf ("  Price       : Rs. %.2f%n", price);
        System.out.println("  Status      : " + (isBooked ? "BOOKED" : "AVAILABLE"));
    }

    public static void main(String[] args) {
        MovieTicket ticket1 = new MovieTicket("Pathaan",  250.00);
        MovieTicket ticket2 = new MovieTicket("Jawan",    300.00);

        System.out.println("=== Movie Ticket Booking System ===\n");

        System.out.println("--- Booking Ticket 1 ---");
        ticket1.bookTicket(12);

        System.out.println("\n--- Booking Ticket 2 ---");
        ticket2.bookTicket(7);

        System.out.println("\n--- Trying to double-book Ticket 1 ---");
        ticket1.bookTicket(5);

        System.out.println("\n--- Ticket 1 Details ---");
        ticket1.displayTicketDetails();

        System.out.println("\n--- Cancelling Ticket 2 ---");
        ticket2.cancelTicket();

        System.out.println("\n--- Ticket 2 Details After Cancellation ---");
        ticket2.displayTicketDetails();
    }
}
