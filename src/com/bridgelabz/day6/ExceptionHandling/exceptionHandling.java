package com.bridgelabz.day6.ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;


public class exceptionHandling {
    public static void main(String[] args) throws FileNotFoundException {
        readFile("abc.txt") ;


    }

    public static void readFile(String fileName) throws FileNotFoundException { //when we use throws we
                                                             // don't need to write try catch block
/*        try {
            FileReader obj = new FileReader(fileName);
        } catch (FileNotFoundException e) {
            System.out.println("Enter correct file name");
        } finally {
            System.out.println("this final block always execute");
        }
 */
        FileReader obj = new FileReader(fileName);

    }

}
