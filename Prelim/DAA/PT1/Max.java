
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;


class Max_Heap{
    private PriorityQueue <Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());
    private Scanner s = new Scanner(System.in);

    public void add() {
        System.out.print("\nEnter a value: ");
        int value = s.nextInt();
        maxheap.add(value);
        System.out.println("\nvalue " + value + " added");
    }
    public void remove() {
        if (maxheap.isEmpty()){
            System.out.println("Empyty");
        } else {
            int remove = maxheap.poll();
            System.out.println("\nremoved " + remove);
        }
    }
    public void display (){
        System.out.println("\nThe max heap: " + maxheap);
    }
    public void run (){
        while(true){
            System.out.println("\nYour options are:");
            System.out.println("\n1. Add a value \n2. Remove a value \n3. Display \n4. Exit");
            System.out.print("\nchoose: ");
            int choice = s.nextInt();

            switch (choice){
                case 1 -> add();
                case 2 -> remove();
                case 3 -> display();
                case 4 -> {
                    System.out.println("Exit");
                    return;
                }
                default -> System.out.println("\nInvalid Choice");
            }
        }
    }

}

public class Max {
    public static void main(String[] args) {
        Max_Heap mp = new Max_Heap();
        
        mp.run();
        
    }
}
