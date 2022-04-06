package com.jon.learning.udemy.mergesorted;

import com.jon.learning.Shouter;

public class MergeSorted1 {
    public static void main(String[] args) {
        int[] arr1 = {0,3,4,31};
        int[] arr2 = {4,6,30};

        Shouter.shout(solution(arr1, arr2));
    }

    private static int[] solution(int[] arr1, int[] arr2) {
        //if either arrays is empty, immediately return the other array
        //Set a new int array with length equals the combined length of the given arrays
        //compare first item of arr1 with the first item in arr2
        //put the lowest value between the 2 into the new array
        //increase the index of the array where the value was taken from
        //repeat until the new int array is filled

        if (arr1.length == 0) return arr2;
        if (arr2.length == 0) return arr1;

        int indx1 = 0;
        int indx2 = 0;
        int totalLen = arr1.length + arr2.length;
        int[] reply = new int[totalLen];
        int i = 0;
        for (; indx1 < arr1.length && indx2 < arr2.length; i++) {
            if (arr1[indx1] <= arr2[indx2]) {
                reply[i] = arr1[indx1++];
            } else {
                reply[i] = arr2[indx2++];
            }
            System.out.print(reply[i]+",");
        }
        if (indx1 < arr1.length) {
            reply[i] = arr1[indx1];
        } else {
            reply[i] = arr2[indx2];
        }
        System.out.println(reply[i]);

        return reply;
    }
}
