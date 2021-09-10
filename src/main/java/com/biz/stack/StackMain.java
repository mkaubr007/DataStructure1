package com.biz.stack;

import java.util.Scanner;

public class StackMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 to add element");
        System.out.println("Enter 2 to get peek element");


        Stack stack=new Stack();

        switch (sc.nextInt()){
            case 1:
                stack.push();
                break;
            case 2:
                stack.peek();
                break;
        }
    }
}
