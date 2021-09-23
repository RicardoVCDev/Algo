package com.jon.learning.sort.bucket;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BucketSort {
    public static void main(String[] args) {
//        System.out.println(54 / 10 % 10);
        int[] arr = {54, 46, 83, 66, 95, 92, 43};

        bucketSort(arr);

        for (int i=0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void bucketSort(int[] input) {
        List<Integer>[] buckets = new List[10];
        //initialize each List element inside the buckets array of Lists
        for (int i=0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<Integer>();
        }
        //put each element from input into respective buckets, where:
        //- each bucket represents a segment decided by hashing algo;
        //- each segment will be kept in the ArrayList element of buckets.
        for (int i=0; i < input.length ;i++) {
            buckets[hash(input[i])].add(input[i]);
        }
        //sort entries in each ArrayList element
        for (int i=0; i < buckets.length; i++) {
            Collections.sort(buckets[i]);
        }
        //now, each entries in each ArrayList element of buckets, therefore:
        //- each ArrayList element is already sorted because they based on the hashing algo, where
        //    each the result is based on the 10s digit, and is used as index
        //- each entry in the ArrayList element is sorted by Collections.sort()
        //now, we can put back the sorted entries of each elements into input as they are sorted
        int j = 0;
        for (int i=0; i < buckets.length; i++) {
            for (Integer value : buckets[i]) {
                input[j++] = value;
            }
        }
    }

    private static int hash(int value) {
        return value / (int) 10;
    }
}
