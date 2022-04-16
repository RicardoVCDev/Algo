package com.jon.learning.udemy.search;

public class Binary {
    public static void main(String[] args) {
        int arr[] = {0,1,2,3,4,5,6,7,8,9};

        for (int i=-1; i <= arr.length; i++) {
            System.out.println("Target: "+i+" is in index "+find(arr, i));
        }

    }

    /**
     * Find the given int target among the given array arr.
     * Divide the array elements into 2 segments.
     * If arr[mid] == target, return mid.
     * If target < arr[mid], set end = mid, then iterate.
     * Else, set start = mid + 1, then iterate.
     * @param arr int array where to do the search
     * @param target the int to search among the given arr
     * @return the index of the input int target among the input array arr.
     * If not found, return -1.
     */
    private static int find(int[] arr, int target) {
        int start = 0;
        int end = arr.length;
        int mid;

        while (start < end) {
            mid = (start + end) / 2;
            if (arr[mid] == target) return mid;
            if (target < arr[mid]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }
}
