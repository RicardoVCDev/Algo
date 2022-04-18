package com.jon.learning.udemy.sorting;

import com.jon.learning.Shouter;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int arr[] = {9,3,7,1,4,-3,2,0,5,8,6};
        Bubble bubble = new Bubble();
        Shouter.shout(bubble.sort(Arrays.copyOf(arr, arr.length)));

        Selection selection = new Selection();
        Shouter.shout(selection.sort(Arrays.copyOf(arr, arr.length)));

        Insertion insertion = new Insertion();
        Shouter.shout(insertion.sort(Arrays.copyOf(arr, arr.length)));
    }
}
