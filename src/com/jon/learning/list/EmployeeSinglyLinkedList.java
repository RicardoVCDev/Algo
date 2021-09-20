package com.jon.learning.list;

import com.jon.learning.model.Employee;

public class EmployeeSinglyLinkedList {
    private EmployeeSinglyNode head;
    private int count;

    public void addToFront(Employee employee) {
        EmployeeSinglyNode next = head;
        head = new EmployeeSinglyNode(employee);
        head.setNext(next);

//        EmployeeSinglyNode node = new EmployeeSinglyNode(employee);
//        node.setNext(head);
//        head = node;

        count++;
    }

    public EmployeeSinglyNode removeFromFront() {
        if (isEmpty()) return null;

        EmployeeSinglyNode node = head;
        head = node.getNext();
        count--;

        return node;
    }

    public void  printList() {
        System.out.print("Head -> ");
        EmployeeSinglyNode node = head;
        while (node != null) {
            System.out.print(node.getEmployee());
            node = node.getNext();
            System.out.print(" -> ");
        }
        System.out.println("null");
    }

    public int getSize (){
        return count;
    }

    public boolean isEmpty() {
        return head == null;
    }
}
