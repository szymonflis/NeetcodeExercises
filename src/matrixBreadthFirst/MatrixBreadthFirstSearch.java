package matrixBreadthFirst;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class MatrixBreadthFirstSearch {

    public int shortestPath(int[][] inputGrid){
        //max rows and columns
        int ROWS = inputGrid.length;
        int COLS = inputGrid[0].length;
        //hashset to store visits
        Set<String> visits = new HashSet<>();
        //queue for processing possible movements
        Queue<int[]> queue = new LinkedList<>();
        //add the starting position
        queue.add(new int[]{0,0});
        visits.add("0,0");

        int length = 0;

        while(!queue.isEmpty()){
            //while there is something in the queue, loop through it
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                //poll removes the first item in a queue and returns it
                //the item that is popped it the current cell, we now want to see where we can go from ehre
                int[] cell = queue.poll();
                int row = cell[0];
                int column = cell[1];
                //if end destination then return the length of the path
                if(row == ROWS - 1 && column == COLS - 1 ){
                    return length;
                }
                //right, left, down, up
                int[][] possibleMovements = {{0,1},{0,-1},{1,0},{-1,0}};
                //extract each movement out of possible movements and validate whether it is allowed
                for(int[] movement : possibleMovements) {
                    int destinationRow = movement[0];
                    int destinationColumn = movement[1];
                    //edge cases:
                    //if row or column are less than 0
                    //OR row or column are greater than the grid rows or columns
                    //OR a space is non-traversable AKA a 1
                    //if any of these are met this cell can be skipped using continue
                    if (Math.min(row + destinationRow, column + destinationColumn) < 0
                            || row + destinationRow == ROWS
                            || column + destinationColumn == COLS
                            || visits.contains((row + destinationRow) + "," + (column + destinationColumn))
                            || inputGrid[row + destinationRow][column + destinationColumn] == 1) {continue;}


                    //if it is a valid movement add it to the queue for processing
                    queue.add(new int[]{row + destinationRow, column + destinationColumn});
                    //also add it to the visits hashset so it is not visited again
                    visits.add((row + destinationRow) + "," + (column + destinationColumn));
                }
            }
            length++;
        }
        return -1;
    }
}
