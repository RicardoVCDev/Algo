package com.jon.learning.udemy.recurringnum;

import java.util.HashSet;
import java.util.Set;

public class RecurringNumber {
    public static void main(String[] args) {
//        int[] given = {2,5,1,2,3,5,1,2,4};
//        int[] given = {2,1,1,2,3,5,1,2,4};
        int[] given = {2,3,4,5};

        System.out.println(solution(given));
    }

    private static int solution(int[] arr) {
        //for each item in the array, compare it with other items
        //if same value found, return the value, else 0
        //--- n^2

        //create a hashset
        //add each item in the array in the set, if adding fails, return that item
        //--- O(n)
        Set<Integer> temp = new HashSet<>(arr.length);
        for (int i=0; i < arr.length; i++) {
            if (!temp.add(arr[i])) return arr[i];
        }
        return -1;
    }
}
