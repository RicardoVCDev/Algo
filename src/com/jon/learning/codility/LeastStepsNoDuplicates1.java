package com.jon.learning.codility;

import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;

public class LeastStepsNoDuplicates1 {
    public static void main(String[] args) {
        int[] arr = new int[]{6,2,3,5,6,3};
        System.out.println(solve(arr));
    }

    public static int solve(int[] arr){
        //create new arr
        HashMap<Integer, Integer> buckets = new HashMap<>();
        int temp = 0;
        int ans = 0;
        int half = arr.length / 2;
        int low = 1;
        int high = arr.length;
        boolean floor = false;
        boolean ceiling = false;
        for (int i=0; i < arr.length; i++) {
            temp = arr[i];
            //check if elem is a dup
            while (buckets.put(temp, 0)!=null) {
                if (ans==1000000000) return -1;
                ans++;
                if (temp==high || ceiling) {
                    temp--;
                    ceiling = true;
                } else if (temp==low || floor) {
                    temp++;
                    floor = true;
                } else if (temp <= half) {
                    temp--;
                } else { //if > inc
                    temp++;
                }
            }
        }
        return ans;
    }
}
