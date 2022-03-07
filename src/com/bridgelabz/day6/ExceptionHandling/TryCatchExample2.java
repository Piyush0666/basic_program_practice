package com.bridgelabz.day6.ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TryCatchExample2 {

    public static void main(String[] args) {


        PrintWriter pw;
        try {
            pw = new PrintWriter("jtp.txt"); //may throw exception
            pw.println("saved");
        }
// providing the checked exception handler
        catch (FileNotFoundException e) {

            System.out.println(e);
        }
        System.out.println("File saved successfully");
    }
}