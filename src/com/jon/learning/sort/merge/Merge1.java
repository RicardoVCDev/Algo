package com.jon.learning.sort.merge;

public class Merge1 {

    public static void main(String[] args) {
        int[] intArr = {22, 30, -15, 9, 0, -55, 42};

        mergeSort(intArr, 0, intArr.length);
        printem(intArr);
    }

    public static void mergeSort(int[] input, int start, int end) {
        if (end - start < 2) return;

        int mid = (start + end) / 2;
        mergeSort(input, start, mid);
        mergeSort(input, mid, end);
        merge(input, start, mid, end);
    }

    public static void merge(int[] input, int start, int mid, int end) {
        if (input[mid - 1] <= input[mid]) return;

        int i = start;
        int j = mid;
        int tempIndex = 0;
        int[] temp = new int[end - start];

        while (i < mid && j < end) {
            temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
        }
        //resedue on the right (j) is already in the correct places in the input
        //resedue on the left (i) needs to move at the end
        System.arraycopy(input, i, input, start + tempIndex, mid - i);
        System.arraycopy(temp, 0, input, start, tempIndex);
    }

    public static void printem(int[] intArr) {
        for (int i=0; i < intArr.length; i++) {
            System.out.println(intArr[i]);
        }
    }
}
