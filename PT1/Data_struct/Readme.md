# Data Structures

## Introduction 
This repository contains the basic implementation and explanation of various data structures and it's methods and common operation.

## Prequisites
- Java Development kit (JDK) 8 or higher

## Code demo

https://asciinema.org/a/704079

## Contents

- Stacks
- Queues
- Priority Queues
- Heap
  - Min heap
  - Max heap
- Graphs
  - BFS (Breadth-First Search)
- Tree
  - BST (Binary Search Tree)

# Features

### Stack
- Used LinkedList for dynamic resizing
- Insertion
- Removal
- Display of stack
- Interactive menu
- Encapsulation
- User input
- Exiting function

### Queue
- Used LinkedList for dynamic resizing
- Insertion
- Removal
- Display of queue
- Interactive menu
- Encapsulation
- User input
- Exiting function

### Priority Queue
- Priority-based processing
- Insertion
- Removal
- Display of queue
- Interactive menu
- Encapsulation
- User input
- Exiting function

### Min Heap
- Insertion
- Removal (removes the smallest element)
- Display
- Interactive menu
- Encapsulation & modularity
- User input
- Exiting function

### Max Heap
- Insertion
- Removal (removes the largest element)
- Display of the heap
- Interactive menu
- Encapsulation & modularity
- User input
- Exiting function

### Graphs
- Adds an edge
- Displays the graph

### Breadth-First Search
- Add Edge method
- BFS method

### Binary Search Tree
- Ordered insertion
- Recursive insertion
- Inorder traversal

# Code Implementation and Explanation

### Stack Implementation and Explanation
```java
class CustomStack {
    private LinkedList<Integer> stack = new LinkedList<>();
    private Scanner s = new Scanner(System.in);

    public void push() {
        System.out.print("\nEnter a number to push: ");
        int value = s.nextInt();
        stack.addFirst(value);
        System.out.println("\n" + value + " added to stack");
    }

    public void pop() {
        if (stack.isEmpty()) {
            System.out.println("Empty");
        } else {
            int removed = stack.removeFirst();
            System.out.println("\n" + removed + " removed from stack");
        }
    }

    public void display() {
        System.out.println("\n\nThe stack: " + stack);
    }

    public void run() {
        while (true) {
            System.out.println("\n1. Push \n2. Pop \n3. Display \n4. Exit");
            System.out.print("\nChoose an option: ");
            int choice = s.nextInt();

            switch (choice) {
                case 1 -> push();
                case 2 -> pop();
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
```

output: 

1. push 
2. pop 
3. display 
4. exit

Choose an option: 1

Enter a number to push: 10

10 added to stack

1. push 
2. pop 
3. display 
4. exit

Choose an option: 1

Enter a number to push: 20

20 added to stack

1. push 
2. pop 
3. display 
4. exit

Choose an option: 1

Enter a number to push: 30

30 added to stack

1. push 
2. pop 
3. display 
4. exit

Choose an option: 3


The stack: [30, 20, 10]

1. push
2. pop
3. display
4. exit

Choose an option: 2

30 removed from stack

1. push
2. pop
3. display
4. exit

Choose an option: 3


The stack: [20, 10]

1. push
2. pop
3. display
4. exit

Choose an option: 2

20 removed from stack

1. push
2. pop
3. display
4. exit

Choose an option: 3


The stack: [10]

1. push
2. pop
3. display
4. exit

Choose an option: 4
Exit



- the Stacks that I created in a seperate class for encapsulation and modular use where I created my own custom stacks and added a user input. First we have the push method where it ask the user to enter a number to 
then stores the input in a variable, the adds it to the stack finally prints a message that it have been added. Second the Pop method first it checks whether the stack is empty or not an if yes it'll print empty if no
it'll proceed in removing or popping the element/data in the stack and stores it then prints it. The 3rd is the display where it simply displays the stacks, And finally the 4th one is the run method where it prints out 
the users options and the user may choose from. To use it is already easy and self explanatory 

## Queue Implementation and explanation
```java
    class Queue {
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
```
    output: 

1. Add 
2. Remove 
3. display 
4. Exit

Choose an option: 1

Enter an element to add to the queue:14

14 added to queue

1. Add 
2. Remove 
3. display 
4. Exit

Choose an option: 1

Enter an element to add to the queue:18

18 added to queue

1. Add 
2. Remove 
3. display 
4. Exit

Choose an option: 1

Enter an element to add to the queue:20

20 added to queue

1. Add
2. Remove
3. display
4. Exit

Choose an option: 3
 
The queue: [14, 18, 20]

1. Add
2. Remove
3. display
4. Exit

Choose an option: 2

14 removed

1. Add
2. Remove
3. display
4. Exit

Choose an option: 3
 
The queue: [18, 20]

1. Add
2. Remove
3. display
4. Exit

Choose an option: 2

18 removed

1. Add
2. Remove
3. display
4. Exit

Choose an option: 3
 
The queue: [20]

1. Add
2. Remove
3. display
4. Exit

Choose an option: 4
Exit

