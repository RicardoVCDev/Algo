package com.jon.learning.udemy.sorting;

public class Selection {

    /**
     * Sort the given array from lowest to highest
     * For each element, compare it with the rest.
     * If the selected value (outer loop index) is greater than
     * the corresponding value of the inner index then replace the
     * selected value as the value in the inner loop.
     * At the end of the inner loop, replace the value of the outter loop's
     * index to the selected value.
     * @param arr int array to sort
     * @return sorted int array
     */
    public int[] sort(int arr[]) {
        //5 2 8 1 3 0
        for(int i = 0; i < arr.length; i++) {
            int ind = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[ind] > arr[j]) ind = j;
            }
            int temp = arr[i];
            arr[i] = arr[ind];
            arr[ind] = temp;
        }

        return arr;
    }
}
