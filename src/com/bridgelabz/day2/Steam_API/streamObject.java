package com.bridgelabz.day2.Steam_API;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class streamObject
{
    public static void main(String[] args) {
         //Stream API -collection process
        //collection/group of object
        //1-way
        Stream<Object> emptyStream = Stream.empty(); //here is pass "empty" object;
        //2-Array,Object,Collection.
        String name[] ={"Piyush","Nikhil","Pankaj","Ramit","Divya"};
        Stream<String> name1 = Stream.of(name);
        name1.forEach(System.out::println);
        //here we are putting child ArraysList object(list2) into parent class list object;
        List<Integer> list2 = new ArrayList<>();
        list2.add(22);
        list2.add(33);
        list2.add(44);
        list2.add(8);
        list2.add(6);
        list2.add(5);
        Stream<Integer> streamObj = list2.stream();
        streamObj.forEach(System.out::println);
    }
}
