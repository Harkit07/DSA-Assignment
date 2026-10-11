// File name: LinkedListQuestions.java

public class LinkedListQuestions {

    public static void main(String[] args) {

        // LINKED LIST QUESTIONS
        // Note: These are classical questions. Please positively solve them.
        // Q1. Intersection of Two Linked Lists
        // In a system there are two singly linked lists. By some programming error, the end node
        // of one of the linked lists got linked to the second list, forming an inverted Y-shaped
        // list. Write a program to get the point where the two linked lists merge.
        // Diagram (from the question):
        //   List 1:  4 -> 5 -> 6 -> 7
        //   List 2:  1 -> 2 -> 3 -> 6 -> 7
        //   (both lists join into one common tail, forming an inverted Y)
        // We have to find the intersection part in this system.
        // TODO: write your code here
        // Q2. Delete N Nodes After M Nodes of a Linked List
        // We have a linked list and two integers M and N. Traverse the linked list such that you
        // retain M nodes then delete the next N nodes, continue the same till the end of the
        // linked list. Difficulty Level: Rookie.
        // Sample Input 1 : M = 2, N = 2, LL: 1->2->3->4->5->6->7->8
        // Sample Output 1 : 1->2->5->6
        // Sample Input 2 : M = 3, N = 2, LL: 1->2->3->4->5->6->7->8->9->10
        // Sample Output 2 : 1->2->3->6->7->8
        // TODO: write your code here
        // Q3. Swapping Nodes in a Linked List
        // We have a linked list and two keys in it, swap the nodes for the two given keys.
        // Nodes should be swapped by changing links. Swapping data of nodes may be expensive in
        // many situations when data contains many fields.
        // It may be assumed that all keys in the linked list are distinct.
        // Sample Input 1 : 1->2->3->4, x = 2, y = 4
        // Sample Output 1 : 1->4->3->2
        // TODO: write your code here
        // Q4. Odd Even Linked List
        // We have a linked list of integers. Write a function to modify the linked list such that
        // all even numbers appear before all the odd numbers in the modified linked list.
        // Also, keep the order of even and odd numbers the same.
        // Sample Input 1 : 8->12->10->5->4->1->6->NULL
        // Sample Output 1 : 8->12->10->4->6->5->1->NULL
        // Sample Input 2 : 1->3->5->7->NULL
        // Sample Output 2 : 1->3->5->7->NULL
        // TODO: write your code here
        // Q5. Merge k Sorted Lists
        // We have K sorted linked lists of size N each. Merge them and print the sorted output.
        // Sample Input 1 : k = 2, n = 2
        //   l1 = 1->3->NULL
        //   l2 = 6->8->NULL
        //   l3 = 9->10->NULL
        // Sample Output 1 : 1->3->6->8->9->10->NULL
        // TODO: write your code here
    }
}
