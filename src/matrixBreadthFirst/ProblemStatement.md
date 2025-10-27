Matrix Breadth-First Search
Solved
You are given a binary matrix Grid where 0s represent land and 1s represent rocks that can not be traversed.

Return the length of the shortest path from the top-left corner of Grid to the bottom-right corner such that all traversed cells are land cells. You may only move vertically or horizontally through land cells.

Note:

If there is no such path, return -1.
The length of a path is the number of moves from the starting cell to the ending cell.
Example 1:

Input: grid = [
[0, 0, 0, 0],
[1, 1, 0, 0],
[0, 0, 0, 1],
[0, 1, 0, 0]
]

Output:
6