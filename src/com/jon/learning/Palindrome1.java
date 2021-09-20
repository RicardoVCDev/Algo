package com.jon.learning;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Palindrome1 {
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
        string = string.toLowerCase();
        char[] dirty = string.toCharArray();
        StringBuilder sb1 = new StringBuilder(dirty.length);
        int i;
        for (i=0; i < dirty.length; i++) {
            if (dirty[i] >= 'a' && dirty[i] <= 'z') {
                sb1.append(dirty[i]);
            }
        }
        char[] chars = sb1.toString().trim().toCharArray();
        int mid = chars.length / 2;
        StringBuilder sbLeft = new StringBuilder(mid);
        StringBuilder sbRight = new StringBuilder(mid);
        for (i=0; i < mid; i++) {
            if (chars[i] >= 'a' && chars[i] <= 'z') {
                sbLeft.append(chars[i]);
            }
        }
        if ((chars.length % 2) == 0) mid--;
        for (i=chars.length-1; i > mid; i--) {
            if (chars[i] >= 'a' && chars[i] <= 'z') {
                sbRight.append(chars[i]);
            }
        }

        return sbLeft.toString().trim().equals(sbRight.toString().trim());
    }
}
