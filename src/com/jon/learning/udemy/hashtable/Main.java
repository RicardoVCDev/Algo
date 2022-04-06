package com.jon.learning.udemy.hashtable;

import com.jon.learning.Shouter;

public class Main {
    public static void main(String[] args) {
        BasicHashTable bht = new BasicHashTable(2);
        System.out.println("size: "+bht.size());
        bht.put("Jon", "Dad");
        bht.put("Joan", "Mom");
        bht.put("Faith", "Eldest");
        System.out.println("size: "+bht.size());
        Shouter.shout(bht.getKeys());
    }
}
