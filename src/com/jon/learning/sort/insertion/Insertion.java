package com.jon.learning.sort.insertion;

public class Insertion {
    public static void main(String[] args){
        int[] intArray = new int[]{20, 35, -15, 2, 48, -69, 23};

        for (int unsorted=1; unsorted<intArray.length; unsorted++){
            int where = intArray[unsorted];
            int i;
            for (i=unsorted; i>0 && intArray[i-1] > where; i--){
                intArray[i] = intArray[i-1];
            }
            intArray[i] = where;
        }

        for (int i=0; i<intArray.length; i++){
            System.out.println(intArray[i]);
        }
    }
}
