package com.mycompany.pt1_continuation;

public class Doubly {

    private class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    private Node head;
    private Node tail;


    public void insertEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }


    public void insertBeginning(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }


    public void insertAt(int data, int position) {
        if (position == 0) {
            insertBeginning(data);
            return;
        }
        Node temp = head;
        for (int i = 0; temp != null && i < position - 1; i++) {
            temp = temp.next;
        }
        if (temp == null) return;

        Node newNode = new Node(data);
        newNode.next = temp.next;
        newNode.prev = temp;

        if (temp.next != null) temp.next.prev = newNode;
        temp.next = newNode;

        if (newNode.next == null) tail = newNode;
    }


    public void deletionByValue(int key) {
        if (head == null) return;

        if (head.data == key) {
            head = head.next;
            if (head != null) head.prev = null;
            else tail = null;
            return;
        }

        Node temp = head;
        while (temp != null && temp.data != key) {
            temp = temp.next;
        }
        if (temp == null) return;

        if (temp.next != null) temp.next.prev = temp.prev;
        if (temp.prev != null) temp.prev.next = temp.next;

        if (temp == tail) tail = temp.prev;
    }



    
    public void runDoubly(int size) {
        for (int i = 0; i < size; i++) {
            insertEnd(i);  // Insert at the end
        }
        
    }
}
