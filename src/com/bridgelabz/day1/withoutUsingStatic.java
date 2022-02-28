package com.bridgelabz.day1;

//Java Program to demonstrate the use of an instance variable
//which get memory each time when we create an object of the class.
public class withoutUsingStatic {
    int count=0;//will get memory each time when the instance is created

    withoutUsingStatic(){
        count++;//incrementing value
        System.out.println(count);
    }

    public static void main(String args[]){
        //Creating objects
        withoutUsingStatic c1=new withoutUsingStatic();
        withoutUsingStatic c2=new withoutUsingStatic();
        withoutUsingStatic c3=new withoutUsingStatic();
    }
}
