package com.bridgelabz.day1;


import java.util.ArrayList;
import java.util.Collections;

public class Array{
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(22);
        al.add(23);
        al.add(24);
        al.add(25);
        al.add(26);
        al.add(27);
        al.remove(2);
        al.add(0,44);
        Collections.sort(al);
        System.out.println(al+"this will sort the element");
        System.out.println("ArrayList after add operation:");
        for(Integer str:al)
            System.out.println(str);
    }
}