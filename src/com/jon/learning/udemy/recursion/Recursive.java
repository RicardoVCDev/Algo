package com.jon.learning.udemy.recursion;

public class Recursive {
    /**
     * Find the factorial of a given number
     * Set the base. If num == 1 return
     * Decrement num by 1, then call findFactorial again
     * @param num number to find the factorial of
     * @return the number of iteration.
     */
    public int findFactorial(int num) {
        if (num == 1) return num;
        return num * findFactorial(--num);
    }

    public int findFactorialIter(int num) {
        int temp = num;
        while (num > 1) {
            temp = temp * --num;
        }
        return temp;
    }

    /**
     * Find the fibonacci value at the given index n
     * Set base case. If n < 1 return n
     * return fibonacci(n-1) + fibonacci(n - 2)
     * @param n index of the fibonacci value to get
     * @return the value of the given index in the fibonacci sequence.
     */
    public int fibonacci(int n) {
        if (n < 2) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public int fibIter(int n) {
        int arr[] = new int[n+1];
        arr[0] = 0;
        arr[1] = 1;
        int temp;
        for (int i=2; i <= n; i++) {
            arr[i] = arr[i-2] + arr[i-1];
        }
        return arr[n];
    }
}
