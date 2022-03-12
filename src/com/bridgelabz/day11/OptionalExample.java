package com.bridgelabz.day11;

import java.util.Optional;
//f Value is not Present
public class OptionalExample {
    public static void main(String[] args) {
        /*String[] str = new String[10];
        Optional<String> checkNull = Optional.ofNullable(str[5]);
        if(checkNull.isPresent()){  // check for value is present or not
            String lowercaseString = str[5].toLowerCase();
            System.out.print(lowercaseString);
        }else
            System.out.println("string value is not present");
    }*/
        //If Value is Present
        String[] str = new String[10];
        str[5] = "java8 feature use of optional class";// Setting value for 5th index
        Optional<String> checkNull = Optional.ofNullable(str[5]);
        if(checkNull.isPresent()){  // It Checks, value is present or not
            String lowercaseString = str[5].toLowerCase();
            System.out.print(lowercaseString);
        }else
            System.out.println("String value is not present");
    }
}
