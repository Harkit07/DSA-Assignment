
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

// File name: ArraysQuestions.java
public class ArraysQuestions {

    public static boolean isDuplidate(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isDuplidateOptimized(int arr[]) {
        HashSet<Integer> hs = new HashSet<>();
        for (int num : arr) {
            if (hs.contains(num)) {
                return true;
            }
            hs.add(num);
        }
        return false;
    }

    private static int searchSortedAndRotatedUtil(int arr[], int key, int si, int ei) {
        if (si > ei) {
            return -1;
        }
        int mid = si + (ei - si) / 2;
        if (arr[mid] == key) {
            return mid;
        }
        if (arr[si] <= arr[mid]) {
            if (arr[si] <= key && key <= arr[mid]) {
                return searchSortedAndRotatedUtil(arr, key, si, mid - 1);
            } else {
                return searchSortedAndRotatedUtil(arr, key, mid + 1, ei);
            }
        } else {
            if (arr[mid] <= key && key <= arr[ei]) {
                return searchSortedAndRotatedUtil(arr, key, mid + 1, ei);
            } else {
                return searchSortedAndRotatedUtil(arr, key, si, mid - 1);
            }
        }
    }

    public static int searchSortedAndRotated(int arr[], int key) {
        return searchSortedAndRotatedUtil(arr, key, 0, arr.length - 1);
    }

    public static int stockProfit(int prices[]) {
        int buyPrices = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (buyPrices < prices[i]) {
                int profit = prices[i] - buyPrices;
                maxProfit = Math.max(profit, maxProfit);
            } else {
                buyPrices = prices[i];
            }
        }
        return maxProfit;
    }

    public static int trapRainWater(int height[]) {
        int n = height.length;
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }

