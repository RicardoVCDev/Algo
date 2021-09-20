package com.jon.learning.list;

import com.jon.learning.model.Employee;

public class MainIntSingly {
    public static void main(String[] args) {
        IntegerSinglyLinkedList list = new IntegerSinglyLinkedList();
        list.insertSorted(1);
        list.printList();
        System.out.println("List size: " + list.getSize());

        list.insertSorted(2);
        list.printList();
        System.out.println("List size: " + list.getSize());

        list.insertSorted(4);
        list.printList();
        System.out.println("List size: " + list.getSize());

        list.insertSorted(3);
        list.printList();
        System.out.println("List size: " + list.getSize());
    }
}
