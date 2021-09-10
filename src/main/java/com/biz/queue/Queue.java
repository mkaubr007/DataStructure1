package com.biz.queue;

import com.biz.linkedlist.LinkedList;
import com.biz.linkedlist.Node;

public class Queue {
    private Node top;
    private LinkedList linkedList;

    public Queue(){
        this.linkedList=new LinkedList();
    }
    public void appendNode() {
        linkedList.push(70);
        linkedList.push(30);
        top = linkedList.push(56);
        linkedList.print();
    }

    public void dequeue() {
        System.out.println("Before");
        appendNode();
        Node temp = top;
        while (temp != null) {
            linkedList.pop();
            temp = temp.next;
        }
        System.out.println("After");
        linkedList.print();
    }
}
