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
}
