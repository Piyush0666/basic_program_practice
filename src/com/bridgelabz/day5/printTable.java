package com.bridgelabz.day5;
/*
A class extends another class, an interface extends
 another interface, but a class implements an interface.
*/
public interface printTable{
    void print();
 }
class A6 implements printTable {
    public void print() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        A6 obj = new A6();
        obj.print();
    }
}