package com.jon.learning.sort.insertion;

public class Insertion4 {
    public static void main(String[] args){
        int[] intArr = {22, 30, -15, 9, 0, -55, 42};
        for (int i=0; i < intArr.length; i++){
            int unsorted = intArr[i];
            int j=i;
            for (; j>0 && unsorted < intArr[j-1]; j--) {
                intArr[j] = intArr[j-1];
            }
            intArr[j] = unsorted;
        }

        printem(intArr);
    }

    private static void printem(int[] intArr){
        for (int i=0; i<intArr.length; i++){
            System.out.println(intArr[i]);
        }
    }
}
