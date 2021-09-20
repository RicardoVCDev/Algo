package com.jon.learning;

public class KthHighest {
    public static void main(String[] args) {
//        int[] intArr = {22, 30, -15, 9, 0, -55, 42, 8};
        int[] intArr = {22, 30, -15, 9, 0, -55, 42};
        int kth = 4;
        int[] holder = new int[kth];

        for (int i=0; i<intArr.length; i++) {
            insert(holder, intArr[i], i);
        }
        System.out.println("Anser: " + printArr(holder));
    }

    public static void insert(int[] ansArr, int numToInsert, int idx){
        int pos = idx;
        System.out.println("ansArr: " + printArr(ansArr));
        System.out.println("numToInsert: " + numToInsert);
        System.out.println("idx: " + idx);

        if (pos < ansArr.length) ansArr[pos] = Integer.MAX_VALUE;
        if (pos >= ansArr.length) {
            pos = ansArr.length - 1;
            if (ansArr[pos] > numToInsert) ansArr[pos] = numToInsert;
        }

        for (;pos > 0 && ansArr[pos-1] > numToInsert; pos--) {
            ansArr[pos] = ansArr[pos-1];
        }
        ansArr[pos] = Math.min(ansArr[pos], numToInsert);

        System.out.println("insert result: " + printArr(ansArr));
        System.out.println("------------------------");
    }

    public static String printArr(int[] intArr) {
        StringBuilder sb = new StringBuilder("{");
        int i=0;
        for (;i< intArr.length-1; i++) {
            sb.append(intArr[i]+",");
        }
        sb.append(intArr[i]+"}");
        return sb.toString();
    }
}
