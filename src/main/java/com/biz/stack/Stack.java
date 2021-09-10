package com.biz.stack;

import com.biz.linkedlist.LinkedList;
import com.biz.linkedlist.Node;

public class Stack {
    private Node top;
    private LinkedList linkedList;

    public Stack() {
        this.linkedList = new LinkedList();
    }

    public void push() {
        linkedList.push(70);
        linkedList.push(30);
        top = linkedList.push(56);
        linkedList.print();
    }
    public int peek() {
        push();
        System.out.println("Top element is " + this.top.data);
        return this.top.data;
    }
}
