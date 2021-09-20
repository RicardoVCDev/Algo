package com.jon.learning.list;

public class IntegerSinglyNode {
    private int intVal;
    private IntegerSinglyNode next;

    public IntegerSinglyNode(int intVal) {
        this.intVal = intVal;
    }

    public int getInteger() {
        return intVal;
    }

    public void setInteger(int intVal) {
        this.intVal = intVal;
    }

    public IntegerSinglyNode getNext() {
        return next;
    }

    public void setNext(IntegerSinglyNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return String.valueOf(this.intVal);
    }
}
