package com.bridgelabz.day9.practice22;

import java.util.ArrayList;

public class Employee implements ListOfEmployees
{
    ArrayList<list> allList = new ArrayList<>();
    list list;
    @Override
    public void addRecord(String name,int id) {
        list = new list();
        list.setName(name);
        list.setId(id);
        allList.add(list);

    }
    public void PrintRecord(){
        System.out.println(allList);
    }

    public ArrayList<list> getRecord(){
        return allList;
    }
}
