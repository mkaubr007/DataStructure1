package com.biz.linkedlist;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class LinkedListMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 to add element at the start");
        System.out.println("Enter 2 to add element at the end");

        switch (sc.nextInt()){
            case 1:
                Operations.addElementAtStart();
                break;
            case 2:
                Operations.addElementAtEnd();
        }
    }
}

