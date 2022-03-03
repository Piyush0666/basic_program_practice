package com.bridgelabz.day3;

import java.util.regex.*;

public class RegexDemo {
    public static void main(String[] args) {

        String Sentence = "abc is an abc also an aabbcc and aaabbbccc";

        Pattern pt = Pattern.compile("ab");
        Matcher mt = pt.matcher(Sentence);

        while(mt.find()) {
            System.out.println(mt.group());
        }
    }
}