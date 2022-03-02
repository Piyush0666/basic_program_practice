package com.bridgelabz.day2;

import java.util.Arrays;

/*
 An anagram is a word or phrase formed by
rearranging the letters of a different word or phrase.
*/
public class anagram {

    public static void main(String[] args) {
        String a = "PEEK";
        String b = "KEEP";
        char x[] = a.toCharArray();
        char y[] = b.toCharArray();
        Arrays.sort(x);
        Arrays.sort(y);
        boolean result = Arrays.equals(x, y);

        if (result == true) {
            System.out.println("this " + a + " and " + b + " String is a anagram");
        } else {
            System.out.println("this string is not anagram");
        }
    }
}