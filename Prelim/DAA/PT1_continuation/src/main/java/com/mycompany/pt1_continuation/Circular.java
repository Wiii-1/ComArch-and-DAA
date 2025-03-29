package com.mycompany.pt1_continuation;

public class Circular {

    private class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;

    // Insert at the end
    public void insertEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            head.next = head;
            return;
        }

        Node temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.next = head;
    }

    // Insert at the beginning
    public void insertBeginning(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            head.next = head;
            return;
        }

        Node temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        newNode.next = head;
        temp.next = newNode;
        head = newNode;
    }

    // Display the list
    public void display() {
        if (head == null) {
            //System.out.println("List is empty.");
            return;
        }

        Node temp = head;
        System.out.print("Circular List: ");
        do {
            //System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("head");
    }

    // Run the circular linked list operations for a specific input size
    public void runCircular(int size) {
        for (int i = 0; i < size; i++) {
            insertEnd(i);  // Insert at the end
        }
        display();  // Display the list
    }
}
