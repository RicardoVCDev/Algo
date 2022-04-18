package com.jon.learning.udemy.sorting;

public class Insertion {

    /**
     * Sort the given array from lowest to highest
     * Loop through the elements (outer loop).
     * For each item, start an inner loop with index is 1 greater then the current
     * outer index.
     * If inner loop's current value is lower the value of the outer loop then
     * swap them. Keep comparing the inner loop's value while it is lower than it's
     * neighbor on the left or it is at index 0
     * @param arr array to sort
     * @return the sorted array
     */
    public int[] sort(int[] arr) {
        //5 2 8 5 3 0
        for (int i=1; i < arr.length; i++) {
            int temp = arr[i];
            int j;
            for (j=i; j > 0 && arr[j-1] > temp; j--) {
                arr[j] = arr[j-1];
            }
            arr[j] = temp;
        }

        return arr;
    }
}
