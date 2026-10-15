// File name: OOPSQuestions.java

public class OOPSQuestions {

    static class Complex {

        int real;
        int imag;

        public Complex(int r, int i) {
            this.real = r;
            this.imag = i;
        }

        public static Complex add(Complex a, Complex b) {
            return new Complex((a.real + b.real), (a.imag + b.imag));
        }

        public static Complex prod(Complex a, Complex b) {
            return new Complex(((a.real * b.real) - (a.imag * b.imag)), ((a.real * b.imag) + (a.imag * b.real)));

        }

        public static Complex diff(Complex a, Complex b) {
            return new Complex((a.real - b.real), (a.imag - b.imag));

        }

        public void printComplex() {
            if (real == 0 && imag != 0) {
                System.out.println(imag + "i");
            } else if (imag == 0 && real != 0) {
                System.out.println(real);
            } else {
                System.out.println(real + "+" + imag + "i");
            }
        }
    }

    public static void main(String[] args) {

        // OOPS QUESTIONS
        // Q1. Print the sum, difference and product of two complex numbers by creating
        // a class named 'Complex' with separate methods for each operation whose real
        // and imaginary parts are entered by the user.
        // TODO: write your code here
        Complex c = new Complex(4, 5);
        Complex d = new Complex(9, 4);
        Complex e = Complex.add(c, d);
        Complex f = Complex.diff(c, d);
        Complex g = Complex.prod(c, d);
        e.printComplex();
        f.printComplex();
        g.printComplex();

        // Q2. What is the output of the following program?
        //   class Automobile {
        //       private String drive() {
        //           return "Driving vehicle";
        //       }
        //   }
        //   class Car extends Automobile {
        //       protected String drive() {
        //           return "Driving car";
        //       }
        //   }
        //   public class ElectricCar extends Car {
        //       @Override
        //       public final String drive() {
        //           return "Driving electric car";
        //       }
        //       public static void main(String[] wheels) {
        //           final Car car = new ElectricCar();
        //           System.out.print(car.drive());
        //       }
        //   }
        //   A. Driving vehicle
        //   B. Driving electric car
        //   C. Driving car
        //   D. The code does not compile
        // Your answer:
        System.out.println("Driving electric car");

        // Q3. Look at the following code and choose the right option for the word <access-modifier>:
        //   // Shape.java
        //   public class Shape {
        //       protected void display() {
        //           System.out.println("Display-base");
        //       }
        //   }
        //   // Circle.java
        //   public class Circle extends Shape {
        //       <access-modifier> void display() {
        //           System.out.println("Display-derived");
        //       }
        //   }
        //   a. Only protected can be used.
        //   b. public and protected both can be used.
        //   c. public, protected, and private can be used.
        //   d. Only public can be used.
        // Your answer:
        System.out.println("b");

        // Q4. What is the output of the following program?
        //   abstract class Car {
        //       static {
        //           System.out.print("1");
        //       }
        //       public Car(String name) {
        //           super();
        //           System.out.print("2");
        //       }
        //       {
        //           System.out.print("3");
        //       }
        //   }
        //   public class BlueCar extends Car {
        //       {
        //           System.out.print("4");
        //       }
        //       public BlueCar() {
        //           super("blue");
        //           System.out.print("5");
        //       }
        //       public static void main(String[] gears) {
        //           new BlueCar();
        //       }
        //   }
        //   A. 23451
        //   B. 12354
        //   C. 13245
        //   D. The code does not compile.
        // Your answer:
        System.out.println("c");

        // Q5. Read up about the basics of exception handling from here:
        // https://www.w3schools.com/java/java_try_catch.asp
        // Your notes:
        // Exception handling is a mechanism used to handle runtime errors
        // and maintain the normal flow of program execution.
        // 1. try: Contains code that may cause an exception.
        // 2. catch: Handles the exception thrown by the try block.
        // 3. finally: Executes cleanup code whether an exception occurs or not.
        // 4. throw: Used to explicitly throw an exception.
        // 5. throws: Declares exceptions that a method may throw.
        // Example:
        // try {
        //     int result = 10 / 0;
        //     System.out.println(result);
        // } catch (ArithmeticException e) {
        //     System.out.println("Cannot divide by zero.");
        // } finally {
        //     System.out.println("Finally block executed.");
        // }
        // Output:
        // Cannot divide by zero.
        // Finally block executed.
        // Common Exceptions:
        // 1. ArithmeticException
        // 2. NullPointerException
        // 3. ArrayIndexOutOfBoundsException
        // 4. NumberFormatException
        // 5. InputMismatchException
        // Types of Exceptions:
        // 1. Checked Exceptions: Checked at compile time.
        //    Example: IOException
        // 2. Unchecked Exceptions: Occur at runtime.
        //    Example: ArithmeticException, NullPointerException
        // Advantages:
        // 1. Prevents unhandled exceptions from terminating a program unexpectedly.
        // 2. Maintains the normal flow of program execution when errors are handled.
        // 3. Helps in debugging.
        // 4. Separates error-handling code from normal code.
    }
}
