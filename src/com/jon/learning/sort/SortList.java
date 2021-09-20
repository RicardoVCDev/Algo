package com.jon.learning.sort;

import java.util.Arrays;
import java.util.List;

public class SortList {
    public static void main(String[] args){
        String[] strings = {"abc", "2", "0", "10"};
        Arrays.sort(strings);
        List<String> list = Arrays.asList(strings);
        System.out.println(Arrays.toString(list.toArray()));
    }
}
