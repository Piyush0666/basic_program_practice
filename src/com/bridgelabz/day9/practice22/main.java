package com.bridgelabz.day9.practice22;

public class main
{
    public static void main(String[] args) {
        ListOfEmployees obj22 = new Employee();
        obj22.addRecord("Piyush",112);
        obj22.addRecord("Ramit", 1);
        obj22.addRecord("Pankaj", 2);
        obj22.addRecord("Nikhil", 4);
        obj22.addRecord("Rahul", 5);
        obj22.PrintRecord();
        obj22.getRecord();
    }
}
