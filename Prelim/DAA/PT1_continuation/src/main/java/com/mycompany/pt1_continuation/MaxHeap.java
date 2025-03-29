package com.mycompany.pt1_continuation;

import java.util.Collections;
import java.util.PriorityQueue;

public class MaxHeap {
    private PriorityQueue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());

    //add value
    public void insert(int value) {
        maxheap.add(value);
    }

    //remove value
    public void remove() {
        if (maxheap.isEmpty()) {
            System.out.println("Empty");
        } else {
            int removed = maxheap.poll();
            System.out.println("\nRemoved: " + removed);
        }
    }

    //display heap
    

    // Run the heap operations for a specific input size
    public void runMaxHeap(int size) {
        for (int i = 0; i < size; i++) {
            insert(i);    // Insert values into the max heap

        }
          
    }
}
