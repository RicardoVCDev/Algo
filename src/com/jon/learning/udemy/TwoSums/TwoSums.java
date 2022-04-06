package com.jon.learning.udemy.TwoSums;

import com.jon.learning.Shouter;

import java.util.HashMap;
import java.util.Map;

public class TwoSums {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
//        int[] nums = {3,2,4};
//        int target = 6;
//        int[] nums = {3,3};
//        int target = 6;
//        int[] nums = {1,2,3,4,5,6,7,8,9,0};
//        int target = 17;

        Shouter.shout(twoSum(nums, target));
    }

    public static int[] twoSum(int[] nums, int target) {
        //create a Map<Integer, Integer> temp
        //divide the length into 2 and process each half per iteration
        //check the value needed to add to the value if i is in tempValue
        //if it is, then return i and index of value from tempValue
        //if not found, put key nums[i] to temp and i as value
        //do the same for the 2nd half
        //if execution finishes, the correct combination doesn't exists

        Map<Integer, Integer> temp = new HashMap<>(nums.length);
        int mid = nums.length / 2;
        int[] reply = new int[2];
        for (int i = 0; i < mid; i++) {
            int needed = target - nums[i];
            if (temp.containsKey(needed)) {
                reply[0] = temp.get(needed);
                reply[1] = i;
                return reply;
            }
            temp.put(nums[i], i);

            needed = target - nums[mid];
            if (temp.containsKey(needed)) {
                reply[0] = temp.get(needed);
                reply[1] = mid;
                return reply;
            }
            temp.put(nums[mid], mid++);
        }

        if (mid < nums.length) {
            int needed = target - nums[mid];
            if (temp.containsKey(needed)) {
                reply[0] = temp.get(needed);
                reply[1] = mid;
                return reply;
            }
        }

        return reply;
    }
}
