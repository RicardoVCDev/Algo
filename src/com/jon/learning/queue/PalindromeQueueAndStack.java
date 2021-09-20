package com.jon.learning.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PalindromeQueueAndStack {
    public static void main(String[] args) {
        // should return true
        System.out.println(isPalindrome("abccba"));
        // should return true
        System.out.println(isPalindrome("Was it a car or a cat I saw?"));
        // should return true
        System.out.println(isPalindrome("I did, did I?"));
        // should return false
        System.out.println(isPalindrome("hello"));
        // should return true
        System.out.println(isPalindrome("Don't nod"));
    }

    public static boolean isPalindrome(String string) {
        LinkedList<Character> stack = new LinkedList<Character>();
        Queue<Character> queue = new LinkedList<>();
        char[] chars = string.toLowerCase().toCharArray();
        for (int i=0; i < chars.length; i++) {
            if (chars[i] >= 'a' && 'z' >= chars[i]) {
                stack.push(chars[i]);
                queue.add(chars[i]);
            }
        }

        while (!queue.isEmpty()) {
            if (!queue.remove().equals(stack.pop()))
                return false;
        }

        new StringBuilder().toString();
        return true;
    }
}
