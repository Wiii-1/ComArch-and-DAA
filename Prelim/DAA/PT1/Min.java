
import java.util.PriorityQueue;
import java.util.Scanner;


class Min_heap{
    private PriorityQueue <Integer> min_heap = new PriorityQueue<>();
    private Scanner s = new Scanner(System.in);

    public void Add(){
        System.out.print("\nEnter a value:  ");
        int value = s.nextInt();
        min_heap.add(value);
        System.out.println("\n" + value + " is added\n");
    }
    public void remove(){
        if (min_heap.isEmpty()){
            System.out.println("Empty");
        }
        else {
            int remove = min_heap.poll();
            System.out.println("\n"+ remove + " is removed");
        }
    }
    public void display(){
        System.out.println("\nThe min heap: " + min_heap + "\n");
    }
    public void run(){
        while (true){
            System.out.println("Your options are: ");
            System.out.println("\n1. Add a value \n2. Remove a value \n3. Display \n4. Exit");
            System.out.print("\nChoose: ");
            int choice =s.nextInt();

            switch (choice) {
                case 1 -> Add();
                case 2 -> remove();
                case 3 -> display();
                case 4 -> {
                    System.out.println("Exit");
                    return;
                }
                default -> System.out.println("Invalid choice");
            }
        }
    }
    
}
public class Min {
    public static void main(String[]args){
        Min_heap mp = new Min_heap();

        performanceMonitor monitor = new performanceMonitor();
        monitor.start();

    
        
        mp.run();

        monitor.stop("Min");
        
    }
}
