package com.bridgelabz.day5;

import java.util.Iterator;
import java.util.Stack;
import java.util.stream.Stream;
//here I am using stack,foreach loop,Iterator and lambda EXPRESSION.

public class stackStream  {
    public static void main(String[] args) {
        //declare and initialize a stack object
        Stack<String> stack = new Stack<>();
        stack.push("DELHI");
        stack.push("HARYANA");
        stack.push("PUNJAB");

        System.out.println("Stack elements using Java 8 forEach:");
        //get a stream for the stack
        Stream<String> obj = stack.stream();
        //traverse though obj object using forEach construct of Java 8
        obj.forEach((element) -> {System.out.print(element + " ");}); // print element
        System.out.println("\nStack elements using Java 8 forEachRemaining:");
        //define an iterator for the stack
        Iterator<String> stackIterator = stack.iterator();
        //use forEachRemaining construct to print each stack element
        stackIterator.forEachRemaining(val -> {System.out.print(val + " ");});
    }
}