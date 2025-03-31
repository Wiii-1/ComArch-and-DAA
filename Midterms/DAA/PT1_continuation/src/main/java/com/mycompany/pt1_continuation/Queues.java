package com.mycompany.pt1_continuation;

import java.util.LinkedList;

public class Queues {
    private LinkedList<Integer> queue = new LinkedList<>();

   
    public void enqueue(int value) {
        queue.add(value);
    }

   
    public void dequeue() {
        if (queue.isEmpty()) {
        } else {
            int removed = queue.poll();
        }
    }

    

    
    public void runQueue(int size) {
        for (int i = 0; i < size; i++) {
            enqueue(i);
        }
         
    }
}
