package matrixDepthFirst;

import java.util.HashSet;
import java.util.Set;

public class MatrixDepthFirstSearch {

    public int countPaths(int[][] grid){

        return traverseMatrix(grid, 0, 0, new HashSet<>());
    }

    private int traverseMatrix(int[][] grid, int row, int column, Set<String> visits) {
        int ROWS = grid.length;
        int COLUMNS = grid[0].length;

        // edge cases:
        // if row or column are less than 0
        // OR row or column are greater than the grid rows or columns
        // OR a space is non traversable THEN return 0

        if (Math.min(row, column) < 0
            || row == grid.length || column == grid[0].length
            ||  visits.contains(row + "," + column)
            ||  grid[row][column] == 1)
            return 0;


        //If the end position is reached then return 1 as it is a valid path
        if (row == ROWS - 1  && column == COLUMNS -1 ) {return 1;}

        visits.add(row + "," + column);
        int count = 0;

        //down movement (depth + 1)
        count += traverseMatrix(grid, row + 1, column, visits);
        //up movement (depth - 1)
        count += traverseMatrix(grid, row - 1, column, visits);
        //right movement
        count += traverseMatrix(grid, row, column + 1, visits);
        //lef movement
        count += traverseMatrix(grid, row, column - 1, visits);


        //remove the visit when recursively calling the algorithm so that another path can reuse it
        visits.remove(row + "," + column);

        return count;
    }
}
