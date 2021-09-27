package com.jon.learning.tests;

import java.util.*;

/**
 * Complete the bestAverageGrade function below.
 * It has 1 parameter, scores, which is a 2D array of Student Name and test scores
 * Example:
 *  [
 *      ["Bobby", 87"],
 *      ["Charles", "100"],
 *      ["Eric", "64"],
 *      ["Charles", "22"]
 *  ]
 *  Test scores may be positive or negative integers
 *
 *  If you end up with an average grade that is not an integer, you should use
 *  a floor function to return the largest integer less than or equal to the average.
 *
 *  Return 0 for an empty input
 */
public class BestAverage {
    public static void main(String[] args) {
        String[][] input = {
                {"Bobby", "87"},
                {"Charles", "100"},
                {"Eric", "64"},
                {"Charles", "22"}
        };

        int expected = 87;
        if (bestAverageGrade(input) != expected) {
            System.out.println("failed!");
        } else {
            System.out.println("pass!");
        }
    }

    public static Integer bestAverageGrade(String[][] scores) {
        if (scores == null) return 0;
        if (scores.length == 0) return 0;

        Map<String, List<Integer>> scoreMap = new HashMap<>();
        //loop through the array
        for(int i=0; i<scores.length; i++) {
            int grade = Integer.parseInt(scores[i][1]);
            //if student has existing score, get average
            if (scoreMap.get(scores[i][0]) == null) {
                List<Integer> ownScore = new ArrayList<>();
                ownScore.add(grade);
                scoreMap.put(scores[i][0], ownScore);
            } else {
                scoreMap.get(scores[i][0]).add(grade);
            }
        }
        int highest = Integer.MIN_VALUE;
        for (List<Integer> ownScore : scoreMap.values()){
            highest = Math.max(highest, getAverage(ownScore));
        }
        return highest;
    }

    //return the average;
    private static int getAverage(List<Integer> ownScore) {
        int running = 0;
        for (Integer score : ownScore) {
            running = running + score;
        }
        return running / ownScore.size();
    }
}
