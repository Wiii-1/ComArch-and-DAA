package com.mycompany.pt1_continuation;

import java.util.PriorityQueue;

public class PriorityQueueClass {
    private PriorityQueue<int[]> pq;

    public PriorityQueueClass() {
        pq = new PriorityQueue<>((a, b) -> Integer.compare(b[0], a[0]));
    }

    // enqueue a value with priority
    public void enqueue(int value, int priority) {
        pq.add(new int[]{priority, value});
    }

    // dequeue the highest priority value
    public void dequeue() {
        if (pq.isEmpty()) {
            //System.out.println("\nPriority queue is empty.");
        } else {
            int[] removed = pq.poll();
            //System.out.println("\nRemoved: " + removed[1]);
        }
    }


    // Run the priority queue operations for a specific input size
    public void runPriorityQueue(int size) {
        for (int i = 0; i < size; i++) {
            enqueue(i, i);  // Enqueue values with priority as the same as the value
        }
         
    }
}
