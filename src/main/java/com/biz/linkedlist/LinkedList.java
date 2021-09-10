package com.biz.linkedlist;

public class LinkedList{
    Node head;
    Node tail;
    public Node push(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            Node temp = head;
            this.head = newNode;
            newNode.next = temp;
        }
        return newNode;
    }
    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            this.tail.next = newNode;
            tail = newNode;
        }
    }
    public void insertInBetween(Node prevNode, Node newNode) {
        Node tempNode = prevNode.next;
        prevNode.next = newNode;
        newNode.next = tempNode;
    }
    public Node pop() {
        Node tempNode = this.head;
        this.head = this.head.next;
        return tempNode;
    }
    public void popLast() {
        Node tempNode = head;
        while (!tempNode.next.equals(tail)) {
            tempNode = tempNode.next;
        }
        this.tail = tempNode;
        tempNode.next = null;
    }
    public void searchNode(int value) {
        Node tempNode = head;
        int index = 1;
        boolean flag = false;
        if (head == null)
            System.out.println("List is empty");
        else {
            while (tempNode != null) {
                if (tempNode.data == value) {
                    flag = true;
                    break;
                }
                index++;
                tempNode = tempNode.next;
            }
        }
        if (flag == true) {
            System.out.println(value + " is present at " + index);
        } else {
            System.out.println("Element is not present");
        }

    }
    public void print() {
        if (head == null) {
            System.out.println("Linked list is Empty");
            return;
        } else {
            Node temp = head;
            while (temp != null) {
                if (temp.next != null)
                    System.out.print(temp.data + " -> ");
                else
                    System.out.print(temp.data);
                temp = temp.next;
            }
            System.out.println();
        }
    }
}
