package com.bridgelabz.day5;

public interface Drawable1
{
    void draw();
    static int cube(int x)
    {
        return x*x*x;
    }
}
class Rectangle1 implements Drawable1
{
    public void draw()
    {
        System.out.println("drawing rectangle");
    }
}
