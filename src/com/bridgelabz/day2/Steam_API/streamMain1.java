package com.bridgelabz.day2.Steam_API;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class streamMain1
{
    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        list1.add(22);
        list1.add(33);
        list1.add(44);
        list1.add(8);
        list1.add(6);
        list1.add(5);
        // without using stream API
        List<Integer> list2 = new ArrayList<>();
        for(Integer i:list1){
            if(i %2 ==0 ){
                list2.add(i);
            }
        }
        System.out.println("normal arrayList of list1:: "+list1 );
        System.out.println("this is even number added in list2:: "+list2);

        // using java 8 Stream API to find even number;
        //collect= here using collect to collect the data from the list1 and
        /*Stream<Integer> stream1 = list1.stream();
        List<Integer> collect = stream1.filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println("using Stream API" + collect);*/

        //this is also another way to use Steam API to find even number;
        List<Integer> collect2 = list1.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println("using Steam API:: "+collect2);
    }
}