- The basic concept of Queue that I have written above uses FIFO or first in first out along with it's output features, first I wrote Queue the same way from my stacks where I encapsulated the stacks an created a custom stacks with added functions of a user input, display, insertion, removal and Exiting function. The first method was the same from the typical basic queue where it just enqueue or add an item to the queue, A dequeue method where a user can remove a element or data to the queue. I added the display method for the user if he/she wants to see the queue & for the last is just simply a method where it runs it all so I only need to call the class where I encapsulated the queue class and made it modular for other uses. To use it is already easy and self explanatory 


## Priority Queue Implementation and explanation
```java
    class PriorityQueueClass {
        private PriorityQueue<int[]> pq;
        private Scanner s = new Scanner(System.in);

    public PriorityQueueClass(){
        pq = new PriorityQueue<>((a, b) -> Integer.compare(b[0], a[0]));
    }

    public void enqueue() {
        System.out.print("\nEnter a number to queue: ");
        int value = s.nextInt();
        System.out.print("Enter its priorit (High = processed first): ");
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
        
        for (int[] item : temp){
            System.out.print(item[1] + " ");
        }

        System.out.print("");
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
```
    output: 

1. Add to Queue
2. Remove from Queue
3. Display
4. Exit

Choose an option: 1

Enter a number to queue: 14

Enter its priorit (High = processed first): 4

14 added to queue

1. Add to Queue
2. Remove from Queue
3. Display
4. Exit

Choose an option: 1

Enter a number to queue: 20

Enter its priorit (High = processed first): 1

20 added to queue

1. Add to Queue
2. Remove from Queue
3. Display
4. Exit

Choose an option: 1

Enter a number to queue: 60

Enter its priorit (High = processed first): 9

60 added to queue

1. Add to Queue
2. Remove from Queue
3. Display
4. Exit

Choose an option: 3

The Priority Queue: [60] [14] [20]

1. Add to Queue
2. Remove from Queue
3. Display
4. Exit

Choose an option: 2

60 removed from priority queue.

1. Add to Queue
2. Remove from Queue
3. Display
4. Exit

Choose an option: 3

The Priority Queue: [14] [20]

1. Add to Queue
2. Remove from Queue
3. Display
4. Exit

Choose an option: 2

14 removed from priority queue.

1. Add to Queue
2. Remove from Queue
3. Display
4. Exit

Choose an option: 3

The Priority Queue: [20]

1. Add to Queue
2. Remove from Queue
3. Display
4. Exit

Choose an option: 4
Exiting...

- The priority Queue is the same with the normal queue with a bit of difference where I implemented spcifically for priority queue so that I can store a element or number along with it's priority value. I have wrote a cutsom enqueue, dequeue that accepts a user input, along side with it the custom display that sorts all the numbers in the queue by their priority value in a descening order & prints all the number in a descending order from their priority value.  For the last method I wrote is the custom run method so that runs the whole code using a switch

## Min heap Implementation and explanation
```java
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
```
    output: 

Your options are: 

1. Add a value
2. Remove a value
3. Display
4. Exit

Choose: 1

Enter a value:  3

3 is added

Your options are:

1. Add a value
2. Remove a value
3. Display
4. Exit

Choose: 1

Enter a value:  7

7 is added

Your options are:

1. Add a value
2. Remove a value
3. Display
4. Exit

Choose: 1

Enter a value:  9

9 is added

Your options are:

1. Add a value
2. Remove a value
3. Display
4. Exit

Choose: 3

The min heap: [3, 7, 9]

Your options are:

1. Add a value
2. Remove a value
3. Display
4. Exit

Choose: 2

3 is removed
Your options are:

1. Add a value
2. Remove a value
3. Display
4. Exit

Choose: 3

The min heap: [7, 9]

Your options are:

1. Add a value
2. Remove a value
3. Display
4. Exit

Choose: 2

7 is removed
Your options are:

1. Add a value
2. Remove a value
3. Display
4. Exit

Choose: 3

The min heap: [9]

Your options are:

1. Add a value
2. Remove a value
3. Display
4. Exit

Choose: 4
Exit

- The min heap that I wrote is just simply that queue but the only difference is that the smallest is the first on the queue and will be the first one out and the same with the max heap the only difference is that the max heap is reverse order. To use it is already easy and self explanatory 

## Max Heap Implementation and explanation
```java
    class Max_heap{
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
```
    output: 

Your options are:

1. Add a value
2. Remove a value
3. Display
4. Exit

choose: 1

Enter a value: 3

value 3 added

Your options are:

1. Add a value
2. Remove a value
3. Display
4. Exit

choose: 1

Enter a value: 10

value 10 added

Your options are:

1. Add a value
2. Remove a value
3. Display
4. Exit

choose: 1

Enter a value: 30

value 30 added

Your options are:

1. Add a value
2. Remove a value
3. Display
4. Exit

choose: 3

The max heap: [30, 3, 10]

Your options are:

1. Add a value
2. Remove a value
3. Display
4. Exit

choose: 2

removed 30

Your options are:

1. Add a value
2. Remove a value
3. Display
4. Exit

choose: 3

The max heap: [10, 3]

Your options are:

1. Add a value
2. Remove a value
3. Display
4. Exit

choose: 2

