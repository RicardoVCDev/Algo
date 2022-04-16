package com.jon.learning.udemy.stack;

public class ArrayStack<T> {
    int capacity = 10;
    Object arr[] = new Object[capacity];
    int size;

    public T peek() {
        if (size < 1) return null;
        return (T)arr[size-1];
    }

    public void push(T value) {
        arr[size++] = value;
    }

    public T pop(){
        T temp = peek();
        if (temp != null) arr[--size] = null;
        return temp;
    }
}
