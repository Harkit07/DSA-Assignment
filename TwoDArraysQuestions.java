// File name: TwoDArraysQuestions.java

public class TwoDArraysQuestions {

    public static int countNum(int[][] arr, int key) {
        int count = 0;
        for (int[] row : arr) {
            for (int val : row) {
                if (val == key) {
                    count++;
                }
            }
        }
        return count;
    }

    public static int rowSum(int[][] arr, int num) {
        if (num < 1 || num > arr.length) {
            return 0;
        }
        int sum = 0;
        for (int val : arr[num - 1]) {
            sum += val;
        }
        return sum;
    }

    public static int[][] matrixTranspose(int[][] arr) {
        if (arr.length == 0) {
            return new int[0][0];
        }

        int rows = arr.length, cols = arr[0].length;
        int[][] transpose = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = arr[i][j];
            }
        }
        return transpose;
    }

    public static void printArr(int[][] arr) {
        for (int[] row : arr) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        // 2D ARRAYS QUESTIONS
        // Q1. Print the number of 7's that are in the 2D array.
        // Example: Input - int[][] array = { {4,7,8}, {8,8,7} };
        //          Output - 2
        int[][] arr = {{4, 7, 8}, {8, 8, 7}};
        System.out.println(countNum(arr, 7));

        // Q2. Print out the sum of the numbers in the second row of the "nums" array.
        // Example: Input - int[][] nums = { {1,4,9}, {11,4,3}, {2,2,3} };
        //          Output - 18
        int[][] nums = {{1, 4, 9}, {11, 4, 3}, {2, 2, 3}};
        System.out.println(rowSum(nums, 2));

        // Q3. Write a program to find the transpose of a matrix.
        // What is Transpose?
        // Transpose of a matrix is the process of swapping the rows to columns.
        // For a 2x3 matrix:
        //   Matrix              Transposed Matrix
        //   a11 a12 a13         a11 a21
        //   a21 a22 a23         a12 a22
        //                       a13 a23
        int[][] matrix = {{11, 12, 13}, {21, 22, 23}};
        int[][] transpose = matrixTranspose(matrix);
        printArr(transpose);
    }
}
