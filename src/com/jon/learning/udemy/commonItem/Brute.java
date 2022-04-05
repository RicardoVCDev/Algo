package com.jon.learning.udemy.commonItem;

public class Brute {
    public static void main(String[] args) {
        String[] arr1 = {"a", "b", "c"};
        String[] arr2 = {"1", "2", "3"};

        System.out.println(commonExists(arr1, arr2));
    }

    private static boolean commonExists(String[] arr1, String[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) return true;
            }
        }

        return false;
    }
}
