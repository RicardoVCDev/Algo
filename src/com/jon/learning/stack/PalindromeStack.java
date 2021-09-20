package com.jon.learning.stack;

import java.util.LinkedList;
import java.util.List;

public class PalindromeStack {
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
        LinkedList<Character> stack = new LinkedList<>();
        char[] chars = string.toLowerCase().toCharArray();
        StringBuilder clean = new StringBuilder(chars.length);
        for (int i=0; i < chars.length; i++) {
            if (chars[i] >= 'a' && chars[i] <= 'z') {
                clean.append(chars[i]);
                stack.push(chars[i]);
            }
        }

        StringBuilder reversed = new StringBuilder(stack.size());
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        return clean.toString().trim().equals(reversed.toString().trim());
    }
}
