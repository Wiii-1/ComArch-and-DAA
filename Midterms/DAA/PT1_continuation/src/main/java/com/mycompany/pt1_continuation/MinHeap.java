package com.mycompany.pt1_continuation;

import java.util.PriorityQueue;

public class MinHeap {
    private PriorityQueue<Integer> min_heap = new PriorityQueue<>();

  
    public void add(int value) {
        min_heap.add(value);
    }

    
    public void remove() {
        if (min_heap.isEmpty()) {
            
        } else {
            int removed = min_heap.poll();
            
        }
    }

  
   

    
    public void runMinHeap(int size) {
        for (int i = 0; i < size; i++) {
            add(i);  
        }
        
    }
}
