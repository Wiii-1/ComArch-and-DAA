import java.io.File;

public class performanceMonitor { 
    private long startTime;
    private long startMemory;

    public void start() {
        for (int i = 0; i < 3; i++) {
            System.gc();
            try { Thread.sleep(50); } catch (InterruptedException ignored) {}
        }

        startMemory = getUsedMemory();
        startTime = System.nanoTime();
    }

    public void stop(String className) {
        long endTime = System.nanoTime();
        long endMemory = getUsedMemory();

        double timeElapsed = (endTime - startTime) / 1e6; 
        double memoryUsed = (endMemory - startMemory) / 1024.0; 
        double fileSize = getClassFileSize("bin/PT1/BST.class");



; 

        // Print the Performance Results
        System.out.println("---------------------------------------------------");
        System.out.println("Class: " + className);
        System.out.printf("Execution Time: %.4f ms\n", timeElapsed);
        System.out.printf("Memory Used: %.4f KB\n", memoryUsed);
        if (fileSize == -1) {
            System.out.println("Class file not found! Make sure it's compiled.");
            System.out.printf("Class File Size: %.2f KB\n", fileSize);
        } else {
            System.out.printf("Class File Size: %.2f KB\n", fileSize);
        }
        System.out.println("---------------------------------------------------\n");
    }

    private long getUsedMemory() {
        Runtime runtime = Runtime.getRuntime();
        return (runtime.totalMemory() - runtime.freeMemory());
    }

    private double getClassFileSize(String classFilePath) {
        File file = new File(classFilePath);
    
        
        System.out.println("Checking file: " + file.getAbsolutePath());
    
        if (file.exists()) {
            return file.length() / 1024.0; 
        } else {
            return -1;
        }
    }
    
}
