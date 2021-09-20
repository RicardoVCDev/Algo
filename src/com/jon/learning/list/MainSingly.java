package com.jon.learning.list;

import com.jon.learning.model.Employee;

public class MainSingly {
    public static void main(String[] args) {
        int id = 1;
        EmployeeSinglyLinkedList list = new EmployeeSinglyLinkedList();
        System.out.println("Is list empty before add? -> "+list.isEmpty());
        list.addToFront(new Employee("Jon", "Chiu", id++));
        list.addToFront(new Employee("Joan", "Chiu", id++));
        list.addToFront(new Employee("Faith Raine", "Chiu", id++));
        list.addToFront(new Employee("Yuan", "Chiu", id++));
        list.addToFront(new Employee("Azsy Bien", "Chiu", id++));

        list.printList();
        System.out.println("List size: " + list.getSize());

        list.removeFromFront();
        list.printList();
        System.out.println("List size: " + list.getSize());
    }
}
