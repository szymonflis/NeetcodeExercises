package DijkstrasShortestPath;

import java.util.*;

public class Dijkstras {

    public Map<Integer, Integer> shortestPathByWeight(int numberOfNodes, List<List<Integer>> edges, int src){

//        edges = {{0,1,10}, {0,2,3}, {1,3,2}, {2,1,4}, {2,3,8}, {2,4,2}, {3,4,5}};

        // create an empty adjacency list and loop through numberOfNodes passed into the algorithm and make an entry for them in the list
        //They key is the node and the value is destination and weight to get there
        Map<Integer, List<int[]>> adjacencyList = new HashMap<>();
        for (int i = 0; i < numberOfNodes; i++) {
            adjacencyList.put(i, new ArrayList<>());
        }

        for (List<Integer> edge: edges) {
            //each edge is a tuple with the startingNode, Destination, Weighting
            int source = edge.get(0);
            int destination = edge.get(1);
            int weight = edge.get(2);
            //For each key in the adjacency list add each of the destinations and weights it can go to
            adjacencyList.get(source).add(new int[]{destination, weight});
        }


        //begin processing
        Map<Integer, Integer> shortestPath = new HashMap<>();
        PriorityQueue<int[]> minHeap = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        //add the source node with weight 0 into the priority queue as it takes nothing to get there
        minHeap.offer(new int[]{0, src});

        //pull node from the priority queue
        while (!minHeap.isEmpty()){
            int[] current = minHeap.poll();
            int weight1 = current[0];
            int desintationNode1 = current[1];
            //check if we have already visited, if yes then continue
            if(shortestPath.containsKey(desintationNode1))
                continue;
            //if no then add it to our shortest
            shortestPath.put(desintationNode1, weight1);

            for (int[] edge: adjacencyList.get(desintationNode1)) {
                int desintationNode2 = edge[0];
                int weight2 = edge[1];
                if (!shortestPath.containsKey(desintationNode2)) {
                    minHeap.offer(new int[]{weight1 + weight2, desintationNode2});
                }
            }
        }
        for (int i = 0; i < numberOfNodes; i++) {
            shortestPath.putIfAbsent(i, -1);

        }

        return shortestPath;
    }

}
