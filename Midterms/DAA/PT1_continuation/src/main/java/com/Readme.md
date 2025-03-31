# This is the Continuation of the performance task on prelim the data structures and algorithms
# on this continuation will be the analysis of the data structures & algorithms.
# In this analysis continuation, I have created a java file that'll monitor the execution speed,
# memory used, and the file size of the java class when compiled in different input sizes.

# the Analysis java file is the code script that will monitor the performance of each data structure & algorithms.


## Features of this java project

- Implementation of common data structures:
  - Binary Search Tree (BST)
  - Breadth-First Search (BFS)
  - Graphs
  - Max Heap and Min Heap
  - Priority Queue
  - Queues and Stacks
  - Singly Linked List
  - Doubly Linked List
  - Circular Linked List
- Performance analysis of data structures:
  - Execution time
  - Memory usage
  - Class file size

## how to use 

### First

to the analysis file you need to add the class file you created in the run test method.
the runtest method checks type and the cast ds to Stacks and run runStack(1000).

example

    (ds instanceOf CircularDoubly) ((CircularDoubly) ds).runCircularDoubly(size);

you need to implement this on the files to check for class type and to be able to add the input.

### Second

you need to add it in the list for the results to show and be printed of course, because it'll be looped through.

add it here

example 
    results.add(runtest(new CircularDoubly(), "CircularDoubly", size));

do not becareful in adding spaces in the classname cause it'll be hard for the script to find the class file where it was compiled.

that's pretty much you're gonna need to use this.

