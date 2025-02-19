import java.util.*;

public class Backtracking {
    private Map<Integer, List<Integer>> graph =  new HashMap<>();

    public void addEdge(int u, int v){
        graph.putIfAbsent(v, new ArrayList<>());
        graph.putIfAbsent(u, new ArrayList<>());

        graph.get(u).add(v);
        graph.get(v).add(u);
    }
    
    public void dfs (int node, Set<Integer> visited) {
        if (visited.contains(node)) return;

        System.out.print(node + " ");
        visited.add(node);

        for (int neighbor : graph.getOrDefault(node, new ArrayList<>())){
            dfs(neighbor, visited);
        }   
    }
    public static void main(String[] args) {
        Backtracking backtracking = new Backtracking();
        backtracking.addEdge(0, 1);
        backtracking.addEdge(0, 2);     
        backtracking.addEdge(1, 2);
        backtracking.addEdge(2, 0);
        backtracking.addEdge(2, 3);
        backtracking.addEdge(3, 3);

        Set<Integer> visited = new HashSet<>();
        backtracking.dfs(1, visited);
    }
}   
