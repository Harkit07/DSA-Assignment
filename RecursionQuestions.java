// File name: RecursionQuestions.java

import java.util.*;

public class RecursionQuestions {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // RECURSION (Basics) QUESTIONS
        // Q1. For a given integer array of size N, find all the occurrences (indices)
        // of a given element (Key) and print them. Use a recursive function to solve this problem.
        // Sample Input : arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2}, key = 2
        // Sample Output : 1 5 7 8
        int[] arr = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        int key = 2;
        // TODO: write your code here

        // Q2. You are given a number (eg - 2019), convert it into a String of English
        // like "two zero one nine". Use a recursive function to solve this problem.
        // NOTE: The digits of the number will only be in the range 0-9 and the last digit
        // of a number can't be 0.
        // Sample Input : 1947
        // Sample Output : "one nine four seven"
        // TODO: write your code here
        // Q3. Write a program to find the length of a String using recursion.
        // TODO: write your code here
        // Q4. We are given a string S, find the count of all contiguous substrings
        // starting and ending with the same character.
        // Sample Input 1 : S = "abcab"
        // Sample Output 1 : 7
        //   There are 15 substrings of "abcab": a, ab, abc, abca, abcab, b, bc, bca, bcab, c, ca, cab, a, ab, b
        //   Out of the above substrings, there are 7 that start and end with the same character:
        //   a, abca, b, bcab, c, a and b.
        // Sample Input 2 : S = "aba"
        // Sample Output 2 : 4
        //   The substrings are a, b, a and aba.
        // TODO: write your code here
        // Q5. TOWER OF HANOI (Important!)
        // You have 3 towers and N disks of different sizes which can slide onto any tower.
        // The puzzle starts with disks sorted in ascending order of size from top to bottom
        // (i.e., each disk sits on top of an even larger one).
        // Constraints:
        //   (1) Only one disk can be moved at a time.
        //   (2) A disk is slid off the top of one tower onto another tower.
        //   (3) A disk cannot be placed on top of a smaller disk.
        // Write a program to move the disks from the first tower to the last using Stacks.
        // Let rod 1 = 'A' (Source), rod 2 = 'B' (Helper), rod 3 = 'C' (Destination).
        //
        // An example with 2 disks, i.e. N = 2:
        //   Step 1 : Shift the first disk from 'A' to 'B'.
        //   Step 2 : Shift the second disk from 'A' to 'C'.
        //   Step 3 : Shift the first disk from 'B' to 'C'.
        //
        // An example with 3 disks, i.e. N = 3:
        //   Step 1 : Shift the first disk from 'A' to 'C'.
        //   Step 2 : Shift second disk from 'A' to 'B'.
        //   Step 3 : Shift the first disk from 'C' to 'B'.
        //   Step 4 : Shift the third disk from 'A' to 'C'.
        //   Step 5 : Shift the first disk from 'B' to 'A'.
        //   Step 6 : Shift second disk from 'B' to 'C'.
        //   Step 7 : Shift the first disk from 'A' to 'C'.
        //
        // The approach here is:
        //   - Shift 'n-1' disks from 'A' to 'B', using C.
        //   - Shift the last disk from 'A' to 'C'.
        //   - Shift 'n-1' disks from 'B' to 'C', using A.
        // TODO: write your code here
        sc.close();
    }
}
