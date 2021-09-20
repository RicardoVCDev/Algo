package com.jon.learning.sort.merge;

public class Merge4 {
    public static void main(String[] args) {
        int[] intArr = {9, -4, 8, 0, 3, 6, 1};
        divide(intArr, 0, intArr.length);
        for (int i = 0; i < intArr.length; i++) {
            System.out.println(intArr[i]);
        }
    }
//started at 10:05 am
    public static void divide(int[] input, int start, int end) {
        //{-4, 8}
        //{9, -4, 8}
        //{9, -4, 8, 0, 3, 6, 1}
        if (end - start < 2) return;
        int mid = (start + end) / 2;
        //{-4} {8}
        //{9} {-4, 8}
        //{9, -4, 8} { 0, 3, 6, 1}
        divide(input, start, mid);
        //{-4, 8}
        divide(input, mid, end);
        sort(input, start, mid, end);
    }

    //5 , 6, 7
    public static void sort(int[] input, int start, int mid, int end) {
        if (input[mid -1] <= input[mid]) return;
        //{9, -4, 8, 0, 3, 6, 1}
        int left = start;
        int right = mid;
        int[] temp = new int[end - start];
        int tempIndex = 0;
        while (left < mid && right < end) {
            temp[tempIndex++] = input[left] <= input[right] ? input[left++] : input[right++];
            //{1,0?}
        }
        arrayCopy(input, left, input, start + tempIndex, mid - left);
        arrayCopy(temp, 0, input, start, tempIndex);
    }
    //{-4,0?}, 0, {9, -4, 8, 0, 3, 6, 1}, 1, 1
    //{9, -4, 8, 0, 3, 6, 1}, 5, {9, -4, 8, 0, 3, 6, 1}, 6, 1
    //{1,0?}, 0, {9, -4, 8, 0, 3, 6, 1}, 5, 1
    public static void arrayCopy(int[] src, int srcPos, int[] dest, int destPos, int len) {
        for (int i = 0; i < len; i++) {
            dest[destPos++] = src[srcPos + i];
            //{9, -4, 8, 0, 3, 1, 6}
        }
    }
}