        int rightMax[] = new int[n];
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }

        int trappedWater = 0;
        for (int i = 0; i < n; i++) {
            int minHeight = Math.min(leftMax[i], rightMax[i]);
            trappedWater += minHeight - height[i];
        }
        return trappedWater;
    }

    //Apporach -> O(n^3)
    public static List<List<Integer>> threeSum(int nums[]) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> triplet = new ArrayList<>();
                        triplet.add(nums[i]);
                        triplet.add(nums[j]);
                        triplet.add(nums[k]);
                        Collections.sort(triplet);
                        result.add(triplet);
                    }
                }
            }
        }
        return result;
    }

    //Optimized Apporach -> O(n^2)
    // public static List<List<Integer>> threeSum(int[] nums) {
    //     List<List<Integer>> result = new ArrayList<>();
    //     Arrays.sort(nums);
    //     for (int i = 0; i < nums.length - 2; i++) {
    //         // Skip duplicate first values
    //         if (i > 0 && nums[i] == nums[i - 1]) {
    //             continue;
    //         }
    //         int left = i + 1;
    //         int right = nums.length - 1;
    //         while (left < right) {
    //             int sum = nums[i] + nums[left] + nums[right];
    //             if (sum == 0) {
    //                 result.add(Arrays.asList(
    //                         nums[i], nums[left], nums[right]
    //                 ));
    //                 left++;
    //                 right--;
    //                 // Skip duplicate second values
    //                 while (left < right
    //                         && nums[left] == nums[left - 1]) {
    //                     left++;
    //                 }
    //                 // Skip duplicate third values
    //                 while (left < right
    //                         && nums[right] == nums[right + 1]) {
    //                     right--;
    //                 }
    //             } else if (sum < 0) {
    //                 left++;
    //             } else {
    //                 right--;
    //             }
    //         }
    //     }
    //     return result;
    // }
    public static void main(String[] args) {

        // Q1. Given an integer array nums, return true if any value appears at least twice
        // in the array, and return false if every element is distinct.
        // Example 1: Input: nums = [1, 2, 3, 1]                         Output: true
        // Example 2: Input: nums = [1, 2, 3, 4]                         Output: false
        // Example 3: Input: nums = [1, 1, 1, 3, 3, 4, 3, 2, 4, 2]       Output: true
        // Constraints:
        //   1 <= nums.length <= 10^5
        //   -10^9 <= nums[i] <= 10^9
        // TODO: write your code here
        int arr1[] = {1, 2, 3, 1};
        int arr2[] = {1, 2, 3, 4};
        int arr3[] = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println(isDuplidate(arr1));
        System.out.println(isDuplidate(arr2));
        System.out.println(isDuplidate(arr3));
        System.out.println("Optimized Approch using HashSet");
        System.out.println(isDuplidateOptimized(arr1));
        System.out.println(isDuplidateOptimized(arr2));
        System.out.println(isDuplidateOptimized(arr3));

        // Q2. There is an integer array nums sorted in ascending order (with distinct values).
        // Prior to being passed to your function, nums is possibly rotated at an unknown
        // pivot index k (1 <= k < nums.length) such that the resulting array is
        // [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed).
        // For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].
        // Given the array nums after the possible rotation and an integer target,
        // return the index of target if it is in nums, or -1 if it is not in nums.
        // You must write an algorithm with O(log n) runtime complexity.
        // Example 1: Input: nums = [4, 5, 6, 7, 0, 1, 2], target = 0    Output: 4
        // Example 2: Input: nums = [4, 5, 6, 7, 0, 1, 2], target = 3    Output: -1
        // Example 3: Input: nums = [1], target = 0                      Output: -1
        // Constraints:
        //   1 <= nums.length <= 5000
        //   -10^4 <= nums[i] <= 10^4
        //   All values of nums are unique.
        //   nums is an ascending array that is possibly rotated.
        //   -10^4 <= target <= 10^4
        // TODO: write your code here
        int test1[] = {4, 5, 6, 7, 0, 1, 2};
        int key1 = 0;
        int test2[] = {4, 5, 6, 7, 0, 1, 2};
        int key2 = 3;
        int test3[] = {1};
        int key3 = 0;
        System.out.println(searchSortedAndRotated(test1, key1));
        System.out.println(searchSortedAndRotated(test2, key2));
        System.out.println(searchSortedAndRotated(test3, key3));

        // Q3. You are given an array prices where prices[i] is the price of a given stock
        // on the i-th day.
        // Return the maximum profit you can achieve from this transaction.
        // If you cannot achieve any profit, return 0.
        // Example 1: Input: prices = [7, 1, 5, 3, 6, 4]                 Output: 5
        //   Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6 - 1 = 5.
        //   Note that buying on day 2 and selling on day 1 is not allowed
        //   because you must buy before you sell.
        // Example 2: Input: prices = [7, 6, 4, 3, 1]                    Output: 0
        //   Explanation: In this case, no transactions are done and the max profit = 0.
        // Constraints:
        //   1 <= prices.length <= 10^5
        //   0 <= prices[i] <= 10^4
        // TODO: write your code here
        int prices1[] = {7, 1, 5, 3, 6, 4};
        int prices2[] = {7, 6, 4, 3, 1};
        System.out.println(stockProfit(prices1));
        System.out.println(stockProfit(prices2));

        // Q4. Given n non-negative integers representing an elevation map where the width
        // of each bar is 1, compute how much water it can trap after raining.
        // Example 1: Input: height = [0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1]   Output: 6
        //   Explanation: 6 units of rain water are trapped in this elevation map.
        // Example 2: Input: height = [4, 2, 0, 3, 2, 5]                     Output: 9
        // Constraints:
        //   n == height.length
        //   1 <= n <= 2 * 10^4
        //   0 <= height[i] <= 10^5
        // TODO: write your code here
        int height1[] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int height2[] = {4, 2, 0, 3, 2, 5};
        System.out.println(trapRainWater(height1));
        System.out.println(trapRainWater(height2));

        // Q5. Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]]
        // such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
        // Notice that the solution set must not contain duplicate triplets.
        // Example 1: Input: nums = [-1, 0, 1, 2, -1, -4]    Output: [[-1, -1, 2], [-1, 0, 1]]
        // Example 2: Input: nums = []                       Output: []
        // Example 3: Input: nums = [0]                      Output: []
        // Constraints:
        //   0 <= nums.length <= 3000
        //   -10^5 <= nums[i] <= 10^5
        // TODO: write your code here
        int nums1[] = {-1, 0, 1, 2, -1, -4};
        int nums2[] = {};
        int nums3[] = {0};
        System.out.println(threeSum(nums1));
        System.out.println(threeSum(nums2));
        System.out.println(threeSum(nums3));

    }
}
