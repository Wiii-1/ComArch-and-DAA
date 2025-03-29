import java.util.LinkedList;
import java.util.Scanner;
class CustomQueue {
    private LinkedList<Integer> queue = new LinkedList<>();
    private Scanner s = new Scanner(System.in);

    public void enqueue() {
        System.out.print("\nEnter an element to add to the queue:");
        int value = s.nextInt();
        queue.add(value);
        System.out.println("\n"+value + " added to queue");
    }

    public void dequeue(){
        if(queue.isEmpty()){
            System.out.println("Empty");
        } 
        else {
            int removed = queue.poll();
            System.out.println("\n" + removed + " removed");
        }
    }

    public void display (){
        System.out.println(" \nThe queue: " + queue);
    }
    
    public void run(){
        while(true){
            System.out.println("\n1. Add \n2. Remove \n3. display \n4. Exit");
            System.out.print("\nChoose an option: ");
            int choice = s.nextInt();
    
            switch (choice) {
                case 1 -> enqueue();
                case 2 -> dequeue();
                case 3 -> display();
                case 4 -> {
                    System.out.println("Exit");
                    return;
                }
                default -> System.out.println("\nInvalid Choice.");
            }
        }
    }   
    
}
    



public class Queues{
    public static void main(String[]args){
        CustomQueue queue = new CustomQueue();    

        ;
        queue.run();
        
      
    }
}