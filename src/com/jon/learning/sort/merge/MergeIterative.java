package com.jon.learning.sort.merge;

public class MergeIterative {
    public static void main(String[] args) {
//        int[] intArr = {9,3,-7,8,0,1,5};
        int[] intArr = {9, -4, 8, 0, 3, 6, 1};

        mergeSort(intArr);
        for (int i=0; i < intArr.length; i++) {
            System.out.println(intArr[i]);
        }
    }

    public static void mergeSort(int[] intArr) {
        if (intArr == null) return;

        //can only sort 2 or more elems
        if (intArr.length > 1) {
            int mid = intArr.length / 2;
            int[] left = new int[mid];
            //get the elems on left
            for (int i=0; i < mid; i++){
                left[i] = intArr[i];
            }

            //elems on the right
            int[] right = new int[intArr.length - mid];
            for (int i=mid; i < intArr.length; i++) {
                right[i - mid] = intArr[i];
            }

            mergeSort(left);
            mergeSort(right);

            int i = 0;
            int j = 0;
            int k = 0;

            while (i < left.length && j < right.length) {
                if (left[i] < right[j]) {
                    intArr[k++] = left[i++];
                } else {
                    intArr[k++] = right[j++];
                }
            }

            if (i < left.length) {
                while (k < intArr.length) {
                    intArr[k++] = left[i++];
                }
            }
        }
    }
}
