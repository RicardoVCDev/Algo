package com.jon.learning.udemy.pairwithsum;

public class Sorted {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,9};
//        int[] arr1 = {1,2,4,4};
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
        //Add the 1st and last item
        //if the sum equals the value of lookingFor, then return true
        //if the sum is greater than the value if "lookingFor", 
        //then move down through the array item since it is sorted lowest to highest
        //if the sum is lesser than the value, then move up through the array items
        //if the execution reaches the end of the loop, a pair is not found, return false
        int i = 0;
        int j = arr1.length - 1;
        while (i < j) {
            int total = arr1[i] + arr1[j]; 
            if (total == lookingFor) return true;
            if (total > lookingFor) j--;
            if (total < lookingFor) i++;
        }

        return false;
    }
}
