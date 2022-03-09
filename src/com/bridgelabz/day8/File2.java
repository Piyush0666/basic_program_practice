package com.bridgelabz.day8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class File2
{
    public static void main(String[] args) {
      /*  // Create new file
        File myFile = new File("myFirstFile.txt");
        try {
            myFile.createNewFile();
        } catch (IOException e) {
            System.out.println("Enable to create file");
            e.printStackTrace();
        }
        //write to a File
        try {
            FileWriter fileWriter = new FileWriter("myFirstFile.txt");
            fileWriter.write("this is first file");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Reading a file
        File myFile = new File("myFirstFile.txt");
        try {
            Scanner sc = new Scanner(myFile);
            while (sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        */
        //Deleting a file
        File myFile = new File("mySecondFile.txt");
        if(myFile.delete()){
            System.out.println("i have deleted: " + myFile.getName());
        }
        else {
            System.out.println("some problem occur while deleting the file");
        }


    }
}
