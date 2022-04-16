package com.jon.learning.udemy.stack;

public class Main {
    public static void main(String[] args) {
        ArrayStack<String> aStack = new ArrayStack<>();
        aStack.push("Jon");
        aStack.push("Joan");
        aStack.push("Faith");
        aStack.push("Yuan");
        System.out.println(aStack.peek());
        aStack.pop();
        System.out.println(aStack.peek());
        aStack.pop();
        System.out.println(aStack.peek());
        aStack.push("Azsy");
        System.out.println(aStack.peek());
        aStack.pop();
        System.out.println(aStack.peek());
        aStack.pop();
        System.out.println(aStack.peek());
        aStack.pop();
        System.out.println(aStack.peek());
    }
}
