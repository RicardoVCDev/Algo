package com.jon.learning.udemy.reverse;

public class EndsToMid {
    public static void main(String[] args) {
        String s = "ricardo v chiu jr.";

        s.toCharArray();
        System.out.println(reverse(s));
    }

    private static String reverse(String s) {
        //switch first and last chars
        //move up index start and move down index end then switch them
        //repeat while index start is lesser than index end
        char[] chars = new char[s.length()];
        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            char temp = s.charAt(end);
            chars[end] = s.charAt(start);
            chars[start] = temp;
            start++;
            end--;
        }

        return String.valueOf(chars);
    }
}
