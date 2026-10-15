// File name: BitManipulationQuestions.java

import java.util.*;

public class BitManipulationQuestions {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // BIT MANIPULATION QUESTIONS
            // NOTE: Some of these questions will teach you something new, as some of them
            // might be useful hacks (which can be difficult to think of on your own).
            // Even if you are not able to come up with a solution on your own, try to learn
            // something new from these questions & write down the logic of the solution in your notes.
            // Q1. What is the value of x ^ x for any value of x?
            // Your answer:
            System.out.println(5 ^ 6);

            // Q2. Swap two numbers without using any third variable.
            // TODO: write your code here
            int a = 5;
            int b = 10;
            System.out.println("Before: a = " + a + ", b = " + b);

            // Method 1: using + and -
            a = a + b;   // a = 15
            b = a - b;   // b = 15 - 10 = 5 
            a = a - b;   // a = 15 - 5  = 10
            System.out.println("After (+/-): a = " + a + ", b = " + b);  // a = 10, b = 5

            // Method 2: using XOR (^)
            // Properties: x ^ x = 0 and x ^ 0 = x
            a = a ^ b;   // a = 10 ^ 5 = 15
            b = a ^ b;   // b = 15 ^ 5 = 10
            a = a ^ b;   // a = 15 ^ 10 = 5
            System.out.println("After (XOR): a = " + a + ", b = " + b);  // a = 5, b = 10

            // Q3. Add 1 to an integer using Bit Manipulation.
            // Hint: try using the Bitwise NOT operator.
            // TODO: write your code here
            // Q4. This question is based on a trick, please directly look at the solution.
            // Convert uppercase characters to lowercase using bits.
            // TODO: write your code here
            // Q5. A good read of hacks using bits (you can check this out in your free time):
            // http://graphics.stanford.edu/~seander/bithacks.htm
            // Your notes:
        }
    }
}
