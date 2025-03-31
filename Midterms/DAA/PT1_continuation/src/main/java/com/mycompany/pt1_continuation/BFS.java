package com.mycompany.pt1_continuation;
import java.util.*;

public class BFS {
    private Map<Integer, List<Integer>> graph = new HashMap<>();
    
    public void addEdge(int u, int v) {
        graph.putIfAbsent(u, new ArrayList<>());
        graph.putIfAbsent(v, new ArrayList<>());
        graph.get(u).add(v);
        graph.get(v).add(u);
    }

    public void runBFS(int size) {
        for (int i = 0; i < size - 1; i++) {
            addEdge(i, i + 1);
        }
        bfs(0);
    }

    private void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();

        queue.add(start);
        visited.add(start);

        while (!queue.isEmpty()) {
            int node = queue.poll();
            for (int neighbor : graph.get(node)) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.add(neighbor);
                }
            }
        }
    }
}
