package com.bridgelabz.day1;

import java.util.Scanner;

public class forLoop {
    public static void main(String[] args) {
        int marks;
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the marks:: ");
        marks = obj.nextInt();
        if(marks<50){
            System.out.println("D GRADE");
        }
        else if(marks>=50 && marks<60){
            System.out.println("C GRADE");
        }
        else if(marks>=60 && marks<70){
            System.out.println("B GRADE");
        }
        else if (marks>=70 && marks<80 ){
            System.out.println("A GRADE");
        }
        else if(marks>=80 && marks <100){
            System.out.println("A+");
        }
        else {
            System.out.println("ENTER THE VALID MARKS");
        }

    }
}
