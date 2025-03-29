import java.util.*;

public class Graphs{
    private Map<Integer, List<Integer>> adjList = new HashMap<>();

    public void addEdge (int u, int v){
        adjList.putIfAbsent(u,  new ArrayList<>());
        adjList.putIfAbsent(v,  new ArrayList<>());
        adjList.get(u).add(v);
        adjList.get(v).add(u);
    }

    public void display(){
        for(int node : adjList.keySet()){
            System.out.println(node + "->" + adjList.get(node));
        }
    }

    public static void main (String[]args){
        Graphs graphs = new Graphs();
        
        graphs.addEdge(1,2);
        graphs.addEdge(1,3);
        graphs.addEdge(2,4);
        graphs.addEdge(4, 5);
        graphs.display();
        
    }

}