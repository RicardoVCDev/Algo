package com.jon.learning.others;

import java.util.LinkedList;
import java.util.List;

public class BooleanParse {
    public static void main(String[] args) {
        List<Boolean> list = new LinkedList<>();
        list.add(true);
        list.add(Boolean.parseBoolean("FalSe"));
        list.add(Boolean.FALSE);
        System.out.print("3");
        System.out.print(list.get(1));
    }
}
