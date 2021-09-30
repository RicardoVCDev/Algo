package com.jon.learning.leet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
 * You must implement a solution with a linear runtime complexity and use only constant extra space.
 * Input: nums = [2,2,1]
 * Output: 1
 * Input: nums = [4,1,2,1,2]
 * Output: 4
 * Input: nums = [1]
 * Output: 1
 * Input: nums = [-1,0,0]
 * Output: -1
 */
public class SingleNumberMyWay {
    public static void main(String[] args) {
    }

    public static int singleNumber(int[] nums) {
        int[] one = new int[60001];
        // int[] many = new int[60001];

        int running = 0;
        int indx = 0;
        for (int num : nums) {
            if (num < 0) {
                indx = Math.abs(num) + 30000;
            } else {
                indx = num;
            }

            if (one[indx] > 0) {
                if (num < 0)  {
                    running = running + Math.abs(num);
                } else if (num > 0) {
                    running = running - num;
                }
                one[indx] = 0;
            } else {
                one[indx] = 1;
                running = running + num;
            }
        }
        return running;
    }

    //my better solution - actually this is ms slower
    public int myFasterSolution(int[] nums) {
        if (nums.length == 1) return nums[0];
        Arrays.sort(nums);
        for (int i=1; i < nums.length; i=i+2) {
            if (nums[i] != nums[i-1]) return nums[i-1];
        }
        return nums[nums.length - 1];
    }
    //best solution - from web
    public int bestSolution(int[] nums) {
        int x = 0;
        for (int num : nums) {
            x = x ^ num;
        }
        return x;
    }
}


