// File name: Graph2Questions.java

public class Graph2Questions {

    public static void main(String[] args) {

        // GRAPH-02 QUESTIONS
        // Q1. Mother Vertex
        // We have a Directed Graph. Find a Mother Vertex in the graph (if present).
        // A Mother Vertex is a vertex through which we can reach all the other vertices
        // of the graph.
        // Input (figure) - directed edges:
        //   1 -> 0,  0 -> 2,  2 -> 1,  0 -> 3,  3 -> 4
        // Output : 0
        // TODO: write your code here
        // Q2. Union-Find
        // Here implement the Union-Find algorithm to check whether an undirected graph
        // contains a cycle or not.
        // Sample Input 1 (figure) - undirected edges:
        //   9 - 5,  5 - 2,  9 - 1,  1 - 5,  2 - 7
        // Sample Output 1 : Yes
        // TODO: write your code here
        // Q3. Find whether it is possible to finish all tasks or not
        // There are a total of n tasks you have to pick, labelled from 0 to n-1.
        // Some tasks may have prerequisites, for example to pick task 0 you have to first
        // pick task 1, which is expressed as a pair: [0, 1].
        // Given the total number of tasks and a list of prerequisite pairs, is it possible
        // for you to finish all tasks?
        // Sample Input 1 : [[1, 0], [0, 1]]     Sample Output 1 : false
        // Sample Input 2 : [[1, 0]]             Sample Output 2 : true
        // TODO: write your code here
        // Q4. Alien Dictionary
        // We have a sorted dictionary of an alien language having N words and k starting
        // alphabets of the standard dictionary. Find the order of characters in the alien language.
        // Many orders may be possible for a particular test case, thus you may return any valid
        // order, and the output will be 1 if the order of the string returned by the function is
        // correct, else 0 denoting an incorrect string returned.
        // Sample Input 1 :
        //   N = 3, K = 3
        //   dict = {"caa", "aaa", "aab"}
        // Sample Output 1 : 1
        // Sample Input 2 :
        //   N = 5, K = 4
        //   dict = {"baa", "abcd", "abca", "cab", "cad"}
        // Sample Output 2 : 1
        // TODO: write your code here
        // Q5. Find number of closed islands
        // We have a binary matrix mat[][] of dimensions N x M such that 1 denotes land and
        // 0 denotes water. Find the number of closed islands in the given matrix.
        // A closed island is a group of 1s that is surrounded by only 0s on all four sides
        // (excluding diagonals). If any 1 is at the edges of the given matrix then it is not
        // considered part of a closed island, as it is not surrounded by all 0's.
        // Sample Input 1 :
        //   N = 3, M = 3
        int[][] mat1 = {{1, 0, 0},
        {0, 1, 0},
        {0, 0, 1}};
        // Sample Output 1 : 1
        // Sample Input 2 :
        //   N = 5, M = 8
        int[][] mat2 = {{0, 0, 0, 0, 0, 0, 0, 1},
        {0, 1, 1, 1, 1, 0, 0, 1},
        {0, 1, 0, 1, 0, 0, 0, 1},
        {0, 1, 1, 1, 1, 0, 1, 0},
        {0, 0, 0, 0, 0, 0, 0, 1}};
        // Sample Output 2 : 2
        // TODO: write your code here

    }
}
