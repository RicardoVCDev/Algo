package com.jon.learning.list;

public class IntegerSinglyLinkedList {
    private IntegerSinglyNode head;
    private int count;

    public void addToFront(int intVal) {
        IntegerSinglyNode next = head;
        head = new IntegerSinglyNode(intVal);
        head.setNext(next);

//        IntegerSinglyNode node = new IntegerSinglyNode(intVal);
//        node.setNext(head);
//        head = node;

        count++;
    }

    public IntegerSinglyNode removeFromFront() {
        if (isEmpty()) return null;

        IntegerSinglyNode node = head;
        head = node.getNext();
        count--;

        return node;
    }

    public void printList() {
        System.out.print("Head -> ");
        IntegerSinglyNode node = head;
        while (node != null) {
            System.out.print(node.getInteger());
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

    public void insertSorted(int intVal) {
        IntegerSinglyNode newNode = new IntegerSinglyNode(intVal);
        if (head == null || head.getInteger() > intVal) {
            addToFront(intVal);
            return;
        }
        IntegerSinglyNode previous = head;
        IntegerSinglyNode current = head.getNext();
        while (current != null && current.getInteger() <= intVal) {
            previous = current;
            current = current.getNext();
        }
        newNode.setNext(current);
        previous.setNext(newNode);

        count++;
    }
}
