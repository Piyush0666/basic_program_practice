package com.bridgelabz.day5;

 interface A{
    void a();//by default, public and abstract
    void b();
    void c();
    void d();
}

//Creating abstract class that provides the implementation of one method of A interface
abstract class B implements A{
    public void c(){System.out.println("this is C");}
}

//Creating subclass of abstract class, now we need to provide the implementation of rest of the methods
class M extends B{
    public void a(){System.out.println("this is a");}
    public void b(){System.out.println("this is b");}
    public void d(){System.out.println("this is d");}
}

//Creating a test class that calls the methods of A interface
public class testMain{
    public static void main(String args[]){
        A a=new M();
        a.a();
        a.b();
        a.c();
        a.d();
    }}