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

Singly Linkedlist


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

        System.out.print(" null ");
    }



Doubly Linkedlist

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






the code above is the method to add a node or data in the end of the list. The insert beginning is the same but without the traversal and the effort of traversing and creating 
a pointer connection to the next node, the insert at is inserting in between the node and linking it properly and properly inserting it.



