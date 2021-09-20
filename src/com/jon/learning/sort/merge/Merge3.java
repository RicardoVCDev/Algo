package com.jon.learning.sort.merge;

public class Merge3 {
    public static void main(String[] args) {
        int[] intArr = {9,3,-7,8,0,1,5};

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

//    int[] intArr = {9,3,-7,8,0,1,5};
    public static void merge(int[] input, int start, int mid, int end) {
        if (input[mid - 1] <= input[mid]) return;

        int left = start;
        int right = mid;
        int tempIndex = 0;
        int[] temp = new int[end - start];
        while (left < mid && right < end) {
            temp[tempIndex++] = input[left] <= input[right] ? input[left++] : input[right++];
        }
        System.arraycopy(input, left, input, tempIndex + start, mid - left);
        System.arraycopy(temp, 0, input, start, tempIndex);
    }
}
