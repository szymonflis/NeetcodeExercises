package adjacencyListTraversal;

import java.util.*;

public class BreadthFirstSearch {

    //shortest path
    public int bfs (String node, String target,  HashMap<String, ArrayList<String>> adjacencyList, HashSet<String> visits){

        //start length at 0
        int length = 0;
        //add the starting node to visited hashset and to the processing queue
        visits.add(node);
        Queue<String> processingQ = new LinkedList<>();
        processingQ.add(node);

        while(!processingQ.isEmpty()){
            int queueLength = processingQ.size();
            //loop through each item in the processing queue
            for (int i = 0; i < queueLength; i++) {
                //pop the current node and see if it is the end goal
                String currentNode = processingQ.poll();
                if(currentNode.equals(target)){
                    return length;
                }
                //if not, loop through its connections and check if they have been visited, if not add it to the set and to the queue for processing
                for(String neighbour: adjacencyList.get(currentNode)){
                    if(!visits.contains(neighbour)){
                        visits.add(neighbour);
                        processingQ.add(neighbour);
                    }
                }
            }
            //increase length of path
            length++;
        }
        return length;
    }

}
