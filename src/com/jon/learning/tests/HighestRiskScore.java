package com.jon.learning.tests;

/**
 * Customers have Related Party (RP). Each related party has their own Risk Score.
 * Risk score ranges from -99 to 99.
 * RPs can have multiple Risk Scores that may come from different sources.
 * RPs with multiple Risk Scores will be evaluated by the average of their total.
 * If the average is not an integer, use Java's Math.round(input) function to get integer value
 *
 * Example:
 *      ["ABC Company", "87"],
 *      ["Softbank", "100"],
 *      ["Prudent Investment Inc.", "64"],
 *      ["Softbank", "22"]
 *      ["123 Ltd.", "75"]
 *      ["ABC Company", "61"]
 *
 * Expected answer is: 75... because:
 *      ABC Company's average is 74
 *      Softbank's average is 61
 *      Prudent Investment Inc.'s average is 64
 *      123 Ltd.'s average is 75
 *
 */
public class HighestRiskScore {
    public static void main(String[] args) {
        String[][] input = {
                {"ABC Company", "87"},
                {"Softbank", "100"},
                {"Prudent Investment Inc.", "75"},
                {"Softbank", "22"},
                {"123 Ltd.", "64"},
                {"ABC Company", "61"}
        };

        int expected = 75;
        if (solution(input) != expected) {
            System.out.println("failed!");
        } else {
            System.out.println("pass!");
        }
    }

    public static Integer solution(String[][] scores) {
        return null;
    }
}
