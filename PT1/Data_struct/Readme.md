## Data Structures 

## contents 

- Stacks
- Queues
- Priority Queues
- Heap
    - Min heap
    - Max heap
- Graphs
    - BFS (Breathe first searh)
- Tree
    - BST (Binary Search Tree)

## Features

- Stack 
    - used linkedlist for dynamic rezing
    - insertion
    - removal
    - display of stack
    - interactive menu
    - Encasulation 
    - User input
    - Exiting function

- Queue
    - used linkedlist for dynamic rezing
    - insertion
    - removal
    - display of stack
    - interactive menu
    - Encasulation 
    - User input
    - Exiting function


- Priority Queue
    - Priority based processing
    - insertion
    - removal
    - display of stack
    - interactive menu
    - Encasulation 
    - User input
    - Exiting function

- Min heap
    - insertion
    - removal ( removes the smallest element)
    - display
    - interactive menu
    - Encapsulation & modulation
    - user input
    - Exiting function


- Max heap 
    - Insetion
    - removal ( removes the largest element)
    - display of the heap
    - interactive menu
    - Encapsulation & Modularity
    - user input
    - Exiting function


- Graphs
    - adds an edge 
    - displays the graph
    

- Breathe First Search
    - 

- Binary Search Tree
    - Ordered Insertion
    - Recursive insertion
    - inorder traversal 


## Code Implemetation and explanation

# stacks implementation an explanation

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

    output: 

    1. push
    2. pop
    3. display
    4. Exit

    choose an option: 1 

    Enter a number to push: 1

    1. push
    2. pop
    3. display
    4. Exit

    choose an option: 2

    1. push
    2. pop
    3. display
    4. Exit

    choose an option: 3

    The stack: [3, 1]


    1. push
    2. pop
    3. display
    4. Exit

    choose an option: 2

    3 removed from stack

    1. push
    2. pop
    3. display
    4. Exit

    choose an option: 3

    The stack: [1]

    1. push
    2. pop
    3. display
    4. Exit

    choose an option: 4

    Exit



- the Stacks that I created in a seperate class for encapsulation and modular use where I created my own custom stacks and added a user input. First we have the push method where it ask the user to enter a number to 
then stores the input in a variable, the adds it to the stack finally prints a message that it have been added. Second the Pop method first it checks whether the stack is empty or not an if yes it'll print empty if no
it'll proceed in removing or popping the element/data in the stack and stores it then prints it. The 3rd is the display where it simply displays the stacks, And finally the 4th one is the run method where it prints out 
the users options and the user may choose from.

# Queue Implementation and explanation

# Priority Queue Implementation and explanation

# Min heap Implementation and explanation

# Max Heap Implementation and explanation

# Graphs Implementattion and explanation

# Breathe First Search Implementation and explanation

# Binary Search Tree Implementation and explanation


