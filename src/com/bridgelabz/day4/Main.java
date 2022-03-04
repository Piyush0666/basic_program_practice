package com.bridgelabz.day4;

public class Main
{
    public static linkedList addElementAtStart() {

        linkedList List1 = new linkedList();
        List1.push(70);
        List1.push(30);
        List1.push(56);

        List1.print();
        return List1;
    }
    public static void addElementAtEnd() {
        linkedList List2 = new linkedList();
        List2.append(56);
        List2.append(30);
        List2.append(70);
        List2.print();
    }

    public static void main(String[] args) {
        Main.addElementAtStart();
        Main.addElementAtEnd();
    }
}
