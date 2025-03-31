package com.mycompany.pt1_continuation;

import java.util.PriorityQueue;

public class PriorityQueueClass {
    private PriorityQueue<int[]> pq;

    public PriorityQueueClass() {
        pq = new PriorityQueue<>((a, b) -> Integer.compare(b[0], a[0]));
    }

    
    public void enqueue(int value, int priority) {
        pq.add(new int[]{priority, value});
    }

    
    public void dequeue() {
        if (pq.isEmpty()) {
           
        } else {
            int[] removed = pq.poll();
            
        }
    }


    
    public void runPriorityQueue(int size) {
        for (int i = 0; i < size; i++) {
            enqueue(i, i);  
        }
         
    }
}
