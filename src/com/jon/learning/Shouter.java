package com.jon.learning;

import com.jon.learning.udemy.Node;
import com.jon.learning.udemy.linkedlist.Doubly;
import com.jon.learning.udemy.linkedlist.Singly;

public class Shouter {
    public static void shout(int[] arr) {
        StringBuffer sb = new StringBuffer("[");
        for (int i = 0; i < arr.length-1; i++){
            sb.append(arr[i]+", ");
        }
        sb.append(arr[arr.length-1]+"]");

        System.out.println(sb.toString());
    }

    public static void shout(String[] arr) {
        StringBuffer sb = new StringBuffer("[");
        for (int i = 0; i < arr.length-1; i++){
            sb.append(arr[i]+", ");
        }
        sb.append(arr[arr.length-1]+"]");

        System.out.println(sb.toString());
    }

    public static void shout(Doubly list) {
        StringBuffer sb = new StringBuffer("[");
        Node node = list.getHead();
        while (node != null) {
            sb.append(node.getValue()+",");
            node = node.getNext();
        }
        sb.append("]");
        System.out.println(sb.toString());
    }
}
