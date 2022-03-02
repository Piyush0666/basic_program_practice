package com.bridgelabz.day2;
/*
In fibonacci series, next number is the sum of previous
        two numbers for example 0, 1, 1, 2, 3, 5, 8,
        13, 21, 34, 55 etc. The first two numbers of
        fibonacci series are 0 and 1.
*/
public class fibonacciSeries {
    int a1 ;
    int a2 ;
    int temp;

    fibonacciSeries(int a1,int a2){
       this.a1=a1;
       this.a2 = a2;
    }
    public void calculateSeries(){
        System.out.println(a1 + "  " + a2);
        for (int i = 2; i < 10; i++) {
            temp = a1 + a2;
            System.out.println(" " + temp);
            a1 = a2;
            a2 = temp;
        }
    }
}