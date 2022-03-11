package com.bridgelabz.day10;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
            //to create a File
//        File myObj = new File("filename.txt");
//        try {
//            myObj.createNewFile();
//        } catch (IOException e) {
//            System.out.println("Enable to create file");
//            e.printStackTrace();
//        }
        //to read a file
        try{
        File myObj = new File("filename.txt");
        Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        File myObj = new File("filename1.txt");
        try {
            myObj.createNewFile();
        } catch (IOException e) {
            System.out.println("Enable to create file");
            e.printStackTrace();
        }
        //to delete (first create the file and then by same file name delete that file)
        File myObj1 = new File("filename1.txt");
        if (myObj.delete()) {
            System.out.println("Deleted the file: " + myObj.getName());
        } else {
            System.out.println("Failed to delete the file.");//OUTPUT Deleted the file: filename1.txt
        }
    }

}
