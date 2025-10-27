package matrixBreadthFirst;


//mainly used for shortest path problems


public class MatrixBreadthFirstSearchRunner {

    public static void main(String[] args) {

        int[][] inputGrid = {{0, 0, 0, 0},
                             {1, 1, 0, 0},
                             {0, 0, 0, 1},
                             {0, 1, 0, 0}};

        MatrixBreadthFirstSearch matrixBreadthFirstSearch = new MatrixBreadthFirstSearch();
        System.out.println(matrixBreadthFirstSearch.shortestPath(inputGrid));

        }

    }

