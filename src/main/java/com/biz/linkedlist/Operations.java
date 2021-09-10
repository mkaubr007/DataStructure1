package com.biz.linkedlist;

public class Operations {

    public static LinkedList addElementAtStart() {
        LinkedList linkedList = new LinkedList();
        linkedList.push(70);
        linkedList.push(30);
        linkedList.push(56);

        linkedList.print();
        return linkedList;
    }
    public static void addElementAtEnd() {
        LinkedList linkedList = new LinkedList();
        linkedList.append(56);
        linkedList.append(30);
        linkedList.append(70);
        linkedList.print();
    }

    public static void insertNodeInBetween() {
        LinkedList linkedList = new LinkedList();
        Node secondNode = linkedList.push(70);
        Node firstNode = linkedList.push(56);

        Node newNode = new Node(30);
        linkedList.print();
        linkedList.insertInBetween(firstNode, newNode);
        linkedList.print();

    }
    public static void deleteFirstNode() {
        LinkedList linkedList = addElementAtStart();
        Node deletedNode = linkedList.pop();
        System.out.println("Delete Node is" + deletedNode.data);
        linkedList.print();

    }
    public static void deleteLastNode() {
        System.out.println("before");
        LinkedList linkedList = addElementAtStart();
        linkedList.popLast();
        System.out.println("After");
        linkedList.print();

    }

    public static void findNodeBaseOnValue() {
        LinkedList linkedList = addElementAtStart();
        linkedList.searchNode(30);
    }
    public static void insertNode() {
        LinkedList linkedList = new LinkedList();
        Node fourthNode = linkedList.push(70);
        Node secondNode = linkedList.push(30);
        Node firstNode = linkedList.push(56);

        Node newNode = new Node(40);
        linkedList.print();
        linkedList.insertInBetween(secondNode, newNode);
        linkedList.print();

    }
}
