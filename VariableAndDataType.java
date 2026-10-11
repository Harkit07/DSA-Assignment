
import java.util.Scanner;

public class VariableAndDataType {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            // ================= Question 1 =================
            // Input 3 numbers A, B, C and output their average.
            // Average of N numbers = sum of numbers / N
            System.out.println("---- Question 1: Average of 3 numbers ----");
            System.out.print("Enter A: ");
            double a = sc.nextDouble();
            System.out.print("Enter B: ");
            double b = sc.nextDouble();
            System.out.print("Enter C: ");
            double c = sc.nextDouble();
            double average = (a + b + c) / 3;
            System.out.println("Average = " + average);

            // ================= Question 2 =================
            // Input the side of a square and output its area.
            // Area of a square = side x side
            System.out.println("\n---- Question 2: Area of a square ----");
            System.out.print("Enter side of square: ");
            double side = sc.nextDouble();

            double area = side * side;
            System.out.println("Area of square = " + area);

            // ================= Question 3 =================
            // Enter cost of 3 items (float) - pencil, pen, eraser.
            // Output the total cost as a bill.
            // Add-on: add 18% GST to the total.
            System.out.println("\n---- Question 3: Bill for 3 items ----");
            System.out.print("Enter cost of pencil: ");
            float pencil = sc.nextFloat();
            System.out.print("Enter cost of pen: ");
            float pen = sc.nextFloat();
            System.out.print("Enter cost of eraser: ");
            float eraser = sc.nextFloat();

            float totalCost = pencil + pen + eraser;
            System.out.println("Total cost (before GST) = " + totalCost);

            // Advanced: adding 18% GST
            float gst = totalCost * 18 / 100;
            float billWithGst = totalCost + gst;
            System.out.println("GST (18%) = " + gst);
            System.out.println("Final bill (with GST) = " + billWithGst);

            // ================= Question 4 =================
            // What will be the type of result in the following Java code?
            //
            // int x = 10;
            // double y = 3.5;
            // var result = x + y;
            //
            // Hint: Look at the largest data type among the operands.
            //
            // ANSWER: The type of "result" will be "double".
            // In Java, when an arithmetic operation involves operands of
            // different numeric types, the smaller type is automatically
            // promoted (widened) to the larger type before the operation
            // is performed. The general widening order is:
            // byte -> short -> int -> long -> float -> double
            // Since "double" is the larger/wider type here (compared to int),
            // the int value gets promoted to double, and the result of the
            // expression is a double.
            System.out.println("\n---- Question 4: Type of result ----");
            int x = 10;
            double y = 3.5;
            var result = x + y; // inferred as double (int is widened to double)
            System.out.println("x + y = " + result + " (type: double)");

            // ================= Question 5 (Advanced) =================
            // Will the following statement give any error in Java?
            // int $ = 24;
            //
            // ANSWER: No, this statement will NOT give any error.
            // In Java, identifiers (variable names) can consist of letters,
            // digits, underscores (_), and dollar signs ($). The only rules
            // are that an identifier cannot start with a digit, and cannot
            // be a reserved keyword. Since '$' is a legal identifier character
            // (and is often used by tools/compilers for generated names),
            // "$" alone is a perfectly valid variable name in Java.
            System.out.println("\n---- Question 5: int $ = 24; ----");
            int $ = 24; // valid identifier, compiles without error
            System.out.println("$ = " + $ + "  --> No error, this is valid Java syntax.");

            // No sc.close() needed: try-with-resources closes the Scanner automatically.
        }
    }
}
