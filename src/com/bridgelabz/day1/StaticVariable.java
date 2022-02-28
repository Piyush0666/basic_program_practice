package com.bridgelabz.day1;

public class StaticVariable {
    int rollno;//instance variable
    String name;
    static String college ="ITS";//static variable
    //constructor
    StaticVariable(int r, String n){
        rollno = r;
        name = n;
    }
    //method to display the values
    void display (){System.out.println(rollno+" "+name+" "+college);}
}
