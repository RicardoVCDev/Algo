package com.jon.learning.sort.merge;

public class MergeSort {
    public static void main(String[] args){
        int[] intArr = {22, 30, -15, 9, 0, -55, 42};

        mergeSort(intArr, 0, intArr.length);

        printem(intArr);
    }

    public static void mergeSort(int[] input, int start, int end){
        if (end - start < 2) return;

        int mid = (start + end) / 2;
        mergeSort(input, start, mid);
        mergeSort(input, mid, end);
        merge(input, start, mid, end);
    }

    public static void merge(int[] intArr, int start, int mid, int end) {
        if (intArr[mid - 1] <= intArr[mid]) return;

        int i = start;
        int j = mid;
        int tempIndex = 0;
        int[] tempArr = new int[end - start];
        while (i < mid && j < end) {
            tempArr[tempIndex++] = intArr[i] <= intArr[j]
                    //copy intArr[i] coz it's smaller
                    ? intArr[i++]
                    //else, copy intArr[j] coz that is smaller
                    : intArr[j++];
        }
        //resedue on the right (j) are already in the right position in the input
        //resedue on the left must be moved to the end of the input
        System.arraycopy(intArr, i, intArr, start + tempIndex, mid - i);
        System.arraycopy(tempArr, 0, intArr, start, tempIndex);
    }

    public static void printem(int[] intArr){
        for (int i=0; i<intArr.length; i++) {
            System.out.println(intArr[i]);
        }
    }
}
