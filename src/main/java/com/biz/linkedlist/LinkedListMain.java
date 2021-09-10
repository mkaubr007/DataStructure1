package com.biz.linkedlist;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class LinkedListMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 to add element at the start");
        System.out.println("Enter 2 to add element at the end");
        System.out.println("Enter 3 to add element at the Middle");
        System.out.println("Enter 4 to delete first element");
        System.out.println("Enter 5 to delete last element");

        switch (sc.nextInt()){
            case 1:
                Operations.addElementAtStart();
                break;
            case 2:
                Operations.addElementAtEnd();
                break;
            case 3:
                Operations.insertNodeInBetween();
                break;
            case 4:
                Operations.deleteFirstNode();
                break;
            case 5:
                Operations.deleteLastNode();
                break;
        }
    }
}

