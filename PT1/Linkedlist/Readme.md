## Linkedlist

This the 3 types of linkedlist 

Singly   Linkedlist
Doubly   Linkedlist
Circular Linkedlist

Singly Linkedlist - is a type of list that stores data in a node in split into two, the left is for the data and the for the right it stores the pointer that points to the next node/data.

Doubly linkedlist - is also same with the singly linkedlist that also stores data in a node but in this type of linkedlist where the node is split into 3 parts where the data is in the middle the left part is the pointer that points to the previous node and for the right part is the pointer that points to the next node.

Circular Linkedlist - is a mix of singly and doubly but not all of the features of the both has. Circular is only where the node is split into 2 but the tail which is the last node points to the head to loop it back around.

In simpler terms linked list is just a list where everything you list is a data and is being stored in a node that also contains a pointer or address to the next node or the next data in the list. 

## Features

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

## Code examples

## Singly Linkedlist


    void insertEnd(int data) {
        Node newNode = new Node(data);              // this line right here is the 
                                                    // just creating the node that stores the data withing

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



The three sets of codes you see above is the singly, doubly, circular linkedlist with it's explanation of it's function. One can use this types of linkedlist in the real world is the music player.

## Usage

# For the singly linklist usage

        // insertion of elements or data
        sll.insertEnd(30);
        sll.insertEnd(40);
        sll.insertBeginning(10);
        sll.insertAt(20, 2);

        // displays the list
        sll.display();   // output: 10 -> 30 -> 20 -> 40 ->  null 

        //
        System.out.println(sll.search(10)); // output: true

# For the doubly Linkedlist usage

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

        

# For Circular Linkedlist usage

        // insertion of eleemnts or data
        cll.insertBeginning(1);
        cll.insertEnd(4);
        cll.insertEnd(3);

        // displays the list
        cll.display(); //output: 1 -> 4 -> 3 -> head




