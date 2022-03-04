package com.bridgelabz.day4;

public class TestFinallyBlock
{
    public static void main(String args[]){
       /* try{
//below code do not throw any exception
            int data=25/0;
            System.out.println(data);
        }
//catch won't be executed if we have no ArithmeticException.
        catch( ArithmeticException e){
            System.out.println("ArithmeticException" );
        }
//executed regardless of exception occurred or not
        finally {
            System.out.println("finally block is always executed");
        }

        System.out.println("rest of phe code...");
    }*/
    try{
//below code do not throw any exception
    int data=25/5;
    System.out.println(data);
}
//catch won't be executed if we have no ArithmeticException.
        catch( ArithmeticException e){
    System.out.println("ArithmeticException" );
}
//executed regardless of exception occurred or not
        finally {
    System.out.println("finally block is always executed");
}

        System.out.println("rest of phe code...");
}
}