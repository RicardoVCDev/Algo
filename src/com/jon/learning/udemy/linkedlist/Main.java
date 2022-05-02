package com.jon.learning.udemy.linkedlist;

import com.jon.learning.Shouter;

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

        Doubly<String> doubly = new Doubly<>();
        doubly.addFirst("Jon");
        doubly.addFirst("Joan");
        doubly.addFirst("Faith");
        doubly.addFirst("Yuan");
        doubly.add(2,"Azsy");
        Shouter.shout(doubly);
        System.out.println(doubly.get(2));
        doubly.remove(0);
        Shouter.shout(doubly);
        doubly.remove(doubly.getSize() - 1);
        Shouter.shout(doubly);
        doubly.remove(1);
        Shouter.shout(doubly);
    }
}
