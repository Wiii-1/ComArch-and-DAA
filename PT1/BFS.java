import java.util.*;

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

        performanceMonitor monitor = new performanceMonitor();

        monitor.start();
        BFS bfs = new BFS();
        bfs.addEdge(1, 2);
        bfs.addEdge(1, 3);
        bfs.addEdge(2, 4);
        bfs.bfs(3);

        
        

        monitor.stop();



        performanceMonitor.getClassFileSize("/bin/BFS");

        
        
    }
}
