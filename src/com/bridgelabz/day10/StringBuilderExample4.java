package com.bridgelabz.day10;
//4) StringBuilder delete() method
public class StringBuilderExample4{
    public static void main(String args[]){
        StringBuilder sb=new StringBuilder("Hello");
        sb.delete(1,3);
        System.out.println(sb);//prints Hlo
    }
}
