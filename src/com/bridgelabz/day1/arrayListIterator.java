package com.bridgelabz.day1;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class arrayListIterator {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Piyush");
        arr.add("Nikhil");
        arr.add("Akhil");
        arr.add("Rajiv");
        Collections.sort(arr);
        System.out.println(arr);
        //traversing thorough iterator
        Iterator ill = arr.iterator();//getting the iterator
        while(ill.hasNext()){//check if iterator has the elements
            System.out.println(ill.next());//printing the element and move to next
        }

    }
}


    /*Ways to iterate the elements of the collection in Java
    There are various ways to traverse the collection elements:

      1. By Iterator interface.
      2. By for-each loop.
      for(String fruit:list)
    System.out.println(fruit);
      3. By ListIterator interface.
      4. By for loop.
      5. By forEach() method.
      6. By forEachRemaining() method.*/