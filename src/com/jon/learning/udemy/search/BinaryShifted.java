package com.jon.learning.udemy.search;

public class BinaryShifted {
    public static void main(String[] args) {
        int arr[] = {7,8,9,0,1,2,3,4,5,6};

        for (int i=-1; i <= arr.length; i++) {
            System.out.println("Target: "+i+" is in index "+find(arr, i));
        }
    }

    /**
     * Find the index of the input int target among the input array arr.
     * Divide the array elements into 2 segments. If the target = arr[mid] return mid.
     * Check if left side is sorted. If arr[start] < arr[mid] then left side is sorted.
     * - Check if the target is in the sorted left side. If arr[start] <= target and
     * target <= arr[mid - 1], then target is on the sorted side, hence, set end = mid.
     * - Else, target is in the shifted side, do a linear search from arr[mid] through arr[end - 1]
     * Else (right side is sorted)
     * - Check if the target is in the sorted right side. If arr[mid] <= target && target <
     * arr[end - 1], then the target is in the sorted side, hence, set start = mid + 1.
     * - Else, target is in the shifted side, do a linear search from arr[start] through arr[mid - 1]
     * @param arr the given array where to search
     * @param target the int to look for among the given array
     * @return the index of the input int target among the input array arr.
     * If nout found, return -1.
     */
    private static int find(int[] arr, int target) {
        int start = 0;
        int end = arr.length;
        int mid;

        while (start < end) {
            mid = (start + end) / 2;
            if (arr[mid] == target) return mid;

            if (arr[start] < arr[mid]) {
                if (arr[start] <= target && target <= arr[mid - 1]) {
                    end = mid;
                } else {
                    return find(arr, target, mid, end);
                }
            } else {
                if (arr[mid] <= target && target <= arr[end - 1]) {
                    start = mid + 1;
                } else {
                    return find(arr, target, start, mid);
                }
            }
        }

        return - 1;
    }

    private static int find(int[] arr, int target, int start, int end) {
        while(start < end) {
            if (arr[start] == target) return start;
            start++;
        }
        //not found
        return -1;
    }
}
