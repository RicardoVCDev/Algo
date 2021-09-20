package com.jon.learning.search;

public class BinaryShifted {
    public static void main(String[] args) {
        int[] intArr = {4,5,6,7,1,2,3};
        int ans = search(intArr, 6);
        System.out.println(ans);
    }

    public static int search(int[] input, int target) {
        int min = 0;
        int max = input.length - 1;
        int mid;

        while(max >= min) {
            mid = (max + min) / 2;
            if (target == input[mid]) return mid;
            //{4,5,6} | 1
            //{4,5,6,7,1,2,3} | 1
            if (input[min] <= input[mid - 1]) {//left is sorted
                if (target >= input[min] && target <= input[mid - 1]) {
                    max = --mid;
                } else {//deal with the shifted right
                    for (int i = mid + 1; i <= max; i++) {
                        if (target == input[i]) return i;
                    }
                    return -1;
                }
            } else {// left is shifted
                if (target > input[mid] && target <= input[max]) {
                    min = --mid;
                } else { //deal the shifted left
                    for (int i = 0; i < mid; i++) {
                        if (target == input[i]) return i;
                    }
                    return -1;
                }
            }
        }
        return -1;
    }
}
