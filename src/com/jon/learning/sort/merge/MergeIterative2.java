package com.jon.learning.sort.merge;

public class MergeIterative2 {
    public static void main(String[] args) {
        int[] intArr = {9, -4, 8, 0, 3, 6, 1};

        divide(intArr);
        for(int i=0; i < intArr.length; i++) {
            System.out.println(intArr[i]);
        }
    }

    public static void divide(int[] input) {
        if (input==null) return;

        //
        if (input.length > 1) {
            //divide
            int mid = input.length / 2;
            int[] left = new int[mid];
            for (int i=0; i < left.length; i++) {
                left[i] = input[i];
            }
            //0, 3
            int[] right = new int[input.length - mid];
            for (int i = mid; i < input.length; i++){
                right[i - mid] = input[i];
            }
            //1, 6
            divide(left);
            divide(right);
            //merge
            int i = 0;
            int j = 0;
            int k = 0;
            //{-4,8,9} {0, 1, 3, 6}
            while (i < left.length && j < right.length) {
                if (left[i] <= right[j])
                    input[k++] = left[i++];
                else
                    input[k++] = right[j++];
                //{}
            }
            //{-4,0,1,3, 6, 8, 9}
            while (i < left.length) {
                input[k++] = left[i++];
            }

            while (j < right.length) {
                input[k++] = right[j++];
            }
        }
    }
}
