package com.jon.learning.udemy;

public class Node<T> {
    T value;
    Node<T> next;
    Node<T> previous;

    public Node() {super();}

    public Node(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public boolean hasNext() {
        if (this.next==null) return false;
        return true;
    }

    public Node<T> getPrevious() {
        return this.previous;
    }

    public void setPrevious(Node<T> previous) {
        this.previous = previous;
    }

    public boolean hasPrevious(){
        if (this.previous==null) return false;
        return true;
    }
}
