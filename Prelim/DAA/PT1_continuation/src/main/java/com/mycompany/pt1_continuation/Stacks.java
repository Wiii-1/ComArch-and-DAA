package com.mycompany.pt1_continuation;

import java.util.LinkedList;

public class Stacks {
    private LinkedList<Integer> stack = new LinkedList<>();

    // Push method
    public void push(int value) {
        stack.addFirst(value);
    }

    // Pop method
    public void pop() {
        if (stack.isEmpty()) {
            System.out.println("Empty");
        } else {
            int removed = stack.removeFirst();
            System.out.println("\nRemoved: " + removed);
        }
    }

    


    // Run the stack operations for a specific input size
    public void runStack(int size) {
        for (int i = 0; i < size; i++) {
            push(i);
        }
    }
}