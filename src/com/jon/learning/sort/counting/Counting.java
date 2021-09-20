package com.jon.learning.sort.counting;

public class Counting {
    public static void main(String[] args) {
        int[] intArr = {2,5,9,8,2,8,7,10,4,3};

        countSort(intArr, 1, 10);

        for (int i=0; i < intArr.length; i++) {
            System.out.println(intArr[i]);
        }
    }

    public static void countSort(int[] input, int min, int max) {
        int[] countArr = new int[(max - min) + 1];
        for (int i=0; i < input.length; i++) {
            countArr[input[i] - min]++;
        }

        int j=0;
        for (int i = min; i <= max; i++) {
            while(countArr[i - min] > 0) {
                input[j++] = i;
                countArr[i - min]--;
            }
        }
    }
}
