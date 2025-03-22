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

    
    public void stop() {
        long endTime = System.nanoTime();
        long endMemory = getUsedMemory();
        
        double timeElapsed = (endTime - startTime) / 1e6; 
        double memoryUsed = (endMemory - startMemory) / 1024.0; 
        
        System.out.printf("Completed in: %.4f ms\n", timeElapsed);
        System.out.printf("Memory used: %.4f KB\n", memoryUsed);
    }

    
    private long getUsedMemory() {
        Runtime runtime = Runtime.getRuntime();
        return (runtime.totalMemory() - runtime.freeMemory());
    }
    
    
    public static void getClassFileSize(String className) {
        
        String binPath = System.getProperty("user.dir") + File.separator + "bin" + File.separator;
        String classFilePath = binPath + className.replace(".", File.separator) + ".class";

        File file = new File(classFilePath);
        System.out.println("Checking file: " + classFilePath); 

        if (file.exists()) {
            System.out.printf("Class File Size: %.2f KB\n", file.length() / 1024.0);
        } else {
            System.out.println("Class file not found! Make sure it's compiled.");
        }
    }
}
