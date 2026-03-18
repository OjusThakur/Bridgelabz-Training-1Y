package com.gla.String;

import java.util.Scanner;
public class LowerCase {
    public static String convertLower(String text) {

        String result = "";

        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32);
            }

            result += ch;
        }

        return result;
    }

    public static boolean compareStrings(String a, String b) {

        if (a.length() != b.length())
            return false;

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i))
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String user = convertLower(text);
        String builtin = text.toLowerCase();

        boolean result = compareStrings(user, builtin);

        System.out.println("User Lowercase: " + user);
        System.out.println("Built-in Lowercase: " + builtin);
        System.out.println("Are same? " + result);
    }
}
