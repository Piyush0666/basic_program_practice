package com.bridgelabz.day9;
//without using lambda Expression
//interface Drawable{
//    public void draw();
//}
//public class LambdaExpression {
//    public static void main(String[] args) {
//        int width=10;
//
//        //without lambda, Drawable implementation using anonymous class
//        Drawable d=new Drawable(){
//            public void draw(){System.out.println("Drawing "+width);}
//        };
//        d.draw();
//    }
//}

//using lambda Expression
@FunctionalInterface
interface Drawable{
     void draw();
}

public class LambdaExpression {
    public static void main(String[] args) {
        int width=10;

        //with lambda
        Drawable d2=()->{
            System.out.println("Drawing "+width);
        };
        d2.draw();
    }
}