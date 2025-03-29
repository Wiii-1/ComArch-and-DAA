package com.mycompany.pt1_continuation;

import java.util.LinkedList;

public class Queues {
    private LinkedList<Integer> queue = new LinkedList<>();

    //enqueue a value
    public void enqueue(int value) {
        queue.add(value);
    }

    // dequeue a value
    public void dequeue() {
        if (queue.isEmpty()) {
            //System.out.println("Empty");
        } else {
            int removed = queue.poll();
            //System.out.println("\nRemoved: " + removed);
        }
    }

    

    // Run the queue operations for a specific input size
    public void runQueue(int size) {
        for (int i = 0; i < size; i++) {
            enqueue(i);  // Enqueue values into the queue
        }
         
    }
}
