package com.gla.String.level_3;

import java.util.Scanner;
public class Palindrome {
    public static boolean palindrome(String str) {

        int start = 0;
        int end = str.length() - 1;

        while (start < end) {

            if (str.charAt(start) != str.charAt(end))
                return false;

            start++;
            end--;
        }

        return true;
    }


    public static boolean palindromeRecursive(String str, int start, int end) {

        if (start >= end)
            return true;

        if (str.charAt(start) != str.charAt(end))
            return false;

        return palindromeRecursive(str, start + 1, end - 1);
    }


    public static String reverse(String str) {

        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }

        return rev;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.next();

        System.out.println("Logic 1: " + palindrome(text));
        System.out.println("Logic 2: " + palindromeRecursive(text, 0, text.length() - 1));
        System.out.println("Logic 3: " + text.equals(reverse(text)));
    }
}
