// File name: LoopsQuestions.java

import java.util.Scanner;

public class LoopsQuestions {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            // Q1. How many times 'Hello' is printed?
            //   public class Solution {
            //       public static void main(String[] args) {
            //           for (int i = 0; i < 5; i++) {
            //               System.out.println("Hello");
            //               i += 2;
            //           }
            //       }
            //   }
            // Your answer:
            System.out.println(2);

            // Q2. Write a program that reads a set of integers,
            // and then prints the sum of the even and odd integers.
            // TODO: write your code here
            int odd = 0;
            int even = 0;
            System.out.print("Enter numbers : ");
            for (int i = 0; i < 5; i++) {
                int n = sc.nextInt();
                if (n % 2 == 0) {
                    even += n;
                } else {
                    odd += n;
                }
            }
            System.out.println("Odd sum = " + odd);
            System.out.println("Even sum = " + even);

            // Q3. Write a program to find the factorial of any number entered by the user.
            // Hint: factorial of n = n * (n-1) * (n-2) * ... * 1 and exists for positive numbers only.
            // 0! = 1, 1! = 1, 2! = 2, 3! = 6, 4! = 24 and so on.
            // Note: do not confuse factorial with the NOT EQUAL TO operator, they are not the same.
            // TODO: write your code here
            System.out.print("Enter a fact num : ");
            int num = sc.nextInt();
            long fact = 1;
            if (num < 0) {
                System.out.println("Factorial is not defined for negative numbers.");
            } else {
                for (int i = 1; i <= num; i++) {
                    fact *= i;
                }
                System.out.println("Fact is = " + fact);
            }

            // Q4. Write a program to print the multiplication table of a number N,
            // entered by the user.
            // TODO: write your code here
            System.out.print("Enter a num for table : ");
            int t = sc.nextInt();
            for (int i = 1; i <= 10; i++) {
                System.out.println(i + " x " + t + " = " + i * t);
            }

            // Q5. What is wrong in the following program?
            //   public class Solution {
            //       public static void main(String args[]) {
            //           for (int i = 0; i <= 5; i++) {
            //               System.out.println("i = " + i);
            //           }
            //           System.out.println("i after the loop = " + i);
            //       }
            //   }
            // Your answer:
            System.out.println("i do not exist after loop because it is block scope");
        }
    }
}
