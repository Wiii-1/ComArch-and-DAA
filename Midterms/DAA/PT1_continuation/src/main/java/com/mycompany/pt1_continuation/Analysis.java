package com.mycompany.pt1_continuation;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class Analysis {
    public static void main(String[] args) {
        System.out.println("Running Data Structure Analysis...");

        int[] inputSizes = {100, 1000, 10000, 100000, 1000000};

        for (int size : inputSizes) {
            System.out.println("\n===============================");
            System.out.println("[DEBUG] Running Tests with Input Size: " + size);
            System.out.println("===============================\n");
            System.out.flush();
            
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        
            List<String> results = new ArrayList<>();
            results.add(runTest(new BST(), "BST", size));
            results.add(runTest(new BFS(), "BFS", size));
            results.add(runTest(new Graphs(), "Graphs", size));
            results.add(runTest(new MaxHeap(), "MaxHeap", size));
            results.add(runTest(new MinHeap(), "MinHeap", size));
            results.add(runTest(new PriorityQueueClass(), "PriorityQueueClass", size));
            results.add(runTest(new Queues(), "Queues", size));
            results.add(runTest(new Stacks(), "Stacks", size));
            results.add(runTest(new Singly(), "Singly", size));
            results.add(runTest(new Doubly(), "Doubly", size));
            results.add(runTest(new Circular(), "Circular", size));
        
            System.out.println("\n========= PERFORMANCE RESULTS =========");
            System.out.println("Input Size: " + size);
            for (String res : results) {
                System.out.println(res);
            }
            System.out.println("========================================\n");
            System.out.println("[DEBUG] COMPLETED Tests with Input Size: " + size);
            System.out.flush();

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Data Structure Analysis Completed.");
    }

    private static String runTest(Object ds, String className, int size) {
        try {
            System.out.println("[DEBUG] Starting " + className + " with size " + size);
            System.out.flush(); 
    
            long startTime = System.nanoTime();

            if (ds instanceof BST) ((BST) ds).runBST(size);
            else if (ds instanceof BFS) ((BFS) ds).runBFS(size);
            else if (ds instanceof Graphs) ((Graphs) ds).runGraph(size);
            else if (ds instanceof MaxHeap) ((MaxHeap) ds).runMaxHeap(size);
            else if (ds instanceof MinHeap) ((MinHeap) ds).runMinHeap(size);
            else if (ds instanceof PriorityQueueClass) ((PriorityQueueClass) ds).runPriorityQueue(size);
            else if (ds instanceof Queues) ((Queues) ds).runQueue(size);
            else if (ds instanceof Stacks) ((Stacks) ds).runStack(size);
            else if (ds instanceof Singly) ((Singly) ds).runSingly(size);
            else if (ds instanceof Doubly) ((Doubly) ds).runDoubly(size);
            else if (ds instanceof Circular) ((Circular) ds).runCircular(size);
    
            long endTime = System.nanoTime();
            double executionTime = (endTime - startTime) / 1_000_000.0;
            long memoryUsed = (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / 1024;
            double fileSize = getClassFileSize(className);
    
            System.out.println("[DEBUG] Finished " + className + " with size " + size);
            System.out.flush();

            return String.format(
                    "---------------------------------------------------\n" +
                    "Class: %s\nExecution Time: %.4f ms\nMemory Used: %.4f KB\nClass File Size: %.2f KB\n",
                    className, executionTime, (double) memoryUsed, fileSize
            );
    
        } catch (Exception e) {
            System.out.println("[ERROR] Failed: " + className + " with size " + size);
            e.printStackTrace();
            return "---------------------------------------------------\nClass: " + className + "\n[ERROR] Test failed.\n---------------------------------------------------";
        }
    }
    
    
    

    private static double getClassFileSize(String className) {
    String jarPath = "target/PT1_continuation-1.0-SNAPSHOT.jar";

    File jarFile = new File(jarPath);
    if (!jarFile.exists()) {
        System.out.println("[ERROR] JAR file not found at: " + jarPath);
        return 0.00;
    }

    try (ZipFile zipFile = new ZipFile(jarPath)) {
        System.out.println("[DEBUG] Listing JAR contents...");
        List<String> jarEntries = new ArrayList<>();
        zipFile.stream().forEach(entry -> jarEntries.add(entry.getName()));

        jarEntries.stream()
            .filter(name -> name.endsWith(".class"))
            .forEach(name -> System.out.println(" - " + name));

        String classPath = "com/mycompany/pt1_continuation/" + className + ".class";
        System.out.println("[DEBUG] Looking for: " + classPath);

        if (jarEntries.contains(classPath)) {
            ZipEntry entry = zipFile.getEntry(classPath);
            double sizeKB = entry.getSize() / 1024.0;
            System.out.printf("[DEBUG] Found %s in JAR, Size: %.2f KB%n", className, sizeKB);
            return sizeKB;
        } else {
            System.out.println("[ERROR] Class file not found in JAR: " + classPath);
            return 0.00;
        }
    } catch (Exception e) {
        System.out.println("[ERROR] Failed to read JAR file: " + jarPath);
        e.printStackTrace();    
        return 0.00;
    }
}
}
