package com.jon.learning.leet;

public class MaxProfit1 {

    public static void main(String[] args) {
//        int arr[] = {7,1,5,3,6,4};
//        int arr[] = {1,2,3,4,5};
        int arr[] = {7,6,4,3,1};
        System.out.println(solution(arr));
    }

    /**
     * Return the most profit obtainable in the given stock prices per day.
     * If input arr.length is less than 2, return 0,
     * Set maxProfit and highest to 0, and lowest to arr[0].
     * Loop through the prices (given array) starting with 2nd element.
     * If current price is higher than previous price get the difference.
     * Set highest as the higher value between the current value of highest vs the diff.
     * If current price is lower thant previous then increment maxProfit with highest,
     * set lowest as current price (arr[i]) and reset highest to 0.
     * @param arr the prices per day where i is a day
     * @return the highest profit that can be achieved.
     */
    public static int solution(int[] arr) {
        if (arr.length < 2) return 0;

        int maxProfit = 0;
        int lowest = arr[0];
        int highest = 0;

        for (int i=1; i<arr.length; i++) {
            if (arr[i] > arr[i-1]) {
                highest = Math.max(highest, arr[i] - lowest);
            } else {
                maxProfit = maxProfit + highest;
                lowest = arr[i];
                highest = 0;
            }
        }

        return highest > 0 ? maxProfit + highest : maxProfit;
    }

//    for (int i=0; i<arr.length-1; i++) {
//        if (arr[i] < arr[i+1]) {
//            highest = Math.max(highest, arr[i+1] - lowest);
//        } else {
//            maxProfit=+ highest;
//            lowest = Math.min(lowest, arr[i]);
//            highest = 0;
//        }
//    }

}
