package com.jon.learning.tree;

public class MainTree {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(50);
        tree.insert(88);
        tree.insert(22);
        tree.insert(15);
        tree.insert(75);
        tree.insert(45);
        tree.insert(21);
        tree.insert(46);

        tree.traverseInOrder();

        System.out.println("What's in 46? " + tree.get(46));
        System.out.println("What's in 45? " + tree.get(45));
        System.out.println("What's in 44? " + tree.get(44));
        System.out.println("What's in 88? " + tree.get(88));
        System.out.println("What's in 15? " + tree.get(15));
        System.out.println("What's in 50? " + tree.get(50));
        System.out.println("What's in 22? " + tree.get(22));
        System.out.println("What's in 75? " + tree.get(75));
        System.out.println("What's in 21? " + tree.get(21));

        System.out.println("Minimum value is "+tree.min());
        System.out.println("Maximum value is "+tree.max());

        tree.delete(88);
        System.out.println("Maximum value is "+tree.max());

    }
}
