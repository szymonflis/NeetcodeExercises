Matrix Depth-First Search

You are given a binary matrix Grid where 0s represent land and 1s represent rocks that can not be traversed.

Return the number of unique paths from the top-left corner of Grid to the bottom-right corner such that all traversed cells are land cells. You may only move vertically or horizontally through land cells. For an individual unique path you cannot visit the same cell twice.

Example 1:

Input: grid = [
[0, 0, 0, 0],
[1, 1, 0, 0],
[0, 0, 0, 1],
[0, 1, 0, 0]
]

Output:
2