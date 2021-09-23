package com.jon.learning.search;

public class Linear {
    public static void main(String[] args) {
        int[] arr = {46, 15, 45, 19, -1, 22, 83759};

        System.out.println("15 is in position " + search(arr, 15));
        System.out.println("-1 is in position " + search(arr, -1));
        System.out.println("21 is in position " + search(arr, 21));
        System.out.println("83759 is in position " + search(arr, 83759));
    }

    public static int search(int[] input, int sought) {
        for (int i=0; i < input.length; i++) {
            if (input[i] == sought) return i;
        }

        return -1;
    }
}
