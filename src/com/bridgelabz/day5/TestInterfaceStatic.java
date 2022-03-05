package com.bridgelabz.day5;

public class TestInterfaceStatic
{
    public static void main(String[] args)
    {
        Drawable1 d=new Rectangle1();
        d.draw();
        System.out.println(Drawable1.cube(3));
    }
}