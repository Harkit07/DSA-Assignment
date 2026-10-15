// File name: ConditionalQuestions.java

import java.util.Scanner;

public class ConditionalQuestions {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            // Q1. Write a Java program to get a number from the user
            // and print whether it is positive or negative.
            System.out.print("Enter a number : ");
            int num = sc.nextInt();
            if (num < 0) {
                System.out.println("Negative Number");
            } else if (num > 0) {
                System.out.println("Positive Number");
            } else {
                System.out.println("Zero");
            }

            // Q2. Finish the following code so that it prints "You have a fever"
            // if your temperature is above 100, and otherwise prints "You don't have a fever".
            double temp = 103.5;
            if (temp > 100) {
                System.out.println("You have a fever");
            } else {
                System.out.println("You don't have a fever");
            }

            // Q3. Write a Java program to input week number (1-7)
            // and print the day of the week name using switch case.
            System.out.print("Write a number between 1 to 7 : ");
            int day = sc.nextInt();

            switch (day) {
                case 1 ->
                    System.out.println("Sunday");
                case 2 ->
                    System.out.println("Monday");
                case 3 ->
                    System.out.println("Tuesday");
                case 4 ->
                    System.out.println("Wednesday");
                case 5 ->
                    System.out.println("Thursday");
                case 6 ->
                    System.out.println("Friday");
                case 7 ->
                    System.out.println("Saturday");
                default ->
                    System.out.println("Wrong Number");
            }

            // Q4. What will be the value of x & y in the following program?
            //   int a = 63, b = 36;
            //   boolean x = (a < b) ? true : false;
            //   int y = (a > b) ? a : b;
            // Your answer:
            System.out.println("boolean x = false");
            System.out.println("y = " + 63);

            // Q5. Write a Java program that takes a year from the user
            // and prints whether that year is a leap year or not.
            // Hint: divisible by 4? -> divisible by 100? -> divisible by 400?
            System.out.print("Enter a year : ");
            int year = sc.nextInt();
            if (year % 400 == 0) {
                System.out.println("Leap Year");
            } else if (year % 100 == 0) {
                System.out.println("Not a Leap Year");
            } else if (year % 4 == 0) {
                System.out.println("Leap Year");
            } else {
                System.out.println("Not a Leap Year");
            }
        }
    }
}
