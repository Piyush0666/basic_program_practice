package com.bridgelabz.day4;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class linkedList1 {
    public static void main(String[] args) {
        LinkedList<Integer> obj = new LinkedList<>();
        obj.add(4);
        obj.add(22);
        obj.add(25);
        obj.add(2);
        obj.add(76);
        obj.add(43);
        obj.add(8);
        Collections.sort(obj);
        /*LinkedList<Integer> obj1 = new LinkedList<>();
        obj1 = (LinkedList) obj.clone();*/
        //Iterator <Integer > ll =obj.iterator();//here I am using iterator
       /* for (Integer i : obj1) {
            System.out.println(i);
        }
        System.out.println(obj1);
*/
       /* System.out.println("" +ll);
        System.out.println(ll.hasNext());
        System.out.println(ll.next());
    }*/
       // System.out.println(obj1);
    }
}

// Displaying the list