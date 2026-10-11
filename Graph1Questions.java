// File name: Graph1Questions.java

public class Graph1Questions {

    public static void main(String[] args) {

        // GRAPH-1 QUESTIONS
        // Q1. Detect cycle in an undirected graph using BFS
        // We have an undirected graph. How to check if there is a cycle in the graph?
        // For example, the following graph has a cycle 1-0-2-1.
        // Input (as pasted):
        //   9 - 5 - 2
        //   |  /    |
        //   1       4
        // Output : Yes
        // TODO: write your code here
        // Q2. Find Minimum Depth of a Binary Tree
        // We have a binary tree, find its minimum depth. The minimum depth is the number of
        // nodes along the shortest path from the root node down to the nearest leaf node.
        // For example, the minimum height of the below binary tree is 2.
        // Sample Input 1 :
        //          1
        //         / \
        //        8   2
        //       / \  /
        //      6  5 9
        // Sample Output 1 : 2
        // TODO: write your code here
        // Q3. Minimum time required to rot all oranges
        // We have a matrix of dimension m*n where each cell can have the value 0, 1 or 2:
        //   0: Empty cell    1: Cell has a fresh orange    2: Cell has a rotten orange
        // We have to determine the minimum time required so that all the oranges become rotten.
        // A rotten orange at index [i, j] can rot other fresh oranges at indexes [i-1, j],
        // [i+1, j], [i, j-1], [i, j+1] (up, down, left and right).
        // If it is impossible to rot every orange then simply return -1.
        // Input:
        int[][] oranges = {{2, 1, 0, 2, 1},
        {0, 0, 1, 2, 1},
        {1, 0, 0, 2, 1}};
        // Output: All oranges cannot be rotten.
        // Explanation:
        //   At 0th time frame:      At 1st time frame:      At 2nd time frame:
        //   {2, 1, 0, 2, 1}         {2, 2, 0, 2, 2}         {2, 2, 0, 2, 2}
        //   {0, 0, 1, 2, 1}         {0, 0, 2, 2, 2}         {0, 0, 2, 2, 2}
        //   {1, 0, 0, 2, 1}         {1, 0, 0, 2, 2}         {1, 0, 0, 2, 2}
        //   ...
        //   The 1 at the bottom-left corner of the matrix is never rotten.
        // TODO: write your code here

        // Q4. Find the size of the largest region in the Boolean Matrix
        // We have a matrix where each cell contains either a '0' or a '1', and any cell containing
        // a 1 is called a filled cell. Two cells are said to be connected if they are adjacent to
        // each other horizontally, vertically, or diagonally. If one or more filled cells are
        // connected, they form a region. Find the size of the largest region.
        // Input:
        int[][] M = {{0, 0, 1, 1, 0},
        {0, 0, 1, 1, 0},
        {0, 0, 0, 0, 0},
        {0, 0, 0, 0, 1}};
        // Output: 4
        // TODO: write your code here

        // Q5. Word Ladder
        // We have a dictionary, and two words 'start' and 'target' (both of the same length).
        // Find the length of the smallest chain from 'start' to 'target' if it exists, such that
        // adjacent words in the chain only differ by one character and each word in the chain is
        // a valid word, i.e., it exists in the dictionary.
        // It may be assumed that the 'target' word exists in the dictionary and the length of all
        // dictionary words is the same.
        // Input:
        //   Dictionary = {POON, PLEE, SAME, POIE, PLEA, PLIE, POIN},
        //   start = TOON, target = PLEA
        // Output: 7
        // Explanation: TOON - POON - POIN - POIE - PLIE - PLEE - PLEA
        // TODO: write your code here
    }
}
