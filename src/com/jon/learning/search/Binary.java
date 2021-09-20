package com.jon.learning.search;

public class Binary {
    public static void main(String[] args) {
        int[] intArr = {1,2,3,4,5,6,7};

        int ans = divide(intArr, intArr.length, 1);
        System.out.println(ans);
    }

    public static int divide(int[] input, int len, int target) {
        int min = 0;
        int max = len - 1;
        int mid;

        //
        //{1,2,3,4,5,6,7}
        while (max >= min) {
            mid = (max + min) / 2;
            //mid = 6
            if (target == input[mid]) return mid;
            if (target < input[mid]) {
                max = mid - 1;
            } else { //it's on the right partition
                min = mid + 1;
            }
        }

        return -1;
    }
}
