import java.util.*;

public class TSPBranchBound {
    private static final int INF = Integer.MAX_VALUE;
    private int n;
    private int [][] graph;
    private int minCost = INF;
    private List<Integer> bestPath;

    public TSPBranchBound (int[][]graph) {
        this.graph = graph;
        this.n = graph.length;
        this.bestPath = new ArrayList<>();
    }

    private void branchandBound(int level, int cost, boolean [] visited, List<Integer> path) {
        if ( level == n ) {
            int finalCost = cost + graph[path.get(level - 1)][path.get(0)];
            if (finalCost < minCost) {
                minCost = finalCost;
                bestPath = new ArrayList<>(path);
                bestPath.add(path.get(0));
            }
            return;
        }
        
        for (int i = 0; i < n; i++){
            if (!visited[i] && graph[path.get(level - 1)][i] != 0){
                visited[i] = true;
                path.add(i);

                branchandBound(level + 1, cost + graph[path.get(level - 1)][i], visited, path);

                visited [i] = false;
                path.remove(path.size() -1 );
                
            }
        }
    }

    public void solve(){
        boolean [] visited = new boolean[n];
        visited[0] = true;
        List<Integer> path = new ArrayList<>();
        path.add(0);
        branchandBound(1,0, visited,path);

        System.out.println("Minimum Costt: " + minCost);
        System.out.println("Best Path: " + bestPath);
    }

    public static void main(String[] args) {
        int[][] graph = {
            {INF, 10,  15, 40 , 20},
            {10, INF,  35, 25 , 20},
            {15,  35, INF, 30 , 80},
            {20,  25,  30, INF, 90},
            {40,  50,  10, 19, INF}
        };
        TSPBranchBound tsp = new TSPBranchBound(graph);
        tsp.solve();
    }

}