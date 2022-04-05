package com.jon.learning.udemy.commonItem;

import java.util.HashSet;
import java.util.Set;

public class UseSet {
    public static void main(String[] args) {
        String[] arr1 = {"a", "b", "c", "d"};
        String[] arr2 = {"1", "2", "3"};

        System.out.println(commonExists(arr1, arr2));
    }

    private static boolean commonExists(String[] arr1, String[] arr2) {
        Set<String> unique = new HashSet<>();

        //add all items in arr1 to a set
        for (int i = 0; i < arr1.length; i++) {
            unique.add(arr1[i]);
        }
        //loop through 2nd array and add each item to the set
        for (int i = 0; i < arr2.length; i++) {
            //if set return false, means the item exists. Then return true
            if (!unique.add(arr2[i])) return true;
        }

        //if the execution finishes the loop, means there is no commmon item,
        //therefore return false
        return false;
    }
}
