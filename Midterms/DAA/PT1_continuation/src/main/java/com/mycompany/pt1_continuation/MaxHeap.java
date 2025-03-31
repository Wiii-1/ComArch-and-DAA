package com.mycompany.pt1_continuation;

import java.util.Collections;
import java.util.PriorityQueue;

public class MaxHeap {
    private PriorityQueue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());

    
    public void insert(int value) {
        maxheap.add(value);
    }

   
    public void remove() {
        if (maxheap.isEmpty()) {
            System.out.println("Empty");
        } else {
            int removed = maxheap.poll();
            System.out.println("\nRemoved: " + removed);
        }
    }

   
    

    
    public void runMaxHeap(int size) {
        for (int i = 0; i < size; i++) {
            insert(i);   

        }
          
    }
}
