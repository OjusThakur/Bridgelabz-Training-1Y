package com.gla.String.level_2;

import java.util.Scanner;
public class WordLength {
    public static String[][] wordLength(String[] words) {

        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(words[i].length());
        }

        return result;
    }

    public static void display(String[][] data) {

        System.out.println("Word\tLength");

        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t" + Integer.parseInt(data[i][1]));
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter sentence: ");
        String text = sc.nextLine();

        String[] words = text.split(" ");
        String[][] result = wordLength(words);

        display(result);
    }
}
