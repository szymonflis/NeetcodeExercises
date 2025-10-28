package adjacencyListTraversal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class AdjacencyListTraversalRunner {

    public static HashMap<String, ArrayList<String>> buildAdjacencyList(){

        //build an empty adjacency list using a hashmap which stores a key and an array of strings (destinations)

        HashMap<String, ArrayList<String>> adjacencyList = new HashMap<>();

        //all connections
        String[][] edges = {{"A", "B"}, {"B", "C"}, {"B", "E"}, {"C", "E"}, {"E", "D"}};

        for(String[] edge : edges){
            String staringPoint = edge[0];
            String destination = edge[1];
            //if the starting point node is not a key in the adjacency list, add it along with a blank array to store its destinations
            if(!adjacencyList.containsKey(staringPoint)){
                adjacencyList.put(staringPoint, new ArrayList<>());
            }
            //if the destination node is not a key in the adjacency list, add it along with a blank array to store its destinations
            if(!adjacencyList.containsKey(destination)){
                adjacencyList.put(destination, new ArrayList<>());
            }
            adjacencyList.get(staringPoint).add(destination);
        }
        return adjacencyList;
    }

    public static void main(String[] args) {

        HashMap<String, ArrayList<String>> adjacencyList = buildAdjacencyList();
        HashSet<String> visits = new HashSet<>();
        DepthFirstSearch depthFirstSearch = new DepthFirstSearch();
        BreadthFirstSearch breadthFirstSearch = new BreadthFirstSearch();

        //traversing Adjacency lists is much easier as we do not have to account for edge cases
        //O(n^Vertices)
        System.out.println(depthFirstSearch.dfs("A", "D", adjacencyList, visits));

        //O(V + E)
        System.out.println(breadthFirstSearch.bfs("A", "D", adjacencyList, visits));





    }
}
