package com.bridgelabz.day3;

public class Inheritance
{
    int a=12;
    int b =33;

}
class b extends Inheritance{
    int salary =22;

    public static void main(String[] args) {
        b obj  = new b();
        System.out.println( "" +obj.a);
        System.out.println("  "+obj.b );
        System.out.println(obj.salary);
    }

}

