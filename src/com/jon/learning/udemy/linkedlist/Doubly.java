package com.jon.learning.udemy.linkedlist;

import com.jon.learning.udemy.Node;

import java.util.InputMismatchException;

/**
 * Linked list that knows it's previous and next node links
 */
public class Doubly<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;

    public Node<T> getHead() { return this.head; }

    public Node<T> getTail() { return this.tail; }

    public int getSize() { return this.size; }

    /**
     * Check if head is null. If yes, set the head and tail as value
     * Else, set current head's previous value as the input.
     * Then set input value a the new head
     * @param value
     */
    public void addFirst(T value) {
        throwNullInput(value);
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

    /**
     * Add the given value at the given index.
     * If the given value is null, throw exception.
     * If the list is empty or the given index is outside the size, throw exception.
     * Create a newNode out of the given value. Get the node (current) of the given index.
     * Set the newNode's previous node to be currentNode's previous node.
     * Set newNode's nextNode to be currentNode.
     * Set newNode's previousNode's nextNode to be newNode. Set currentNode's
     * previous node to be newNode.
     * Increment size, return current's value;
     * @param index the index where to insert the given value.
     * @param value value to insert in the in the given index.
     * @return the original value in the given index.
     */
    public T add(int index, T value) {
        throwNullInput(value);
        throwInvalidIndex(index);

        Node<T> newNode = new Node<>(value);
        Node<T> current = getNode(index);
        newNode.setPrevious(current.getPrevious());
        newNode.setNext(current);
        newNode.getPrevious().setNext(newNode);
        current.setPrevious(newNode);
        size++;

        return current.getValue();
    }

    /**
     * Add the given value at the end of the list.
     * Create newNode out of the input value.
     * If head is null, set head and tail as newNode and return null.
     * Set tail's next as newValue. Set tail as newValue. Increment size.
     * Return newNode's previous node's value.
     * @param value value to add at the end of the list.
     * @return the value of the previous tail of the list. Return null if the input is
     * is the only element in this list after this add operation.
     */
    public T add(T value) {
        Node<T> newNode = new Node<>(value);
        if (head==null) {
            head = newNode;
            tail = newNode;
            return null;
        }

        tail.setNext(newNode);
        tail = newNode;
        size++;
        return newNode.getPrevious().getValue();
    }

    /**
     * If tail is null, throw an exception
     * Set a temp variable as tail.
     * Set the current tail's next value as null
     * return temp
     * @return return the value of the previous tail that was removed
     */
    public T remove() {
        if (tail == null)
            throw new IndexOutOfBoundsException("List is empty");

        T ans = tail.getValue();
        if (tail.getPrevious() == null) {
            tail = null;
            head = null;
        } else {
            tail.getPrevious().setNext(null);
            tail = tail.getPrevious();
        }
        size--;
        return ans;
    }

    /**
     * Remove element at the given list.
     * If given index is outside the size, throw exception.
     * Create current as the node at the given index.
     * If current's previous node is null, return removeFirst().
     * If current's nextNode is null, return remove().
     * Set current's previous node's nextNode to be current's nextNode.
     * Set current's nextNode's previous node as current's previousNode.
     * Decrement size then return current's value.
     * @param index index of the element to be removed from the list.
     * @return the value of the input index.
     */
    public T remove(int index) {
        throwInvalidIndex(index);
        Node<T> current = getNode(index);
        if (current.getPrevious() == null) return removeFirst();
        if (current.getNext() == null) return remove();
        current.getPrevious().setNext(current.getNext());
        current.getNext().setPrevious(current.getPrevious());
        size--;

        return current.getValue();
    }

    /**
     * Remove the head element of the list.
     * If list is empty, throw exception.
     * Create ans as head's value. If head's nextNode is null,
     * then set head and tail as null.
     * Set head as head's nextNode.
     * Decrement size, then return ans.
     * @return the value of the head node before this operation. Throws exception
     * if the list is empty
     */
    public T removeFirst() {
        throwInvalidIndex(0);
        T ans = head.getValue();
        if (head.getNext()==null) {
            head = null;
            tail = null;
        } else {
            head = head.getNext();
        }

        size--;
        return ans;
    }

    public T get(int index) {
        return getNode(index).getValue();
    }

    /**
     * Get the index of the given value.
     * If list is empty, throw an exception.
     * Set temp as head. Loop through the nodes. If temp is null, exit loop.
     * If the node's value matches the input value, return the value of i.
     * If the loop ended, the value is not found then return -1.
     * @param value value of the index to get.
     * @return the index of the input value. If not found, return -1.
     */
    public int getIndex(T value) {
        throwInvalidIndex(0);

        Node<T> temp = head;
        for (int i=1; i < size; i++) {
            if (temp == null) break;
            if (temp.getValue().equals(value)) return i;
            temp = temp.getNext();
        }

        return -1;
    }

    /**
     * If head is null, throw an exception
     * Set ans as the head node.
     * Starting with index 1 (next node after head), set the ans as ans.next
     * up to point that index is equal to the given index.
     * Return the ans.
     * @param index index of the node to get
     * @return the node at the input index
     */
    private Node<T> getNode(int index) {
        throwInvalidIndex(index);

        Node<T> ans = head;
        for (int i=1; i <= index; i++) ans = ans.getNext();
        return ans;
    }

    /**
     * If head is null, throw an exception.
     * Loop through the nodes starting from the head.
     * If the value of the node matches the input value, return the node.
     * If execution reaches the end of the loop, the value is not found,
     * hence return null.
     * @param value value of the node to get.
     * @return node of the corresponding value. If the node is not found,
     * return null.
     */
    private Node<T> getNode(T value) {
        throwInvalidIndex(0);

        Node<T> ans = head;
        while (ans.getValue() != null) {
            if (ans.getValue().equals(value)) return ans;

            ans = ans.getNext();
        }

        return null;
    }

    private void throwInvalidIndex(int index) {
        String msg = "List is empty or given index is outside the size which is " + size;
        if (head==null || index >= size)
            throw new IndexOutOfBoundsException(msg);
    }

    private void throwNullInput(T value) {
        if (value == null) throw new InputMismatchException("null is not a valid input");
    }
}
