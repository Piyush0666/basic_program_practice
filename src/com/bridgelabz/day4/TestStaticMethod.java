package com.bridgelabz.day4;
    /*HERE I AM USING STATIC VARIABLE AND CHANGING TH VALUE
     OF THAT VARIABLE USING METHOD change();*/
class Student{
    int rollno;
    String name;
    static String college = "ADVANCE";
    //static method to change the value of static variable
    /*static void change(){
        college = "DITMR";
    }*/
    //constructor to initialize the variable
    Student(int r, String n){
        rollno = r;
        name = n;
    }
    //method to display values
    void display(){System.out.println(rollno+" "+name+" "+college);}
}
//Test class to create and display the values of object
public class TestStaticMethod{
    public static void main(String args[]){
        //Student.change();//calling change method
        //creating objects
        Student s1 = new Student(111,"PIYUSH");
        Student s2 = new Student(222,"SOHIL");
        Student s3 = new Student(333,"NIKHIL");
        //calling display method
        s1.display();
        s2.display();
        s3.display();
    }
}
