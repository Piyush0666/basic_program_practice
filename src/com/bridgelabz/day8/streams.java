package com.bridgelabz.day8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class streams
{
    public static void main(String[] args) {
        ArrayList<Integer > arrayList = new ArrayList<>();
        arrayList.add(23);
        arrayList.add(77);
        arrayList.add(47);
        arrayList.add(54);
        arrayList.add(66);
        arrayList.add(6);
        arrayList.add(8);
        arrayList.stream().mapToInt(i -> i).sorted().forEach(System.out::println);
        List<Integer> collect = arrayList.stream().filter(number -> number % 2 == 0).collect(Collectors.toList());
        System.out.println(collect);
        arrayList.stream().mapToDouble(i -> i).sorted().forEach(System.out::println);

//        Function<Integer , Double> toDouble = Integer::doubleValue;
//        arrayList.stream().map(toDouble).sorted().forEach(System.out::println);

    }
}
