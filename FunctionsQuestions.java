// File name: FunctionsQuestions.java

import java.util.Scanner;

public class FunctionsQuestions {

    public static float avg(float a, float b, float c) {
        return (a + b + c) / 3;
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isPalindrome(int n) {
        String str = String.valueOf(n);
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static int sum(int digit) {
        int sum = 0;
        while (digit > 0) {
            int lastNum = digit % 10;
            sum += lastNum;
            digit /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            // Q1. Write a Java method to compute the average of three numbers.
            // TODO: write your code here
            System.out.print("Enter a : ");
            float a = sc.nextFloat();
            System.out.print("Enter b : ");
            float b = sc.nextFloat();
            System.out.print("Enter c : ");
            float c = sc.nextFloat();
            System.out.println(avg(a, b, c));

            // Q2. Write a method named isEven that accepts an int argument.
            // The method should return true if the argument is even, or false otherwise.
            // Also write a program to test your method.
            // TODO: write your code here
            System.out.print("Enter a number to check Even : ");
            int num = sc.nextInt();
            System.out.println(isEven(num));

            // Q3. Write a Java program to check if a number is a palindrome.
            // (121 is a palindrome, 321 is not)
            // A number is called a palindrome if the number is equal to the reverse of the number.
            // e.g., 121 is a palindrome because the reverse of 121 is 121 itself.
            // 321 is not a palindrome because the reverse of 321 is 123, which is not equal to 321.
            // TODO: write your code here
            System.out.print("Enter a number to check palindrome : ");
            int paldrome = sc.nextInt();
            System.out.println(isPalindrome(paldrome));

            // Q4. READ & CODE EXERCISE
            // Search about (Google) & use the following methods of the Math class in Java:
            //   a. Math.min()
            //   b. Math.max()
            //   c. Math.sqrt()
            //   d. Math.pow()
            //   e. Math.avg()
            //   f. Math.abs()
            // Free reading resource: https://www.javatpoint.com/java-math
            // Please feel free to look for more resources/websites on your own.
            // TODO: write your code here
            int x = 16;
            int y = 4;
            System.out.println("Minimum: " + Math.min(x, y));
            System.out.println("Maximum: " + Math.max(x, y));
            System.out.println("Square root: " + Math.sqrt(x));
            System.out.println("Power: " + Math.pow(x, y));
            System.out.println("Absolute value: " + Math.abs(-10));
            System.out.println("Average: " + ((x + y) / 2.0));

            // Q5. Write a Java method to compute the sum of the digits in an integer.
            // Hint: approach this question in the following way:
            //   a. Take a variable sum = 0
            //   b. Find the last digit of the number
            //   c. Add it to the sum
            //   d. Repeat a & b until the number becomes 0
            // TODO: write your code here
            System.out.print("Enter a digit : ");
            int digit = sc.nextInt();
            System.out.println(sum(digit));

        }
    }

    // Tip: write your methods (Q1, Q2, Q5) here, outside main but inside the class,
    // then call them from main.
}
