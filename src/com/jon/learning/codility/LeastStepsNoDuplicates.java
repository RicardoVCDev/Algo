package com.jon.learning.codility;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LeastStepsNoDuplicates {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,1};
        System.out.println("[1,2,1]");
        System.out.println("result: "+arrange(arr));
        System.out.println("-----------------------------------");
        arr = new int[]{2,1,4,4};
        System.out.println("[2,1,4,4]");
        System.out.println("result: "+arrange(arr));
        System.out.println("-----------------------------------");
        arr = new int[]{6,2,3,5,6,3};
        System.out.println("[6,2,3,5,6,3]");
        System.out.println("result: "+arrange(arr));
        System.out.println("-----------------------------------");
        arr = new int[]{6,2,4,5,6,5};
        System.out.println("[6,2,4,5,6,5]");
        System.out.println("result: "+arrange(arr));
        System.out.println("-----------------------------------");
    }

    public static int arrange(int[] arr) {
        int ans = 0;
        Set<Integer> s = new HashSet<>();
        HashSet hs = new HashSet();
        int temp;
        boolean bottom = false;
        boolean maxed = false;

//        Arrays.parallelSort(arr);
        int low = 1;
        int high = arr.length;
        for (int i=0; i<arr.length; i++) {
            temp = arr[i];
            System.out.println("temp before while: "+temp);
            while (s.add(temp) == false) {
                hs.add(ans);
                if (ans==1000000000) return 1;
                ans++;
                if (temp == low || bottom) {
                    temp++;
                    bottom = true;
                } else if (temp == high || maxed) {
                    temp--;
                    maxed = true;
                } else if (temp <= high/2) {
                    temp--;
                } else {
                    temp++;
                }
//                System.out.println("temp in while: "+temp);
            }
        }

        System.out.println("s: "+s);
        return ans;
    }

//    public int getMax(int[] arr) {
//        if (arr.length == 0) return Integer.MIN_VALUE;
//        int ans = arr[0];
//        for (int i=1; i<arr.length; i++) {
//            if (ans < arr[i]) ans = arr[i];
//        }
//
//        return ans;
//    }
}
