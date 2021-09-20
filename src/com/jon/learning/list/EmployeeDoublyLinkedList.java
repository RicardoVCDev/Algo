package com.jon.learning.list;

import com.jon.learning.model.Employee;

import java.util.NoSuchElementException;

public class EmployeeDoublyLinkedList {
    private EmployeeDoublyNode head;
    private EmployeeDoublyNode tail;
    private int size;

    public void addToFront(Employee employee) {
        EmployeeDoublyNode node = new EmployeeDoublyNode(employee);
        node.setNext(head);
        if (head != null) {
            head.setPrevious(node);
        } else {
            tail = node;
        }
        head = node;
        size++;
    }

    public void addToBack(Employee employee) {
        EmployeeDoublyNode node = new EmployeeDoublyNode(employee);
        if (tail != null) {
            node.setPrevious(tail);
            tail.setNext(node);
        } else {
            head = node;
        }
        tail = node;
        size++;
    }

    public EmployeeDoublyNode removeFront() {
        if (isEmpty()) return null;
        EmployeeDoublyNode node = head;
        head = head.getNext();
        head.setPrevious(null);
        size--;
        if (size() == 1) tail = head;

        return node;
    }

    public EmployeeDoublyNode removeBack() {
        if (isEmpty()) return null;
        EmployeeDoublyNode node = tail;
        tail = tail.getPrevious();
        tail.setPrevious(null);
        size--;
        if (size() == 1) tail = head;

        return node;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public void printList() {
        EmployeeDoublyNode node = head;
        System.out.print("Head -> ");
        while (node != null) {
            System.out.print(node.getEmployee()+" <-> ");
            node = node.getNext();
        }
        System.out.println("null");
    }

    public boolean addBefore(Employee newEmployee, Employee next) {
        if (head == null) return false;

        EmployeeDoublyNode emp = head;
        while (!emp.getEmployee().equals(next)) {
            emp = emp.getNext();
            if (emp ==null) return false;
        }

        EmployeeDoublyNode newNode = new EmployeeDoublyNode(newEmployee);
        newNode.setPrevious(emp.getPrevious());
        newNode.setNext(emp);
        if (emp != head) {
            emp.getPrevious().setNext(newNode);
        } else {
            head = newNode;
        }
        emp.setPrevious(newNode);
        size++;

        return true;
    }
}
