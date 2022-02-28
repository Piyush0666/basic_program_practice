package com.bridgelabz.day1;

//Test class to show the values of objects
public class TestStaticVariable1 {
    public static void main(String args[]) {
        StaticVariable s1 = new StaticVariable(111, "Karan");
        StaticVariable s2 = new StaticVariable(222, "Aryan");
        //we can change the college of all objects by the single line of code
        //Student.college="BBDIT";
        s1.display();
        s2.display();
    }
}
