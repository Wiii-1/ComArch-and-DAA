package com.mycompany.pt1_continuation;
import java.util.*;

public class Graphs {
    private Map<Integer, List<Integer>> adjList = new HashMap<>();

    public void addEdge(int u, int v) {
        adjList.putIfAbsent(u, new ArrayList<>());
        adjList.putIfAbsent(v, new ArrayList<>());
        adjList.get(u).add(v);
        adjList.get(v).add(u);
    }

    public void runGraph(int size) {
        for (int i = 0; i < size - 1; i++) {
            addEdge(i, i + 1);
        }
    }
}
