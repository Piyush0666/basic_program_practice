package com.bridgelabz.day3;

import java.util.regex.*;

public class RegexDemoS {

    public static void main(String[] args) {
        String sentence = "bbbabbbbabbcacc";
        String [] st = sentence.split("a");
        //for(String s: st)
        //System.out.println(s);

        Pattern pt = Pattern.compile("a");
        String [] st2 = pt.split(sentence);
        for(String s: st2)
            System.out.println(s);

    }
}