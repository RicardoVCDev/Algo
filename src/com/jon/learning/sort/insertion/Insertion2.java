package com.jon.learning.sort.insertion;

public class Insertion2 {
    public static void main(String[] args) {
        int arr[] = new int[]{20, 35, -15, 2, 48, -69, 23};
        for (int unsorted=1; unsorted<arr.length; unsorted++) {
            int unsortedVal = arr[unsorted];
            int i;
            for (i = unsorted; i>0 && arr[i-1] > unsortedVal; i--) {
                arr[i] = arr[i-1];
            }
            arr[i] = unsortedVal;
        }
        print(arr);
    }

    public static void print(int[] arr) {
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+",");
        }
    }
}
