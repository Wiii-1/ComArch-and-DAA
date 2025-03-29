package com.mycompany.pt1_continuation;

public class Singly {

    private class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;

    // Insert at the end of the list
    public void insertEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = newNode;
    }

    // Insert at the beginning of the list
    public void insertBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Insert at a specific position
    public void insertAt(int data, int position) {
        Node newNode = new Node(data);
        if (position == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node temp = head;
        for (int i = 0; temp != null && i < position - 1; i++) {
            temp = temp.next;
        }
        if (temp == null) return;

        newNode.next = temp.next;
        temp.next = newNode;
    }

    

    // Run the singly linked list operations for a specific input size
    public void runSingly(int size) {
        for (int i = 0; i < size; i++) {
            insertEnd(i);  // Insert at the end
        }
        //display();  // Display the list
    }
}
