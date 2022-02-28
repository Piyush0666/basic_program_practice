package com.bridgelabz.day1;
//created program using constructor
public class BasicConcept
{
    int a;
    int b;
    int c;
    BasicConcept(int a,int b, int c){
        this.a =a;
        this.b =b;
        this.c =c;
    }
    public void addMethod(){
        c = a + b;
        System.out.println("total sum "+c);
    }
    public static void main(String[] args) {
        BasicConcept obj = new BasicConcept(22,33,55);
        obj.addMethod();
    }

}
