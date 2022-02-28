package com.bridgelabz.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class arrayIteratingCollection
{
    public static void main(String[] args) {
        ArrayList<String > arr = new ArrayList<>();
        arr.add("Piyush");
        arr.add("Nikhil");
        arr.add("Akhil");
        arr.add("Rajiv");
        Collections.sort(arr);
        System.out.println("for sorting"+arr);
        System.out.println("traversing through list iterator");
        // ListIterator <String > ill = arr.listIterator(arr.size());
       /* while (ill.hasNext()){
            String name = ill.previous();//this loop is for start from previous
            System.out.println(name);*/
        //--------------------------------------------------------------------
        ListIterator<String > ill = arr.listIterator();
        while (ill.hasNext()){
            System.out.println(ill.next());//this loop is for print element from start

        }
        ill.forEachRemaining(a-> //Here, we are using lambda expression
        {System.out.println("this is used for iterator"+ a);
        });
        arr.forEach(a->{System.out.println("this will be using Lambda expression " + a);});//Here, we are using
        // lambda expression

    }
}
