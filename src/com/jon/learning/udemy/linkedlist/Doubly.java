package com.jon.learning.udemy.linkedlist;

import com.jon.learning.udemy.Node;

/**
 * Linked list that knows it's previous and next node links
 */
public class Doubly<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;

    /**
     * Check if head is null. If yes, set the head and tail as value
     * Else, set current head's previous value as the input.
     * Then set input value a the new head
     * @param value
     */
    public void addFirst(T value) {
        Node<T> inputNode = new Node<>(value);
        if (head==null) {
            head = inputNode;
            tail = inputNode;
        } else {
            head.setPrevious(inputNode);
            inputNode.setNext(head);
            head = inputNode;
        }
        if (size==1) tail.setPrevious(inputNode);
        size++;
    }

    public Node<T> getHead() { return this.head; }

    public Node<T> getTail() { return this.tail; }

    public T get(int index) {
        if (head==null)
            throw new IndexOutOfBoundsException("List is empty");

        Node<T> currentNode = head;
        for (int i=1; i < index; i++) currentNode = currentNode.getNext();
        return currentNode.getValue();
    }
}
