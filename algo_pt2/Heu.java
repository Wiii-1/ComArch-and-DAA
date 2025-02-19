import java.util.*;

public class Heu {
    public static void main (String[] args){
        Map<Integer, Integer> heuristic = new HashMap<>();
        heuristic.put(0, 0);
        heuristic.put(1, 5);
        heuristic.put(2, 7);
        heuristic.put(3, 8);
        heuristic.put(4, 3);
        heuristic.put(5, 2);
        heuristic.put(6, 6);
        heuristic.put(7, 1);
        heuristic.put(8, 9);
        heuristic.put(9, 1);
        heuristic.put(10, 10);

        Map<Integer, List<Integer>> graph = new HashMap<>();

        graph.put(0, Arrays.asList(1, 2, 3));
        graph.put(1, Arrays.asList(0, 4, 5));
        graph.put(2, Arrays.asList(0, 6, 7));
        graph.put(3, Arrays.asList(0, 8, 9));
        graph.put(4, Arrays.asList(1));
        graph.put(4, Arrays.asList(1));
        graph.put(5, Arrays.asList(9));
        graph.put(6, Arrays.asList(2));

        int start = 1, goal = 9;
        greedyBesFirstSearch(graph, heuristic, start, goal);

    }

    public static void greedyBesFirstSearch (Map<Integer, List<Integer>> graph, Map<Integer,Integer> heuristic, int start, int goal){
        PriorityQueue<Integer> openSet = new PriorityQueue<>(Comparator.comparingInt(heuristic::get));
        Set<Integer> visited = new HashSet<>();

        openSet.add(start);

        while(!openSet.isEmpty()){
            int current = openSet.poll();   

            System.out.println("visiting: " + current);

            if( current == goal){
                System.out.println("goal found " + goal);
                return;
            }

            visited.add(current);

            for (int neighbor : graph.getOrDefault(current, new ArrayList<>())){
                if (!visited.contains(neighbor)){
                    openSet.add(neighbor);
                }
            }
        }
        System.out.println(" No path found");
    }          
}
