// File name: VariableAndDataType.java

import java.util.Scanner;

public class VariableAndDataType {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            // Question 1
            // Input 3 numbers A, B, C and output their average.
            // Average of N numbers = sum of numbers / N
            // TODO: write your code here
            System.out.print("Enter A : ");
            int a = sc.nextInt();
            System.out.print("Enter B : ");
            int b = sc.nextInt();
            System.out.print("Enter C : ");
            int c = sc.nextInt();
            System.out.println("Average of A, B and C = " + (a + b + c) / 3);

            // Question 2
            // Input the side of a square and output its area.
            // Area of a square = side x side
            // TODO: write your code here
            System.out.print("Enter side of square : ");
            int s = sc.nextInt();
            System.out.println("Area of square = " + (s * s));

            // Question 3
            // Enter the cost of 3 items (float) - pencil, pen, eraser.
            // Output the total cost as a bill.3
            // Add-on: add 18% GST to the total.3
            // TODO: write your code here
            System.out.print("Enter cost of pencil : ");
            float pencil = sc.nextFloat();
            System.out.print("Enter cost of pen : ");
            float pen = sc.nextFloat();
            System.out.print("Enter cost of eraser : ");
            float eraser = sc.nextFloat();
            float cost = pencil + pen + eraser;
            float totalCost = cost + (cost * 0.18f);
            System.out.println("Cost of the bill = " + totalCost + " + 18% GST");

            // Question 4
            // What will be the type of result in the following Java code?
            //
            //   int x = 10;
            //   double y = 3.5;
            //   var result = x + y;
            //
            // Hint: Look at the largest data type among the operands.
            // Your answer:
            System.out.println("double");

            // Question 5 (Advanced)
            // Will the following statement give any error in Java?
            //
            //   int $ = 24;
            //
            // Your answer:
            System.out.println("no");
        }
    }
}
