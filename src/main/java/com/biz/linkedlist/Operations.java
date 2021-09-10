package com.biz.linkedlist;

public class Operations {
    public static void main(String[] args) {
        Operations.addElement();
    }
    public static LinkedList addElement() {
        LinkedList linkedList = new LinkedList();
        linkedList.push(70);
        linkedList.push(30);
        linkedList.push(56);

        linkedList.print();
        return linkedList;

    }
}
