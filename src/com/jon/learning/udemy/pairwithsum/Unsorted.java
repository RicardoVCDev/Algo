package com.jon.learning.udemy.pairwithsum;

import java.util.HashSet;
import java.util.Set;

public class Unsorted {
    public static void main(String[] args) {
//        int[] arr1 = {1,2,3,9};
        int[] arr1 = {1,2,6,4};
        int sumIs = 8;

        long startTime = System.nanoTime();
        System.out.println("Brute " + brute(arr1, sumIs));
        long endTime = System.nanoTime();
        System.out.println("Execution duration: " + (endTime - startTime));

        startTime = System.nanoTime();
        System.out.println("Fines " + hasPairWithSum(arr1, sumIs));
        endTime = System.nanoTime();
        System.out.println("Execution duration: " + (endTime - startTime));
    }

    private static boolean brute(int[] arr1, int lookingFor) {
        //loop through the array,
        //for each item except the current, add and check if they equals "lookingFor" value
        //if they are, return true
        //if execution finishes the loop, then no possible pair is found, return false
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (i != j) {
                    if (arr1[i] + arr1[j] == lookingFor) return true;
                }
            }
        }

        return false;
    }

    private static boolean hasPairWithSum(int[] arr1, int lookingFor) {
        //loop through the array
        //On each item, subtract the item from "lookingFor" value and check if difference exists in the set
        //if it does, return true
        //else, add the item to the set
        //if the execution finishes the loop, no pair is found. Return false
        Set<Integer> existing = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            int find = lookingFor - arr1[i];
            if (existing.contains(find)) return true;
            existing.add(arr1[i]);
        }

        return false;
    }
}
