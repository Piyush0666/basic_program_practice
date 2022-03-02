package com.bridgelabz.day2.Steam_API;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Methods
{
    public static void main(String[] args) {
        List<String> name = new ArrayList<>();
        name.add("Amit");
        name.add("Berlin");
        name.add("Anuj");
        name.add("kajal");
        name.add("Piyush");
        List <String> newName = name.stream().filter(e -> e.startsWith("A")).collect(Collectors.toList());
        System.out.println(newName);
        List<Integer> List2 = new ArrayList<>();
        List2.add(22);
        List2.add(33);
        List2.add(44);
        List2.add(8);
        List2.add(6);
        List2.add(5);
        List<Integer> newList2 = List2.stream().map(i -> i * i).collect(Collectors.toList());
        System.out.println(newList2);
        //for each method
        newList2.stream().forEach(System.out::println);
        //sort
        List2.stream().sorted().forEach(e-> {
            System.out.println("this is sorted method:: "+e);
        });


    }
}
