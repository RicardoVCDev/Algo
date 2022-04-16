package com.jon.learning.udemy.linkedlist;

public class Main {
    public static void main(String[] args) {
        Singly singly = new Singly();

//        singly.append("Jon");
//        singly.append("Joan");
//        singly.append("Faith");
//        System.out.println("Size: "+singly.getSize() +
//                " -> ["+singly.getAllValues()+"]");
//        singly.append("Yuan");
//        singly.append("Azsy");
//        System.out.println("Size: "+singly.getSize() +
//                " -> ["+singly.getAllValues()+"]");

        singly.prepend("Jon");
        singly.prepend("Joan");
        singly.prepend("Faith");
        System.out.println("Size: "+singly.getSize() +
                " -> ["+singly.getAllValues()+"]");
        singly.prepend("Yuan");
        singly.prepend("Azsy");
        System.out.println("Size: "+singly.getSize() +
                " -> ["+singly.getAllValues()+"]");

    }
}
