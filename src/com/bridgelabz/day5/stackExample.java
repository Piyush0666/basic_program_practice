package com.bridgelabz.day5;

import java.util.Iterator;
import java.util.Stack;

public class stackExample
{
    public static void main(String[] args) {
        //declare and initialize a stack object
        Stack<String> stack = new Stack<>();
        stack.push("PUNE");
        stack.push("MUMBAI");
        stack.push("DELHI");
        System.out.println("Stack elements:");
        //get an iterator for the stack
        Iterator<String> iterator = stack.iterator();
        //traverse the stack using iterator in a loop and print each element
        while(iterator.hasNext()){
            System.out.print(iterator.next() + " ");


        }
    }
}