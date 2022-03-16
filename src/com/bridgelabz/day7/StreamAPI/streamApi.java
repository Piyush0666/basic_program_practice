package com.bridgelabz.day7.StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class streamApi {
    public static void main(String[] args) {
        ArrayList<Integer> arraylist = new ArrayList<>();
        arraylist.add(2);
        arraylist.add(44);
        arraylist.add(33);
        arraylist.add(65);
        arraylist.add(54);
        arraylist.add(54);
        arraylist.add(543);
        arraylist.add(57);
        arraylist.add(49);
        arraylist.add(11);

//        int[] arr = {56,99,98,88};
//        Stream<Integer> stream = arraylist.stream();
//        System.out.println(stream.mapToInt(i -> i).min().getAsInt());
//        List<Integer> newStream = arraylist .stream().map(i -> i * i).collect(Collectors.toList());
//        System.out.println(newStream);

        //without using stream API
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        for (int i = 0; i < arraylist.size(); i++) {
            if (arraylist.get(i) % 2 == 0)
                even.add(arraylist.get(i));
            else
                odd.add(arraylist.get(i));
        }
        System.out.println(even);
        System.out.println(odd);
        //using stream API
//        List<Integer> collect = even.stream().filter(number -> number % 2 == 0).collect(Collectors.toList());
//        System.out.println(collect);
//        List<Integer> collect1 = odd.stream().filter(number -> number % 2 != 0).collect(Collectors.toList());
//        System.out.println(collect1);
        System.out.println(arraylist.stream().filter(number -> number % 2 == 0).findFirst().get());
        System.out.println(arraylist.stream().filter(number -> number % 2 != 0).findFirst().get());
        System.out.println(arraylist .stream().mapToInt(i->i).min());
        System.out.println(arraylist .stream().mapToInt(i->i).max());
        System.out.println(arraylist .stream().mapToInt(i->i).average());
        System.out.println(arraylist .stream().mapToInt(i->i).sum());
        arraylist .stream().mapToInt(i->i).sorted().forEach(System.out ::println);//here we can create pipeline
                                                                                  // for the stream

//OptionalInt min =list.stream().min(i->i).ifPresent(min-> System.out.println(min));
    }
}


