
import java.io.File;

public class performanceMonitor { 
    private long startTime;
    private long startMemory;

    public void start() {
        for (int i = 0; i < 3; i++) {
            System.gc();
            try { Thread.sleep(20); } catch (InterruptedException ignored) {}
        }
        startMemory = getUsedMemory();
        startTime = System.nanoTime();
    }

    public String stopAndReturn(String className) { 
        long endTime = System.nanoTime();
        long endMemory = getUsedMemory();
    
        double timeElapsed = (endTime - startTime) / 1e6; 
        double memoryUsed = (endMemory - startMemory) / 1024.0; 
        double fileSize = getClassFileSize(className);
    
        
        StringBuilder result = new StringBuilder();
        result.append("---------------------------------------------------\n");
        result.append("Class: ").append(className).append("\n");
        result.append(String.format("Execution Time: %.4f ms\n", timeElapsed));
        result.append(String.format("Memory Used: %.4f KB\n", memoryUsed));
        if (fileSize == -1) {
            result.append("Class file not found! Make sure it's compiled.\n");
        }
        result.append(String.format("Class File Size: %.2f KB\n", fileSize));
        result.append("---------------------------------------------------\n");
    
        return result.toString(); 
    }
    

    private long getUsedMemory() {
        Runtime runtime = Runtime.getRuntime();
        return (runtime.totalMemory() - runtime.freeMemory());
    }

    private double getClassFileSize(String classFileName) {
        
        String classFilePath = "D:/ComArch-and-DAA/Prelim/DAA/PT1/bin/PT1/" + classFileName + ".class";
        File file = new File(classFilePath);
    
        
        System.out.println("[DEBUG] Checking file: " + file.getAbsolutePath());
    
        if (file.exists()) {
            return file.length() / 1024.0; 
        } else {
            return -1;
        }
    }
    
    
}
