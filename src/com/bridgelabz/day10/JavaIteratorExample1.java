package com.bridgelabz.day10;

import java.util.ArrayList;
import java.util.Iterator;

public class JavaIteratorExample1
{

    public static void main(String[] args)
    {
        ArrayList<String> cityNames = new ArrayList<>();

        cityNames.add("Delhi");
        cityNames.add("Mumbai");
        cityNames.add("Kolkata");
        cityNames.add("Chandigarh");
        cityNames.add("Noida");

        // Iterator to iterate the cityNames
        Iterator<String> iterator = cityNames.iterator();

        System.out.println("CityNames elements:: ");

        while (iterator.hasNext())
            System.out.print(iterator.next() + " ");

        System.out.println();
    }
}