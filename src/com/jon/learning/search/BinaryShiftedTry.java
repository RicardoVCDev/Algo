package com.jon.learning.search;

public class BinaryShiftedTry {
    public static void main(String[] args) {
        int[] intArr = {4,5,6,7,1,2,3};
        System.out.println(search(intArr, 4));
        System.out.println(search(intArr, 5));
        System.out.println(search(intArr, 6));
        System.out.println(search(intArr, 7));
        System.out.println(search(intArr, 1));
        System.out.println(search(intArr, 2));
        System.out.println(search(intArr, 3));
        System.out.println(search(intArr, 0));
    }

    public static int search(int[] input, int target) {
        int start = 0;
        int end = input.length;
        int mid = (start + end) / 2;

        if (input[mid] == target) return mid;
        //left is sorted
        if (input[start] < input[mid]) {
            //target is within the sorted side (left)
            if (input[start] <= target && target <= input[mid-1]) {
                return binary(input, start, end, target);
            } else {//target is in unsorted half (right)
                return linear(input, mid+1, end, target);
            }
        } else { //right is sorted
            if (input[mid+1] <= target && target <= input[end-1]) {
                return binary(input, mid+1, end, target);
            } else {//target is in the unsorted half (left)
                return linear(input, start, end, target);
            }
        }
    }

    public static int binary(int[] input, int start, int end, int target) {
        while (start < end) {
            int mid = (start + end) / 2;
            if (input[mid] == target) return mid;
            if (input[mid] < target) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        return -1;
    }

    public static int linear(int[] input, int start, int end, int target) {
        for (;start < end; start++) {
            if (input[start] == target) return start;
        }

        return -1;
    }
}
