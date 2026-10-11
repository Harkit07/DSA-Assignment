// File name: DPQuestions.java

public class DPQuestions {

    public static void main(String[] args) {

        // DP QUESTIONS
        // Q1. Tribonacci Numbers
        // The Tribonacci series is a generalization of the Fibonacci sequence where each term is
        // the sum of the three preceding terms.
        // a(n) = a(n-1) + a(n-2) + a(n-3) with a(0) = a(1) = 0, a(2) = 1.
        // Input : 5
        // Output : 0, 0, 1, 1, 2
        // Input : 10
        // Output : 0, 0, 1, 1, 2, 4, 7, 13, 24, 44
        // Input : 20
        // Output : 0, 0, 1, 1, 2, 4, 7, 13, 24, 44, 81, 149, 274, 504, 927, 1705, 3136, 5768, 10609, 19513
        // TODO: write your code here
        // Q2. Print all combinations of balanced parentheses
        // Write a function to generate all possible n pairs of balanced parentheses.
        // Input  : n = 1
        // Output : {}
        // Input  : n = 2
        // Output : {}{} {{}}
        // TODO: write your code here
        // Q3. Maximum profit after buying and selling stocks with transaction fees
        // We have an array of positive integers containing the price of stocks and a transaction fee.
        // The task is to find the maximum profit and the difference of days on which you are getting
        // the maximum profit.
        // Input  : arr[] = {6, 1, 7, 2, 8, 4}, transactionFee = 2
        // Output : 8 1
        // Input  : arr[] = {7, 1, 5, 3, 6, 4}, transactionFee = 1
        // Output : 5 1
        // TODO: write your code here
        // Q4. Longest Increasing Path in Matrix
        // We have a matrix of N rows and M columns. From m[i][j], we can move to m[i+1][j]
        // if m[i+1][j] > m[i][j], or can move to m[i][j+1] if m[i][j+1] > m[i][j].
        // The task is to print the longest path length if we start from (0, 0).
        // Input : N = 4, M = 4
        int[][] m = {{1, 2, 3, 4},
        {2, 2, 3, 4},
        {3, 2, 3, 4},
        {4, 5, 6, 7}};
        // Output : 7
        //   Longest path is 1 2 3 4 5 6 7.
        // Input : N = 2, M = 2
        //   m[][] = { { 1, 2 },
        //             { 3, 4 } };
        // Output : 3
        //   Longest path is either 1 2 4 or 1 3 4.
        // TODO: write your code here

        // Q5. Number of Parenthesis Combinations
        // Given N number of parentheses (pairs of opening and closing parentheses), you have to
        // count all the valid combinations of the parentheses.
        // Input : N = 4
        // Output : 14
        // // Following 14 combinations
        // {
        //   (((()))), ((()())), ((())()), ((()))(), (()(())), (()()())
        //   (()())(), (())(()), (())()(), ()((())), ()(()()), ()(())()
        //   ()()(()), ()()()()
        // }
        // TODO: write your code here
        // ---------------- Practice on Platform ----------------
        // Q6. House Thief (MEDIUM)
        // https://leetcode.com/problems/house-robber/
        // Q7. Longest Palindromic Subsequence (MEDIUM)
        // https://leetcode.com/problems/longest-palindromic-subsequence/
        // Q8. Equal Subset Sum Difference (MEDIUM)
        // https://leetcode.com/problems/partition-equal-subset-sum/
        // Q9. Mountain Array (Longest Bitonic Subsequence) (HARD)
        // https://leetcode.com/problems/minimum-number-of-removals-to-make-mountain-array/
        // Q10. Box Stacking (HARD)
        // https://leetcode.com/problems/maximum-height-by-stacking-cuboids/
    }
}
