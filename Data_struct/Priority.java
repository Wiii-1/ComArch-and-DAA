import java.util.PriorityQueue;
import java.util.Scanner;

class PriorityQueueClass {
    private PriorityQueue<Integer> pq = new PriorityQueue<>();
    private Scanner s = new Scanner(System.in);

    public void enqueue() {
        System.out.print("\nEnter a number to queue: ");
        int value = s.nextInt();
        pq.add(value);
        System.out.println("\n" +value + " added to queue");
    }

    public void dequeue() {
        if (pq.isEmpty()) {
            System.out.println("\nPriority queue is empty.");
        } else {
            int removed = pq.poll();
            System.out.println("\n" + removed + " removed from priority queue.");
        }
    }

    public void display() {
        System.out.println("\nhe Priority Queue: " + pq);
    }

    public void run() {
        while (true) {
            System.out.println("\n1. Add to Queue \n2. Remove from Queue \n3. Display \n4. Exit");
            System.out.print("\nChoose an option: ");
            int choice = s.nextInt();

            switch (choice) {
                case 1 -> enqueue();
                case 2 -> dequeue();
                case 3 -> display();
                case 4 -> {
                    System.out.println("Exiting...");
                    return; 
                }
                default -> System.out.println("Invalid choice.");
            }
        }
    }
}


public class Priority {
    public static void main(String[] args) {
        PriorityQueueClass pq = new PriorityQueueClass();
        pq.run();
    }
}
