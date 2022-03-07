package com.bridgelabz.day6.ExceptionHandling;

public class Exceptions
{
    public static void main(String[] args) {
        printValue(Integer.parseInt("piyush"));
        /*try {
            int value = Integer.parseInt("pant");//by this pant it NumberFormatException will come
        }
        catch (NumberFormatException e){
            System.out.println("please enter the Integer value");

        }
        finally {
            System.out.println("this is final block");
        }*/
    }
    public static void printValue(int value ){
        System.out.println("value:: " +value);

    }
}
