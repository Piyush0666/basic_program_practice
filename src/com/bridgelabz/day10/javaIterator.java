package com.bridgelabz.day10;

import java.util.ArrayList;
import java.util.Iterator;

public class javaIterator {
    public static void main(String[] args) {

        // Make a collection
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Maruti 800");

        // Get the iterator
        Iterator<String> t = cars.iterator();
        //Here, we are using lambda expression
        t.forEachRemaining(System.out::println);
        //System.out.println(it.hasNext());
//        for(String c:cars){
//            System.out.println(c);
//        }
//        for (String e : cars) {
//            System.out.println(it);
//        }
        //System.out.println(it);
    }

        // Print the first item
        //System.out.println(it.hasNext());//it will boolean value
    }