package com.jon.learning.leet;

/**
 * Input: nums = [1,2,3,4,5,6,7], k = 3
 * Output: [5,6,7,1,2,3,4]
 * Explanation:
 * rotate 1 steps to the right: [7,1,2,3,4,5,6]
 * rotate 2 steps to the right: [6,7,1,2,3,4,5]
 * rotate 3 steps to the right: [5,6,7,1,2,3,4]
 *
 * Input: nums = [-1,-100,3,99], k = 2
 * Output: [3,99,-1,-100]
 * Explanation:
 * rotate 1 steps to the right: [99,-1,-100,3]
 * rotate 2 steps to the right: [3,99,-1,-100]
 */
public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int k = 3;
        print(rotate(arr, k));
        int[] arr1 = {-1,-100,3,99};
        k = 2;
        print(rotate(arr1, k));
    }

    public static int[] rotate(int[] nums, int k) {
        //[1,2,3,4,5,6,7]
        if (k==0 || nums.length < 2) return nums;
        // int last = nums[nums.length - 1];
        int temp = 0;
        k = k % (nums.length);
        while(k-- > 0) {
            int i=nums.length - 1;
            temp = nums[i];
            for (; i > 0; i--) {
                nums[i] = nums[i-1];
            }
            nums[i] = temp;
        }
        return nums;
    }

    public static void print(int[] arr) {
        for (int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
