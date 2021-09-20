package com.jon.learning.list;

import com.jon.learning.model.Employee;

public class MainDoubly {
    public static void main(String[] args) {
        int id = 1;
        Employee jon = new Employee("Jon", "Chiu", id++);
        Employee joan = new Employee("Joan", "Chiu", id++);
        Employee faith = new Employee("Faith Raine", "Chiu", id++);
        Employee yuan = new Employee("Yuan", "Chiu", id++);
        Employee azsy = new Employee("Azsy Bien", "Chiu", id++);
        Employee jan = new Employee("Jan", "Uary", id++);
        Employee someone = new Employee("One", "Some", id++);

        EmployeeDoublyLinkedList list = new EmployeeDoublyLinkedList();
        System.out.println("Is list empty before add? -> "+list.isEmpty());
        list.addToFront(jon);
        list.addToFront(joan);
        list.addToFront(faith);
        list.addToFront(yuan);
        list.addToBack(azsy);

        list.printList();
        System.out.println("List size: " + list.size());

        list.removeFront();
        list.printList();
        System.out.println("List size: " + list.size());

        list.addBefore(jan, azsy);
        list.printList();
        System.out.println("List size: " + list.size());

        list.addBefore(someone, faith);
        list.printList();
        System.out.println("List size: " + list.size());
    }
}
