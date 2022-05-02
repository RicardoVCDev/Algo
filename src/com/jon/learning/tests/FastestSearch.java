package com.jon.learning.tests;

/**
 * Given an array of integers sorted in ascending order,
 * Search for the index of a given value in the fastest way possible.
 * If the value is not, return -1.
 */
public class FastestSearch {
    public static void main(String[] args) {
        int[] intArr = {-3, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7};

        System.out.println("6 is in position 9: " + search(intArr, 6));
        System.out.println("-2 is in position 1: " + search(intArr, -2));
        System.out.println("3 is in position 6: " + search(intArr, 3));
        System.out.println("69 is in position -1: " + search(intArr, 69));
        System.out.println("7 is in position 10: " + search(intArr, 7));
    }

    private static int search(int[] input, int sought) {
        return -1;
    }
}
