


import java.util.LinkedList;
import java.util.Scanner;

class CustomStack {
    private LinkedList <Integer> stack = new LinkedList<>();
    private Scanner s = new Scanner(System.in);

    public void push(){
        System.out.print("\nEnter a number to push: ");
        int value = s.nextInt();
        stack.addFirst(value);
        System.out.println("\n" + value + " added to stack");
    }
    public void pop(){
        if(stack.isEmpty()){
            System.out.println("Empty");
        }else {
            int removed = stack.removeFirst();
            System.out.println("\n" + removed + " removed from stack");
        }
    }
    public void display (){
        System.out.println("\n\nThe stack: " + stack);
    }

    public void run(){
        while(true){
            System.out.println("\n1. push \n2. pop \n3. display \n4. exit");
            System.out.print("\nChoose an option: ");
            int choice = s.nextInt();

            switch (choice){
                case 1 -> push();
                case 2 -> pop();
                case 3 -> display();
                case 4 -> {
                    System.out.println("Exit");
                    return;
                }
                default -> System.out.println("invalid choice");
            }
        }
    }
}
public class Stacks {
    public static void main(String[]args){

        performanceMonitor monitor = new performanceMonitor();
        monitor.start();

        CustomStack thestack = new CustomStack();
        

        thestack.run();

        monitor.stop("Stacks");
        
    }
}
