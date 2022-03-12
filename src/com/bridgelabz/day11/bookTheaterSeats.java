package com.bridgelabz.day11;

public class bookTheaterSeats
{
    int totalSeats = 10;
   synchronized public void seatsBook(int seats){
        if (totalSeats >= seats){
            System.out.println(seats +" seat has been booked successfully");
            totalSeats=totalSeats-seats;
            System.out.println("total seats left:: " + totalSeats);
        }
        else {
            System.out.println("Seats can not be booked...!!! ");
            System.out.println("seats Left:: "+totalSeats);
        }
    }
}
//without using synchronized the output will different any the application will get collapsed
// data constancy problem will come so that is why we used synchronization
/* so this will be output
public void seatsBook(int seats){
        if (totalSeats >= seats){
            System.out.println(seats +" seat has been booked successfully");
            totalSeats=totalSeats-seats;
            System.out.println("total seats left:: " + totalSeats);
        }
        else {
            System.out.println("Seats can not be booked...!!! ");
            System.out.println("seats Left:: "+totalSeats);
        }
    }
7 seat has been booked successfully
        total seats left:: 3
        6 seat has been booked successfully
        total seats left:: -3
*/
//so if we want to fix that data consistency
// we need to use synchronized keyword to achieve synchronization
//after using synchronized keyword the output will be correct
/*synchronized public void seatsBook(int seats){
    if (totalSeats >= seats){
        System.out.println(seats +" seat has been booked successfully");
        totalSeats=totalSeats-seats;
        System.out.println("total seats left:: " + totalSeats);
    }
    else {
        System.out.println("Seats can not be booked...!!! ");
        System.out.println("seats Left:: "+totalSeats);
    }
}*/
//output will be
   /*     7 seat has been booked successfully
        total seats left:: 3
        Seats can not be booked...!!!
        seats Left:: 3
*/
