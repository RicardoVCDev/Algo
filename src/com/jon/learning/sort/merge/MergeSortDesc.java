package com.jon.learning.sort.merge;

public class MergeSortDesc {
    public static void main(String[] args) {
//        int[] intArr = {9,3,-7,8,0,1,5};
        int[] intArr = {9, -4, 8, 0, 3, 6, 1};

        mergeSort(intArr, 0, intArr.length);
        for (int i=0; i < intArr.length; i++) {
            System.out.println(intArr[i]);
        }
    }

    public static void mergeSort(int[] input, int start, int end) {
        if (end - start < 2) return;

        int mid = (start + end) / 2;
        mergeSort(input, start, mid);
        mergeSort(input, mid, end);
        merge(input, start, mid, end);
    }

    public static void merge(int[] input, int start, int mid, int end) {
        if (input[mid -1] >= input[mid]) return;

        int left = start;
        int right = mid;
        int tempIndex = 0;
        int[] temp = new int[end - start];

        while (left < mid && right < end) {
            temp[tempIndex++] = input[left] >= input[right] ? input[left++] : input[right++];
        }
        arrayCopy(input, left, input, start + tempIndex, mid - left);
        arrayCopy(temp, 0, input, start, tempIndex);
    }

    public static void arrayCopy(int[] src, int srcStart, int[] dest, int destStart, int len) {
        for (int i=0; i < len; i++) {
            dest[destStart++] = src[srcStart + i];
        }
    }
}
