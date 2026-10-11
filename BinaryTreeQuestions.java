// File name: BinaryTreeQuestions.java

public class BinaryTreeQuestions {

    public static void main(String[] args) {

        // BINARY TREE QUESTIONS
        // Q1. Check if a Binary Tree is univalued or not
        // We have a binary tree, the task is to check if the binary tree is univalued or not.
        // If found to be true, then print "YES". Otherwise, print "NO".
        // Sample Input 1 (figure):
        //            2
        //          /   \
        //         2     2
        //        / \
        //       5   2
        // Sample Output 1 : false
        // TODO: write your code here
        // Q2. Invert Binary Tree
        // Mirror of a Tree: Mirror of a Binary Tree T is another Binary Tree M(T) with left and
        // right children of all non-leaf nodes interchanged.
        // Input 1 (figure):  tree T                 mirror M(T)
        //                         1                      1
        //                       /   \                  /   \
        //                      2     3                3     2
        //                     / \   / \              / \   / \
        //                    4   5 6   7            7   6 5   4
        // Output 1 : Yes
        // TODO: write your code here
        // Q3. Delete leaf nodes with values as x
        // We have a binary tree and a target integer x. Delete all the leaf nodes having value
        // as x. Also, delete the newly formed leaves with the target value as x.
        // Example (figure), x = 3:
        //   Before:        1             After:       1
        //                /   \                       /
        //               3     3                     3
        //              / \                           \
        //             3   2                           2
        // TODO: write your code here
        // Q4. Find All Duplicate Subtrees
        // We have a binary tree, find all duplicate subtrees. For each duplicate subtree, we only
        // need to return the root node of any one of them. Two trees are duplicates if they have
        // the same structure with the same node values.
        // Input 1:
        //           1
        //          / \
        //         4   3
        //        /   / \
        //       3   4   3
        //          /
        //         3
        // Output 1 : 4-3 , 3
        // TODO: write your code here
        // Q5. Maximum Path Sum in a Binary Tree
        // We have a binary tree, find the maximum path sum. The path may start and end at any
        // node in the tree.
        // Input 1:
        //         4
        //        / \
        //       2   7
        // Output 1 : 13
        // Input 2 (figure):
        //          -10
        //          /  \
        //         9    20
        //             /  \
        //            15   7
        // Output 2 : 42
        // TODO: write your code here
    }
}
