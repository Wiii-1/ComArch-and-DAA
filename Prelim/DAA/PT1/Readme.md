# Data Structures and Linked Lists

## Table of Contents
- [Introduction](#introduction)
- [Prerequisites](#prerequisites)
- [Code Demo](#code-demo)
- [Contents](#contents)
  - [Data Structures](#data-structures)
  - [Linked Lists](#linked-lists)
- [Features](#features)
  - [Data Structures](#data-structures-features)
  - [Linked Lists](#linked-lists-features)
- [Code Explanation](#code-explanation)
  - [Data Structures](#data-structures-code-explanation)
  - [Linked Lists](#linked-lists-code-explanation)
- [Usage](#usage)
  - [Singly Linked List](#for-the-singly-linked-list-usage)
  - [Doubly Linked List](#for-the-doubly-linked-list-usage)
  - [Circular Linked List](#for-circular-linked-list-usage)
  

---

## Introduction
This repository contains the basic implementation and explanation of various data structures and linked lists in Java. 
Each implementation includes methods, common operations, and explanations for better understanding.

---

## Prerequisites
- Java Development Kit (JDK) 8 or higher

---

## Code Demo
[Asciinema Demo](https://asciinema.org/a/704079)

---

## Contents

### Data Structures
- Stacks
- Queues
- Priority Queues
- Heap
  - Min Heap
  - Max Heap
- Graphs
  - BFS (Breadth-First Search)
- Tree
  - BST (Binary Search Tree)

### Linked Lists
- Singly Linked List
- Doubly Linked List
- Circular Linked List

---

# Features

## Data Structures

### Stack
- Dynamic resizing using LinkedList
- Insertion
- Removal
- Display
- Interactive menu
- Encapsulation
- User input
- Exit functionality

### Queue
- Dynamic resizing using LinkedList
- Insertion
- Removal
- Display
- Interactive menu
- Encapsulation
- User input
- Exit functionality

### Priority Queue
- Priority-based processing
- Insertion
- Removal
- Display
- Interactive menu
- Encapsulation
- User input
- Exit functionality

### Min Heap
- Insertion
- Removal (removes the smallest element)
- Display
- Interactive menu
- Encapsulation & modularity
- User input
- Exit functionality

### Max Heap
- Insertion
- Removal (removes the largest element)
- Display
- Interactive menu
- Encapsulation & modularity
- User input
- Exit functionality

### Graphs
- Add Edge
- Display Graph

### Breadth-First Search (BFS)
- Add Edge method
- BFS traversal method

### Binary Search Tree (BST)
- Ordered insertion
- Recursive insertion
- Inorder traversal

---

## Linked Lists

### Singly Linked List
- Insert at the end
- Insert at the beginning
- Insert at a specific position
- Search for an element
- Display the list

### Doubly Linked List
- Insert at the end
- Insert at the beginning
- Insert at a specific position
- Delete by value
- Search for an element
- Display forward
- Display backward

### Circular Linked List
- Insert at the end
- Insert at the beginning
- Display the list

---

# Code Explanation

## Data Structures

### Stack Implementation
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



- the Stacks that I created in a seperate class for encapsulation and modular use where I created my own custom stacks and added a user input. 
First we have the push method where it ask the user to enter a number to then stores the input in a variable, 
the adds it to the stack finally prints a message that it have been added. 
Second the Pop method first it checks whether the stack is empty or not an if yes it'll print empty if no
it'll proceed in removing or popping the element/data in the stack and stores it then prints it. 
The 3rd is the display where it simply displays the stacks, And finally the 4th one is the run method where it prints out 
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

- The basic concept of Queue that I have written above uses FIFO or first in first out along with it's output features,
 first I wrote Queue the same way from my stacks where I encapsulated the stacks an created a custom stacks with added functions of a user input, display, insertion, removal and Exiting function. 
 The first method was the same from the typical basic queue where it just enqueue or add an item to the queue,
 A dequeue method where a user can remove a element or data to the queue. 
 I added the display method for the user if he/she wants to see the queue & for the last is just simply a method where it runs it all so I only need to call the class where I encapsulated the queue class and made it modular for other uses. To use it is already easy and self explanatory 


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

- The priority Queue is the same with the normal queue with a bit of difference where I implemented spcifically for priority queue so that I can store a element or number along with it's priority value. 
I have wrote a cutsom enqueue, dequeue that accepts a user input, 
along side with it the custom display that sorts all the numbers in the queue by their priority value in a descening order & prints all the number in a descending order from their priority value.
For the last method I wrote is the custom run method so that runs the whole code using a switch

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

- The min heap that I wrote is just simply that queue but the only difference 
is that the smallest is the first on the queue and will be the first one out 
and the same with the max heap the only difference is that the max heap is reverse order. 
To use it is already easy and self explanatory 

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

-  I wrote max heap for moddularity so that I can use it everyclass 
that I want to use it and encapsulated every method inside that class 
for easy reuse independently. The Features I wrote for max heap is custom 
insertion, removal, an interactive menu where it has user input, For the 
last I created a run method where that whole class is being run and 
so that I can just simply call the class and use the run method.
The only Difference this from min heap is the reversed order where it 
display and pop function where that biggest is in the first and first to be removed. 
To use it is already easy and self explanatory 

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

- The Breadth First Search that I wrote is a simple one with 
any unique features that i could call i create. whole bfs class 
the graph field showing adjacent list of the graph, The add edge method adds an 
undirected edge between the nodes due to the method that 
I wrote putifAbsents it ensures the both nodes are present in the graph and then adds 
each node to the other adjacent list & for the last method bfs is the one handling 
performing the breadth first search starting from the give node then it uses the queue 
to manage the nodes to be vistite and set keeps track of all visited node then it 
prints all the node that it have been visited

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

- The Binary Search Tree that I wrote is simple 
yet I incorporated a recursion for the correct 
placemnet of each entered input or for short I 
created a predefined input and that inputed data 
or number will be sorted and will be put to whether 
left to right so the type of Binary search tree 
I wrote is the inorder traversal primariraly this 
is the simplest yet it's goodd for examples and explanation.

At the very start of the tree is the node root where it 
stores all the nodes, the second method within class bst 
is insert method where it calls the insertRec for it's 
recursive help in placing it in the correct place whether 
it's left or right or root, 3rd to the last method that 
I wrote is the inorder it calls the inorder traversal to 
print the sorted output, for the last is the inorderRec 
where it simply prints the sorted order and stops the 
recursion if the tree or nodes is nothing or reached the end. 

# Linkedlist

This the 3 types of linkedlist 

Singly   Linkedlist
Doubly   Linkedlist
Circular Linkedlist

Singly Linkedlist - is a type of list that stores data in a node in split into two, 
the left is for the data and the for the right it stores the pointer that points to the next node/data.

Doubly linkedlist - is also same with the singly linkedlist that also stores data in a node but in this
 type of linkedlist where the node is split into 3 parts where the data is in the middle the left part 
 is the pointer that points to the previous node and for the right part is the pointer that points to the next node.

Circular Linkedlist - is a mix of singly and doubly but not all of the features of the both has. 
Circular is only where the node is split into 2 but the tail 
which is the last node points to the head to loop it back around.

In simpler terms linked list is just a list where everything you 
list is a data and is being stored in a node that also contains a pointer or 
address to the next node or the next data in the list. 

# Features

- Singly Linkedlist 
    -insert End
    -insert Beginning
    -insert At
    -Search
    -Display

- Doubly Linkedlist
    -insert End
    -insert Beginning
    -insert At
    -deletion By Value
    -search
    -display Forward
    -display Backwards

- Circular Linkedlist
    -insert End
    -insert Beginning
    -display

# Code explanation

## Singly Linkedlist


    void insertEnd(int data) {
        Node newNode = new Node(data);              // this line right here is just creates the node that stores the data withing

        if(head == null){   
            head = newNode;                         // this block of code here is the traversal where it traverse the whole list till it reach the last empty node 
            return;                                 // or simply free space, then it creates a new node in the very end of the list and then return if to the list
        }
        Node temp = head;                           // this line right here is simply creating the point
        while (temp.next != null) temp = temp.next; // the while loop traverses the whole list untill it finds the last node.
        temp.next = newNode;                        // since temp is the last node, this line simply connects the last node to the rest.
    }


     void insertAt (int data, int position){        // this method is inserting a node with the data and it's position within the list, since this list is 0 based means where 0 is the first index of the code
        Node newNode = new Node(data);              // again this just creates a node and stores the data in it
        if (position ==0) {
            newNode.next = head;                    // this block of decision block just says since it's 0 based it inserts the node in the beginning and it links to the old first node, in simpler terms it replaces the first node
            head = newNode;
            return;
        }

        Node temp = head;
        for (int i = 0; temp != null && i < position - 1; i++){   // this for loop traverses the whole list untill it reaches the node just before the insertion
            temp = temp.next;
        }
        if (temp == null) return;                   // it just means that the position is beyond the end of the list and simply returns it without any error
        newNode.next = temp.next;                   // it simply inserts the node and linking it properly temp is now pointing to new node which the node it inserted 
        temp.next = newNode;              
    }

    void insertBeginning (int data){               
        Node newNode = new Node(data);             // creates new node and stores the data
        newNode.next = head;                       // sets the head as the new node 
        head = newNode;                            // updates to the new node
    }

    boolean search(int key) {
        Node temp = head;
        while (temp != null) {                      // traverses the whole list
            if (temp.data == key) return true;      // If key is found, return true.
            temp = temp.next;                       // Move to the next node.
        }
        return false;                               // If not found, return false.
    }

    void display (){                                // this method simply just traverses the whole list and prints the node till it reaches the last node 
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.print(" null ");                 // this last part of the block just prints null when it reached the end of the list
    }



## Doubly Linkedlist

    void insertEnd(int data) {
        Node newNode = new Node(data);                  // Creates a new node storing the given data.
        if (head == null) {
            head = newNode;                             // If the list is empty, the new node becomes the head.
            return;
        }
        temp = head;                                    // Creates a pointer starting from the head.
        while (temp.next != null) temp = temp.next;     // Traverses to the last node.
        temp.next = newNode;                            // Connects the last node to the new node.
        newNode.prev = temp;                            // Sets the previous pointer of the new node to the last node.
    }

    void insertBeginning(int data) {
        Node newNode = new Node(data);                  // Creates a new node storing the given data.
        if (head == null) {
            head = newNode;                             // If the list is empty, set head to the new node.
            return;
        }
        newNode.next = head;                            // The new node points to the old head.
        head.prev = newNode;                            // The old head's previous pointer is updated to the new node.
        head = newNode;                                 // Update head to the new node.
    }

    void insertAt(int data, int position) {
        Node newNode = new Node(data);                  // Creates a new node storing the given data.
        if (position == 0) {
            insertBeginning(data);                      // If inserting at position 0, use insertBeginning.
            return;
        }
        Node temp = head;
        for (int i = 0; temp != null && i < position - 1; i++) {
            temp = temp.next;                           // Traverses the list to reach the node just before insertion.
        }
        if (temp == null) return;                       // If position is out of bounds, return without insertion.
        newNode.next = temp.next;                       // Links newNode's next to temp's next.
        newNode.prev = temp;                            // Links newNode's prev to temp.
        if (temp.next != null) temp.next.prev = newNode;// Updates next node's prev pointer if it exists.
        temp.next = newNode;                            // Inserts newNode after temp.
    }

    boolean search(int key) {
        Node temp = head;
        while (temp != null) {                      // traverses the whole list
            if (temp.data == key) return true;      // If key is found, return true.
            temp = temp.next;                       // Move to the next node.
        }
        return false;                               // If not found, return false.
    }

    void deletionByValue(int key){                      
            if (head ==null ) return;                           // if the list is found empty it just returns
            if (head.data == key) {                              
                head = head.next;                               // if the head contains the it just moves the head to the next node
                if (head != null) head.prev = null;             // just updates the news heads previous pointer
                return;
            }
            
            Node temp = head;
            while(temp != null && temp.data != key){
                temp = temp.next;                               // just traverse the whole list with that node with the key
            }
            if (temp == null) return;                           // if not found it just returns
            if (temp.next != null) temp.next.prev = temp.prev;  // it just updates the next node's prev pointer
            if (temp.prev != null) temp.prev.next = temp.next;  // it also just update the previous next pointer
    }

    void displayForward (){
            Node temp = head;                                   
            while(temp != null ){
                System.out.print(temp.data + " -> ");           // this simply just traverses the whole list and prints each node's data
                temp = temp.next;                               
            }
            System.out.println("Null");                         // it says that it reached the end of the list
        }

    void displayBackwards(){                            
            if (head == null) return;                           // returns if the list is empty
            Node temp = head;                                   
            while (temp.next != null) temp = temp.next;         // it travverse till it reaches the last node
            while (temp != null){
                System.out.print(temp.data + " -> ");           // this prints each node's data in reverse
                temp = temp.prev;                               // this moves backwards using the pointer
            }   
            System.out.println("Null");                         // prints when it reaches the end of the list
        }


## Circular Linkedlist

    void insertEnd (int data){
        Node newNode = new Node(data);                      // as all of the linkedlist this is the same the other function that creates a new node
        if (head ==null){                                   // this if decision blocks checks the whole list if it's empty, if the list is empty it creates a node and becomes the new head, & since it's a circular it just points it to itself
            head = newNode; 
            head.next = head;
            return;
        }
        else {
            Node temp = head;                               // it creates a pointer for traversal in the list
            while(temp.next != head)                        // the while loop traverses the whole list till to the last node (which points to the head)
                temp = temp.next;                           
            temp.next = newNode;                            // it just updates the last node's pointer to the new node
            newNode.next = head;                            // this just makes the new node points back to the head, maintaining the circular structure
        }
    }
    void insertBeginning (int data){                        
        Node newNode = new Node(data);

        if (head == null){                                  // the first part of this decision block which checks the list if it's empty then it creates a new node and becomes the head itself since it's a circular list
            head = newNode;
            head.next = head;
        }
        else {                                              // the second part of the decisiong block which is the else traverses the whole list till to the last. creates a new node then that new node that points 
                                                               to the current head and that last node point to the new node and updates the head to the new node
            Node temp = head;
            while (temp.next != head)
                temp = temp.next;
            newNode.next = head;
            temp.next = newNode;
            head = newNode;
        }
    }
    public void display(){                                 // the decision block of this method is the first checks the list if it's empty and if it it prints empty, 
        if (head == null){
            System.out.print("empty.");
            return;
        }

        Node temp = head;                                 // this starts the traversal from the head
        do {                                              // starts the traversal and prints the data of the current node as it moves from next node then it stops when it completes a full cycle 
            System.out.print(temp.data + " -> ");         
            temp = temp.next;
        } while (temp != head);
        System.out.println("head");                      // it just indicated that the loop is back to the head
    }



The three sets of codes you see above is the singly, doubly, circular linkedlist 
with it's explanation of it's function. One can use this types of linkedlist in the real world is the music player.

# Usage

## For the singly linklist usage

        // insertion of elements or data
        sll.insertEnd(30);
        sll.insertEnd(40);
        sll.insertBeginning(10);
        sll.insertAt(20, 2);

        // displays the list
        sll.display();   // output: 10 -> 30 -> 20 -> 40 ->  null 

        //
        System.out.println(sll.search(10)); // output: true

## For the doubly Linkedlist usage

        // insertion of elements or data
        dll.insertEnd(50);
        dll.insertEnd(40);
        dll.insertBeginning(5);
        dll.insertAt(30, 2);

        // displays the list
        dll.displayForward();       // output: 5 -> 50 -> 30 -> 40 -> Null
        dll.displayBackwards();     // output: 40 -> 30 -> 50 -> 5 -> Null

        // deletion in the list
        dll.deletionByValue(40);    

        // searches for the element 
        System.out.println(dll.search(40)); // false

        

## For Circular Linkedlist usage

        // insertion of eleemnts or data
        cll.insertBeginning(1);
        cll.insertEnd(4);
        cll.insertEnd(3);

        // displays the list
        cll.display(); //output: 1 -> 4 -> 3 -> head

## End note
Sir thank you sir for understanding and giving me this opportunity to learn by myself.
I want to apologize that this is the only output that I managed to produce & possibly 
can't finish PT 2 due to all of our other subjects have the same due date. I home you 
understand it sir and thank you sir that I learned something at least. Also I'm tired 
I can't  do any more line by line explanation.

