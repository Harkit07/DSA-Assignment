// File name: BacktrackingQuestions.java

public class BacktrackingQuestions {

    public static void main(String[] args) {

        // BACKTRACKING QUESTIONS
        // Note: These are classical questions. Please positively solve them.
        // Q1. Rat in a Maze
        // You are given a starting position for a rat which is stuck in a maze at an initial
        // point (0, 0) (the maze can be thought of as a 2-dimensional plane). The maze would be
        // given in the form of a square matrix of order N * N where the cells with value 0
        // represent the maze's blocked locations while value 1 is the open/available path that
        // the rat can take to reach its destination. The rat's destination is at (N - 1, N - 1).
        // Your task is to find all the possible paths that the rat can take to reach from
        // source to destination in the maze.
        // The possible directions that it can take to move in the maze are:
        //   'U' (up)    i.e. (x, y - 1)
        //   'D' (down)  i.e. (x, y + 1)
        //   'L' (left)  i.e. (x - 1, y)
        //   'R' (right) i.e. (x + 1, y)
        // (This problem is similar to Grid ways.)
        // Sample Input :
        int[][] maze = {{1, 0, 0, 0},
        {1, 1, 0, 1},
        {0, 1, 0, 0},
        {1, 1, 1, 1}};
        // Sample Output :
        //   1 0 0 0
        //   1 1 0 0
        //   0 1 0 0
        //   0 1 1 1
        // TODO: write your code here

        // Q2. Keypad Combinations
        // Given a string containing digits from 2-9 inclusive, print all possible letter
        // combinations that the number could represent. You can print the answer in any order.
        // A mapping of digits to letters (just like on the telephone buttons) is given below.
        // Note that 1 does not map to any letters.
        //   2 -> abc    3 -> def
        //   4 -> ghi    5 -> jkl    6 -> mno
        //   7 -> pqrs   8 -> tuv    9 -> wxyz
        // Sample Input 1 : digits = "23"
        // Sample Output 1 : "ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"
        // Sample Input 2 : digits = "2"
        // Sample Output 2 : "a", "b", "c"
        // Sample Input 3 : digits = ""
        // Sample Output 3 : ""
        // TODO: write your code here
        // Q3. Knight's Tour
        // Given an N*N board with the Knight placed on the first block of an empty board.
        // Moving according to the rules of chess, the knight must visit each square exactly once.
        // Print the order of each cell in which they are visited.
        // Sample Input 1 : N = 8
        // Sample Output 1 :
        //    0 59 38 33 30 17  8 63
        //   37 34 31 60  9 62 29 16
        //   58  1 36 39 32 27 18  7
        //   35 48 41 26 61 10 15 28
        //   42 57  2 49 40 23  6 19
        //   47 50 45 54 25 20 11 14
        //   56 43 52  3 22 13 24  5
        //   51 46 55 44 53  4 21 12
        // Hint: similar to N Queens.
        // TODO: write your code here
    }
}
