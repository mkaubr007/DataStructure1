package com.biz.queue;
import java.util.Scanner;

public class QueueMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 to add element");
        System.out.println("Enter 2 to delete element");


        Queue queue=new Queue();
        switch (sc.nextInt()){
            case 1:
                queue.appendNode();
                break;
            case 2:
                queue.dequeue();
                break;
        }
    }
}