removed 10

Your options are:

1. Add a value
2. Remove a value
3. Display
4. Exit

choose: 3

The max heap: [3]

Your options are:

1. Add a value
2. Remove a value
3. Display
4. Exit

choose: 4
Exit

-  I wrote max heap for moddularity so that I can use it everyclass that I want to use it and encapsulated every method inside that class for easy reuse independently. The Features I wrote for max heap is custom insertion, removal, an interactive menu where it has user input, For the last I created a run method where that whole class is being run and so that I can just simply call the class and use the run method. The only Difference this from min heap is the reversed order where it display and pop function where that biggest is in the first and first to be removed. To use it is already easy and self explanatory 

# Graphs Implementation and explanation
```java
    public class Graphs {
        private Map<Integer, List<Integer>> adjList = new HashMap<>();

    public void addEdge (int u, int v){
        adjList.putIfAbsent(u,  new ArrayList<>());
        adjList.putIfAbsent(v,  new ArrayList<>());
        adjList.get(u).add(v);
        adjList.get(v).add(u);
    }

    public void display(){
        for(int node : adjList.keySet()){
            System.out.println(node + "->" + adjList.get(node));
        }
    }

    public static void main (String[]args){
        Graphs graphs = new Graphs();
        graphs.addEdge(1,2);
        graphs.addEdge(1,3);
        graphs.addEdge(2,4);
        graphs.addEdge(4, 5);
        graphs.display();
    }
    }
```
    output: 

1->[2, 3]
2->[1, 4]
3->[1]
4->[2, 5]
5->[4]

- The simple creation of graph that I wrote is for only the explanation. The graph is an adjacent list that uses a hash map to store node and their corresponding neigbors, it is an undirected graph where each edge is bidirectional meaning pointing both ways. The graph that I wrote has a dynamic edge addition so that it would check the nodes before adding edges, the graph traversal is just printing  the adjacent list. I madde the graph that I wrote scalable that can store large graphs with efficiency with hashmaps and arraylist and I madde it simple without any extra dependencies.

## Breathe First Search Implementation and explanation
```java
    public class BFS {
        public Map<Integer, List<Integer>> graph = new HashMap<>();
    
    public void addEdge (int u, int v){
        graph.putIfAbsent(u, new ArrayList<>());
        graph.putIfAbsent(v, new ArrayList<>());
        graph.get(u). add(v);
        graph.get(v). add(u);
    }
    public void bfs(int start){
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();

        queue.add(start);
        visited.add(start);

        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.print(node + " ");

            for (int neighbor : graph.get(node)){
                if(!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.add(neighbor);
                }
            }
        }
    }

    public static void main(String[] args) {
        BFS bfs = new BFS();
        bfs.addEdge(1, 2);
        bfs.addEdge(1, 3);
        bfs.addEdge(2, 4);
        bfs.bfs(3);
        
    }
    }
```
    output: 3 1 2 4 

- The Breadth First Search that I wrote is a simple one with any unique features that i could call i create. whole bfs class the graph field showing adjacent list of the graph, The add edge method adds an undirected edge between the nodes due to the method that I wrote putifAbsents it ensures the both nodes are present in the graph and then adds each node to the other adjacent list & for the last method bfs is the one handling performing the breadth first search starting from the give node then it uses the queue to manage the nodes to be vistite and set keeps track of all visited node then it prints all the node that it have been visited

## Binary Search Tree Implementation and explanation
```java
    class Binary_search_tree {
         Node root;
    

    public Binary_search_tree(){
        root = null;
    }

    public void insert(int key){
        root = insertRec(root, key);
    }

    private Node insertRec(Node root, int key){
        if (root == null){
            return new Node(key);
        }

        if(key < root.key){
            root.left = insertRec(root.left , key);
        }
        else if (key > root.key){
            root.right = insertRec(root.right, key);
        }
        return root;
    }
    public void inorder(){
        inorderRec(root);
        System.out.println();
    }
    private void inorderRec(Node root){
        if (root != null){
            inorderRec(root.left);
            System.out.print(root. key + " ");
            inorderRec(root.right);
        }
    }
    }
```
    output: 10 25 30 32 40 

- The Binary Search Tree that I wrote is simple yet I incorporated a recursion for the correct placemnet of each entered input or for short I created a predefined input and that inputed data or number will be sorted and will be put to whether left to right so the type of Binary search tree I wrote is the inorder traversal primariraly this is the simplest yet it's goodd for examples and explanation.

At the very start of the tree is the node root where it stores all the nodes, the second method within class bst is insert method where it calls the insertRec for it's recursive help in placing it in the correct place whether it's left or right or root, 3rd to the last method that I wrote is the inorder it calls the inorder traversal to print the sorted output, for the last is the inorderRec where it simply prints the sorted order and stops the recursion if the tree or nodes is nothing or reached the end. 


## End note
Sir thank you sir for understanding and giving me this opportunity to learn by myself, I want to apologize that this is the only output that I managed to produce & possibly can't finish PT 2 due to all of our other subjects have the same due date. I home you understand it sir and thank you sir that I learned something at least. Also I'm tired I can't  do any more line by line explanation.



