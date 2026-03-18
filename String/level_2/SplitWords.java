package com.gla.String.level_2;

import java.util.Scanner;
public class SplitWords {
    public static String[] splitText(String text) {

        int words = 1;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ')
                words++;
        }

        String[] arr = new String[words];
        int index = 0;
        String word = "";

        for (int i = 0; i < text.length(); i++) {

            if (text.charAt(i) == ' ') {
                arr[index++] = word;
                word = "";
            } else {
                word += text.charAt(i);
            }
        }

        arr[index] = word;
        return arr;
    }

    public static boolean compareArrays(String[] a, String[] b) {

        if (a.length != b.length)
            return false;

        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i]))
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter sentence: ");
        String text = sc.nextLine();

        String[] arr1 = splitText(text);
        String[] arr2 = text.split(" ");

        System.out.println("Arrays equal: " + compareArrays(arr1, arr2));
    }
}
