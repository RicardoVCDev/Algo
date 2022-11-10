package com.jon.learning.codility;

/*
========================================================
MissingInteger
-------------------
Find the smallest positive integer that does not occur in a given sequence.

Write a function:

class Solution { public int solution(int[] A); }

that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.

For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.

Given A = [1, 2, 3], the function should return 4.

Given A = [−1, −3], the function should return 1.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [1..100,000];
each element of array A is an integer within the range [−1,000,000..1,000,000].
------------------------------------------------------------------------------------
 */

public class MissingInteger {
    //Create array markers with lenth A.length
    //loop through A
    //  if A[i] > 0, then set markers[A[i]] to 1;
    //loop through markers starting with index 1;
    //  if markers[i] is 0 break
    //At this point there is no missing number, return i
    public int solution(int[] A) {
        // write your code in Java SE 8
        int[] marker = new int[1000001];
        for (int i=0; i<A.length; i++) {
            if (A[i] > 0) marker[A[i]] = 1;
        }

        int i=1;
        for (;i<marker.length; i++) {
            if (marker[i] == 0) break;
        }

        return i;
    }
}
