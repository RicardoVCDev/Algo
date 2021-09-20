package com.jon.learning.sort.merge;

public class MergeIterative1 {
    public static void main(String[] args) {
        int[] intArr = {9,3,-7,8,0,1,5};
        divide(intArr);
        for (int i = 0; i < intArr.length; i++) {
            System.out.println(intArr[i]);
        }
    }

    public static void divide(int[] intArr) {
        if (intArr == null) return;

        //can only sort 2 or more elems
        //7
        if (intArr.length > 1) {
            //get the left side
            int mid = intArr.length / 2;
            int[] left = new int[mid];
            //3
            for (int i=0; i < left.length; i++) {
                left[i] = intArr[i];
            }
            //get the right side
            int[] right = new int[intArr.length - mid];
            //-7
            for (int i = mid; i < intArr.length; i++ ) {
                right[i - mid] = intArr[i];
            }

            divide(left);
            divide(right);

            int i = 0;
            int j = 0;
            int k = 0;

            //3,7
            while (i < left.length && j < right.length) {
                if (left[i] <= right[j])
                    intArr[k++] = left[i++];
                else
                    intArr[k++] = right[j++];
            }
            while (i < left.length) {
                intArr[k++] = left[i++];
            }
        }
    }
}
