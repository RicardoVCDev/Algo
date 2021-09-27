package com.jon.learning.leet;

import static com.jon.learning.utils.print;
import java.util.Arrays;

/**
 * Given an integer array nums, return true if any value appears at least twice in the array,
 * and return false if every element is distinct.
 * Input: nums = [1,2,3,1]
 * Output: true
 * Input: nums = [1,2,3,4]
 * Output: false
 *Input: nums = [1,1,1,3,3,4,3,2,4,2]
 * Output: true
 */
public class ContainsDups {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1};
        print(arr);
        System.out.println("Duplicates found? "+ containsDuplicate(arr));
        arr = new int[]{1,2,3,4};
        print(arr);
        System.out.println("Duplicates found? "+ containsDuplicate(arr));
        arr = new int[]{1,1,1,3,3,4,3,2,4,2};
        print(arr);
        System.out.println("Duplicates found? "+ containsDuplicate(arr));
    }

    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i=1; i < nums.length; i++) {
            if (nums[i] == nums[i-1]) return true;
        }
        return false;
    }
}
