package com.bridgelabz.day11;

public class movieBookApp extends Thread
{
    static bookTheaterSeats b;//here I created the reference b
    int seats;
    public void run(){
        b.seatsBook(seats);
    }

    public static void main(String[] args) {
        b= new bookTheaterSeats();
        movieBookApp firstPerson = new movieBookApp();
        firstPerson.seats=7;
        firstPerson.start();
        movieBookApp secondPerson = new movieBookApp();
        secondPerson.seats = 6;
        secondPerson.start();



    }
}
