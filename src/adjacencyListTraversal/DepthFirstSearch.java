package adjacencyListTraversal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class DepthFirstSearch {

    public int dfs(String node, String targetNode, HashMap<String, ArrayList<String>> adjacencyList, HashSet<String> visits){

        //if the starting node has already been visited then return 0 as there is 0 paths
        if(visits.contains(node))
            return 0;

        //if the target is reached return 1 as there is a valid path

        if(node == targetNode)
            return 1;

        int count = 0;
        visits.add(node);


        //loop through the connected neighbours to the current node and use recursion to find paths
        for(String neighbour: adjacencyList.get(node)){
            count+= dfs(neighbour, targetNode, adjacencyList, visits);
        }
        visits.remove(node);
        return count;

    }

}
