package com.jon.learning.sort.insertion;

public class InsertionAgain {
    public static void main(String[] args) {
        int[] intArr = {22, 30, -15, 9, 0, -55, 42};

        for (int i=0; i<intArr.length; i++) {
            int unsorted = intArr[i];

            int unsortedIndx = i;
            for (; unsortedIndx > 0 && intArr[unsortedIndx-1] > unsorted; unsortedIndx--) {
                intArr[unsortedIndx] = intArr[unsortedIndx - 1];
            }
            intArr[unsortedIndx] = unsorted;
        }

        System.out.println(print(intArr));
    }

    public static String print(int[] array) {
        if (array.length < 1) return "{}";

        StringBuilder sb = new StringBuilder("{");
        int i=0;
        for (; i<array.length-1; i++){
            sb.append(array[i]).append(",");
        }
        sb.append(array[i]).append("}");

        return sb.toString();
    }
}
