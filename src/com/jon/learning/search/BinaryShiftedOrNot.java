package com.jon.learning.search;

public class BinaryShiftedOrNot {
    public static void main(String[] args) {
        int[] intArr = {0,1,2,3,4,5,6,7,-3,-2,-1};

        System.out.println("0 is in position 0: " + search(intArr, 0));
        System.out.println("1 is in position 1: " + search(intArr, 1));
        System.out.println("2 is in position 2: " + search(intArr, 2));
        System.out.println("3 is in position 3: " + search(intArr, 3));
        System.out.println("4 is in position 4: " + search(intArr, 4));
        System.out.println("5 is in position 5: " + search(intArr, 5));
        System.out.println("6 is in position 6: " + search(intArr, 6));
        System.out.println("7 is in position 7: " + search(intArr, 7));
        System.out.println("-3 is in position 8: " + search(intArr, -3));
        System.out.println("-2 is in position 9: " + search(intArr, -2));
        System.out.println("-1 is in position 10: " + search(intArr, -1));
    }

    public static int search(int[] arr, int key) {
        return binarySearch(arr, key, 0, arr.length - 1);
    }

    private static int binarySearch(int[] arr, int key, int start, int end) {
        if (start > end) return -1;
        int mid = (start + end) / 2;
        if (arr[mid] == key) return mid;
        //left half is sorted
        if (arr[start] <= arr[mid]) {
            //key is in this sorted half
            if (arr[start] <= key && key <= arr[mid]) {
                return binarySearch(arr, key, start, mid);
            } else {
                return binarySearch(arr, key, mid + 1, end);
            }
        } else {
            //key is in this sorted half
            if (arr[mid] <= key && key <= arr[end]) {
                return binarySearch(arr, key, mid + 1, end);
            } else {
                return binarySearch(arr, key, start, mid);
            }
        }
    }
}
