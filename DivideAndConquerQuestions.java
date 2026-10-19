
import java.util.HashMap;

// File name: DivideAndConquerQuestions.java
public class DivideAndConquerQuestions {

    public static void printArr(String[] arr) {
        for (String str : arr) {
            System.out.print(str + " ");
        }
        System.out.println();
    }

    public static void mergeSort(String[] arr, int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid + 1, ei);
        merge(arr, si, mid, ei);
    }

    public static void merge(String[] arr, int si, int mid, int ei) {
        String[] temp = new String[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= ei) {
            if (arr[i].compareTo(arr[j]) < 0) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        for (i = si, k = 0; k < temp.length; i++, k++) {
            arr[i] = temp[k];
        }
    }

    public static int majorityEl(int arr[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int key : map.keySet()) {
            if (map.get(key) > (arr.length / 2)) {
                return key;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        // DIVIDE & CONQUER QUESTIONS
        // Q1. (EASY) Apply Merge Sort to sort an array of Strings.
        // (Assume that all the characters in all the Strings are in lowercase.)
        // Sample Input 1 : arr = { "sun", "earth", "mars", "mercury" }
        // Sample Output 1 : arr = { "earth", "mars", "mercury", "sun" }
        String[] arr = {"sun", "earth", "mars", "mercury"};
        // TODO: write your code here
        mergeSort(arr, 0, arr.length - 1);
        printArr(arr);

        // Q2. (MEDIUM) Given an array nums of size n, return the majority element.
        // The majority element is the element that appears more than floor(n / 2) times.
        // You may assume that the majority element always exists in the array.
        // Sample Input 1 : nums = [3, 2, 3]                  Sample Output 1 : 3
        // Sample Input 2 : nums = [2, 2, 1, 1, 1, 2, 2]      Sample Output 2 : 2
        // Constraints (extra conditions):
        //   n == nums.length
        //   1 <= n <= 5 * 10^4
        //   -10^9 <= nums[i] <= 10^9
        // TODO: write your code here
        int[] num1 = {3, 2, 3};
        int[] num2 = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(majorityEl(num1));
        System.out.println(majorityEl(num2));

        // Q3. (HARD) Given an array of integers, find the Inversion Count in the array.
        // Inversion Count: For an array, inversion count indicates how far (or close) the array
        // is from being sorted. If the array is already sorted then the inversion count is 0.
        // If an array is sorted in the reverse order then the inversion count is the maximum.
        // Formally, two elements a[i] and a[j] form an inversion if a[i] > a[j] and i < j.
        // Sample Input 1 : N = 5, arr[] = {2, 4, 1, 3, 5}
        // Sample Output 1 : 3, because it has 3 inversions - (2, 1), (4, 1), (4, 3).
        // Sample Input 2 : N = 5, arr[] = {2, 3, 4, 5, 6}
        // Sample Output 2 : 0, because the array is already sorted.
        // Sample Input 3 : N = 3, arr[] = {5, 5, 5}
        // Sample Output 3 : 0, because all the elements of the array are the same
        //                   & already in a sorted manner.
        // Hint: a sorting algorithm will be used to solve this question.
        // Note: this question is important. Even if you are not able to come up with the
        // approach, please understand the solution.
        // TODO: write your code here
    }
}
