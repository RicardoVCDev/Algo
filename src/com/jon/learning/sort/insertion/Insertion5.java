package com.jon.learning.sort.insertion;

public class Insertion5 {
    public static void main(String[] args) {
        int[] intArray = new int[]{20, 35, -15, 2, 48, -69, 23};

        for (int unsorted=1; unsorted < intArray.length; unsorted++) {
            int unsortedValue = intArray[unsorted];
            int i=unsorted;
            for (; i > 0 && intArray[i-1] > unsortedValue; i--) {
                intArray[i] = intArray[i-1];
            }
            intArray[i] = unsortedValue;
        }

//        for (int i=0; i < intArray.length; i++) {
//            System.out.print(intArray[i]+" ");
//        }

        for (int j : intArray) {
            System.out.print(j + " ");
        }
    }
}
