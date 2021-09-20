package com.jon.learning.sort.merge;

public class Merge2 {
    public static void main(String[] args) {
        int[] intArr = {9,3,-7,8,0,1,5};

        mergeSort(intArr, 0, intArr.length);
        for (int i=0; i < intArr.length; i++){
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
        if (input[mid -1] <= input[mid]) return;

        int i = start;
        int j = mid;
        int tempIndex = 0;
        int[] temp = new int[start + end];

        while(i < mid && j < end) {
            temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
        }
        // resedue: j is already in correct right side... only i need
        System.arraycopy(input, i, input, start + tempIndex, mid - i);
        System.arraycopy(temp, 0, input, start, tempIndex);
    }
}
