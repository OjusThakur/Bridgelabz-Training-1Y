package com.gla.String.level_3;

import java.util.Scanner;
public class Characters {
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }
        return count;
    }


    public static char[] uniqueChars(String str) {
        int len = findLength(str);
        char[] result = new char[len];
        int index = 0;

        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            boolean unique = true;

            for (int j = 0; j < i; j++) {
                if (ch == str.charAt(j)) {
                    unique = false;
                    break;
                }
            }

            if (unique) {
                result[index++] = ch;
            }
        }

        char[] finalArray = new char[index];
        for (int i = 0; i < index; i++) {
            finalArray[i] = result[i];
        }

        return finalArray;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.next();

        char[] unique = uniqueChars(text);

        System.out.print("Unique Characters: ");
        for (char c : unique) {
            System.out.print(c + " ");
        }
    }
}
