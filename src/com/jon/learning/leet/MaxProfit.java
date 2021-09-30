package com.jon.learning.leet;

/**
 * You are given an integer array prices where prices[i] is the price of a given stock on the ith day.
 * On each day, you may decide to buy and/or sell the stock. You can only hold at most one share of the
 * stock at any time. However, you can buy it then immediately sell it on the same day.
 * Find and return the maximum profit you can achieve.
 * Input: prices = [7,1,5,3,6,4]
 * Output: 7
 * Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
 * Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
 * Total profit is 4 + 3 = 7.
 * Input: prices = [1,2,3,4,5]
 * Output: 4
 * Explanation: Buy on day 1 (price = 1) and sell on day 5 (price = 5), profit = 5-1 = 4.
 * Total profit is 4.
 * Input: prices = [7,6,4,3,1]
 * Output: 0
 * Explanation: There is no way to make a positive profit, so we never buy the stock to achieve the maximum profit of 0.
 */
public class MaxProfit {
    public static void main(String[] args) {
        int[] prices = {3,3};
        System.out.println(maxProfit(prices));
    }

    private static int maxProfit(int[] prices) {
        //[7,1,5,3,6,4]

        int max = 0;
        int highest = 0;
        int lowest = 0;
        for (int i = 0; i < prices.length - 1;) {
            while (i < prices.length - 1 && prices[i] >= prices[i+1])
                i++;
            lowest = prices[i];
            while (i < prices.length - 1 && prices[i] <= prices[i+1]) i++;
            highest = prices[i];
            max += highest - lowest;
        }
        return max;

//        int i = 0;
//        int valley = prices[0];
//        int peak = prices[0];
//        int maxprofit = 0;
//        while (i < prices.length - 1) {
//            while (i < prices.length - 1 && prices[i] >= prices[i + 1])
//                i++;
//            valley = prices[i];
//            while (i < prices.length - 1 && prices[i] <= prices[i + 1])
//                i++;
//            peak = prices[i];
//            maxprofit += peak - valley;
//        }
//        return maxprofit;
    }
}
