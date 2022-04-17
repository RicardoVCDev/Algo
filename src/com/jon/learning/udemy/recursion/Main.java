package com.jon.learning.udemy.recursion;

public class Main {
    public static void main(String[] args) {
        Recursive recursive = new Recursive();
        int factorial = recursive.findFactorial(5);
        System.out.println("Factorial of 5 is "+factorial);
        factorial = recursive.findFactorialIter(5);
        System.out.println("Factorial (iter) of 5 is "+factorial);

        int index = 17;
        int fib = recursive.fibonacci(index);
        System.out.println("Fibonacci at index "+index+" is: "+fib);
        fib = recursive.fibIter(index);
        System.out.println("Fib Iter at index "+index+" is: "+fib);
    }
}
