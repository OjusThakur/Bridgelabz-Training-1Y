package com.gla.String.level_3;

import java.util.Scanner;
public class Frequency {
    public static char[] uniqueCharacters(String str) {
        char[] temp = new char[str.length()];
        int index = 0;

        for (int i = 0; i < str.length(); i++) {
            boolean unique = true;

            for (int j = 0; j < i; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    unique = false;
                    break;
                }
            }

            if (unique) {
                temp[index++] = str.charAt(i);
            }
        }

        char[] result = new char[index];
        for (int i = 0; i < index; i++)
            result[i] = temp[i];

        return result;
    }

    public static void frequency(String str) {

        char[] unique = uniqueCharacters(str);

        for (int i = 0; i < unique.length; i++) {

            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                if (unique[i] == str.charAt(j))
                    count++;
            }

            System.out.println(unique[i] + " : " + count);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.next();

        frequency(text);
    }
}
