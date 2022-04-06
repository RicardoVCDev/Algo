package com.jon.learning;

public class Shouter {
    public static void shout(int[] arr) {
        StringBuffer sb = new StringBuffer("[");
        for (int i = 0; i < arr.length-1; i++){
            sb.append(arr[i]+", ");
        }
        sb.append(arr[arr.length-1]+"]");

        System.out.println(sb.toString());
    }
}
