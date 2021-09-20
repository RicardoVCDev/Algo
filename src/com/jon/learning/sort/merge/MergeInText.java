package com.jon.learning.sort.merge;

public class MergeInText {
    public static void main(String[] args) {
        int[] intArr = {9, -4, 8, 0, 3, 6, 1};
        divide(intArr, 0, intArr.length);
        for (int i = 0; i < intArr.length; i++) {
            System.out.println(intArr[i]);
        }
    }
//started at 12:48 am… pause after 22 mins at 13:10… resume 14:10 end 14:22
    public static void divide(int[] input, int start, int end) {
        //{-4, 8}
        //{9, -4, 8}
        //{9, -4, 8, 0, 3, 6, 1}
        if (end - start < 2) return;
        int mid = (start + end) / 2;
        //{-4} {8}
        //{9} {-4, 8}
        //{9, -4, 8} {0, 3, 6, 1}
        divide(input, start, mid);
        divide(input, mid, end);
        //{-4} {8}
        sort(input, start, mid, end);
    }

//{9, -4, 8, 0, 3, 6, 1}, 5,6,7
    public static void sort(int[] input, int start, int mid, int end) {
        if (input[mid-1] <= input[mid]) return;
        int left = start;
        int right = mid;
        int tempIndex = 0;
        int[] temp = new int[end - start];
        //{6} {1}
        while (left < mid && right < end) {
            temp[tempIndex++] = input[left] <= input[right] ? input[left++] : input[right++];
            //{1,0?}
        }
        move(input, left, input, start + tempIndex, mid - left);
        move(temp, 0, input, start, tempIndex);
    }
//{1,0}, 0, {9, -4, 8, 0, 3, 6, 1}, 5, 1
    public static void move(int[] src, int srcStart, int[] des, int desStart, int len) {
        for (int i=0; i < len; i++) {
            des[desStart++] = src[srcStart + i];
            //{9, -4, 8, 0, 3, 6, 6}
            //{9, -4, 8, 0, 3, 6, 1}
        }
    }
}
