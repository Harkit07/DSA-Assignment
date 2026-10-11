/*
 * Question: What will be the output of the following programs?
 * Write your answer under each program, then run the code to check yourself.
 */
public class OutputQuestions {

    public static void main(String[] args) {

        // ================= (i) =================
        //
        // public class Test {
        //     public static void main(String[] args) {
        //         int x = 2, y = 5;
        //         int exp1 = (x * y / x);
        //         int exp2 = (x * (y / x));
        //         System.out.print(exp1 + " , ");
        //         System.out.print(exp2);
        //     }
        // }
        //
        // Your answer: 5 , 4
        // (exp1: 2*5=10, 10/2=5 | exp2: 5/2=2 (int division), 2*2=4)
        // ================= (ii) =================
        //
        // public class Test {
        //     public static void main(String[] args) {
        //         int x = 200, y = 50, z = 100;
        //         if (x > y && y > z) {
        //             System.out.println("Hello");
        //         }
        //         if (z > y && z < x) {
        //             System.out.println("Java");
        //         }
        //         if ((y + 200) < x && (y + 150) < z) {
        //             System.out.println("Hello Java");
        //         }
        //     }
        // }
        //
        // Your answer: Java
        // (1st: y > z is false | 2nd: both true -> prints Java | 3rd: 250 < 200 is false)
        // ================= (iii) =================
        //
        // public class Test {
        //     public static void main(String[] args) {
        //         int x, y, z;
        //         x = y = z = 2;
        //         x += y;
        //         y -= z;
        //         z /= (x + y);
        //         System.out.println(x + " " + y + " " + z);
        //     }
        // }
        //
        // Your answer: 4 0 0
        // (x = 4, y = 0, z = 2/(4+0) = 0 in int division)
        // ================= (iv) =================
        //
        // public class Test {
        //     public static void main(String[] args) {
        //         int x = 9, y = 12;
        //         int a = 2, b = 4, c = 6;
        //         int exp = 4 / 3 * (x + 34) + 9 * (a + b * c) + (3 + y * (2 + a)) / (a + b * y);
        //         System.out.println(exp);
        //     }
        // }
        //
        // Your answer: 278
        // (4/3 = 1, 1*43 = 43 | 9*(2+24) = 234 | (3+48)/(2+48) = 51/50 = 1 | 43+234+1 = 278)
        // ================= (v) =================
        //
        // public class Test {
        //     public static void main(String[] args) {
        //         int x = 10, y = 5;
        //         int exp1 = (y * (x / y + x / y));
        //         int exp2 = (y * x / y + y * x / y);
        //         System.out.println(exp1);
        //         System.out.println(exp2);
        //     }
        // }
        //
        // Your answer:
        // 20
        // 20
        // (exp1: 5*(2+2) = 20 | exp2: 50/5 + 50/5 = 10 + 10 = 20)
    }
}
