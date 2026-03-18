package com.gla.String.level_2;

import java.util.Scanner;
public class Word {
    public static void findWords(String[] words) {

        String shortest = words[0];
        String longest = words[0];

        for (int i = 1; i < words.length; i++) {

            if (words[i].length() < shortest.length())
                shortest = words[i];

            if (words[i].length() > longest.length())
                longest = words[i];
        }

        System.out.println("Shortest word: " + shortest);
        System.out.println("Longest word: " + longest);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter sentence: ");
        String text = sc.nextLine();

        String[] words = text.split(" ");

        findWords(words);
    }
}
