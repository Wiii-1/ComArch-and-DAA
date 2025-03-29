package com.mycompany.pt1_continuation;

import java.util.PriorityQueue;

public class MinHeap {
    private PriorityQueue<Integer> min_heap = new PriorityQueue<>();

    //add value
    public void add(int value) {
        min_heap.add(value);
    }

    //remove value
    public void remove() {
        if (min_heap.isEmpty()) {
            //System.out.println("Empty");
        } else {
            int removed = min_heap.poll();
            //System.out.println("\nRemoved: " + removed);
        }
    }

  
   

    // Run the heap operations for a specific input size
    public void runMinHeap(int size) {
        for (int i = 0; i < size; i++) {
            add(i);  // Add values to the min heap
        }
        
    }
}
