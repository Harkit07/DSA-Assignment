// File name: HeapQuestions.java

public class HeapQuestions {

    public static void main(String[] args) {

        // HEAP QUESTIONS
        // Q1. K'th largest element in a stream
        // We have an infinite stream of integers. Find the k'th largest element at any point of time.
        // Input  : stream[] = {10, 20, 11, 70, 50, 40, 100, 5, ...}, k = 3
        // Output : {_, _, 10, 11, 20, 40, 50, 50, ...}
        // TODO: write your code here
        // Q2. Minimum time required to fill given N slots
        // We have an integer N which denotes the number of slots, and an array arr[] consisting of
        // K integers in the range [1, N]. Each element of the array represents the index of a
        // filled slot. At each unit of time, a filled slot fills its adjacent empty slots.
        // The task is to find the minimum time taken to fill all the N slots.
        // Sample Input 1 : N = 5, K = 5, arr[] = {1, 2, 3, 4, 5}     Sample Output 1 : 1
        // Sample Input 2 : N = 6, K = 2, arr[] = {2, 6}              Sample Output 2 : 2
        // TODO: write your code here
        // Q3. Path With Minimum Effort
        // We have a two-dimensional grid, each cell of which contains an integer cost which
        // represents the cost to traverse through that cell. We need to find a path from the
        // top-left cell to the bottom-right cell by which the total cost incurred is minimum.
        // Sample Input 1 :
        int[][] grid = {{31, 100, 65, 12, 18},
        {10, 13, 47, 157, 6},
        {100, 113, 174, 11, 33},
        {88, 124, 41, 20, 140},
        {99, 32, 111, 41, 20}};
        // Sample Output 1 : 327 (= 31 + 10 + 13 + 47 + 65 + 12 + 18 + 6 + 33 + 11 + 20 + 41 + 20)
        // TODO: write your code here

        // Q4. Minimum Operations to Halve Array Sum
        // We have an array Arr[]. The task is to find the minimum number of operations to make
        // the sum of array elements less than or equal to half of its initial value.
        // In one such operation, it is allowed to halve the value of any array element.
        // Sample Input 1 : [1, 5, 8, 19]
        // Sample Output 1 : 3
        // TODO: write your code here
        // Q5. Merge K Sorted Linked Lists
        // We have K linked lists each of size N and each list is sorted in non-decreasing order.
        // Merge them into a single sorted (non-decreasing order) linked list and print the
        // sorted linked list as output.
        // Sample Input 1 :
        //   K = 3, N = 3
        //   list1 = 1->3->7->NULL
        //   list2 = 2->4->8->NULL
        //   list3 = 9->10->11->NULL
        // Sample Output 1 : 1->2->3->4->7->8->9->10->11
        // TODO: write your code here
    }
}
