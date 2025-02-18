import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

class PriorityQueueClass {
    private PriorityQueue<int[]> pq;
    private Scanner s = new Scanner(System.in);

    public PriorityQueueClass(){
        pq = new PriorityQueue<>((a, b) -> Integer.compare(b[0], a[0]));
    }

    public void enqueue() {
        System.out.print("\nEnter a number to queue: ");
        int value = s.nextInt();
        System.out.print("\nEnter its priorit (High = processed first): ");
        int priority = s.nextInt();

        pq.add(new int[]{priority, value});
        System.out.println("\n" +value + " added to queue");
    }

    public void dequeue() {
        if (pq.isEmpty()) {
            System.out.println("\nPriority queue is empty.");
        } else {
            int[] removed = pq.poll();
            System.out.println("\n" + removed[1] + " removed from priority queue.");
        }
    }

    public void display() {
        
        List<int[]> temp = new ArrayList<>(pq);
        temp.sort((a,b) -> Integer.compare(b[0], a[0]));

        System.out.print("\nThe Priority Queue: ");
        
        for (int[] item : temp){
            System.out.print( "["+item[1]+"] "  );
        }
        System.out.println(); 
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
                default -> System.out.println("\nInvalid choice.");
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
