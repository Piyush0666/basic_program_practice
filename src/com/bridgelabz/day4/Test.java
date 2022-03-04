package com.bridgelabz.day4;


public class Test {
    void show (int a){
        System.out.println("This is normal int method ");
    }

    void show(String a,int b){
        System.out.println("this is first method ");
    }

    void show(int a,int b){
        System.out.println("this is parametrised method");
    }
    String show (String a){
        System.out.println("STRING METHOD");
        return a;
    }
    void show (int...a){//this is varargs that support multiple values
        System.out.println("this is varargs that support multiple values"+a);
    }

    public static void main(int a){
        System.out.println("overload main method");
    }
    public static void main(String[] args) {
        System.out.println("this is main method");
        Test t = new Test();
        main(44);
        t.show('c',12);//in this condition parametrised method will
        // execute because of Automatic Promotion
        t.show("piyush");
        t.show(2,3,4,4);
        t.show(4);

    }
}
