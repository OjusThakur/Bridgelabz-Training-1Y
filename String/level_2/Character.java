package com.gla.String.level_2;

import java.util.Scanner;
public class Character {
    public static String check(char ch) {

        if (ch >= 'A' && ch <= 'Z')
            ch += 32;

        if (ch >= 'a' && ch <= 'z') {

            if ("aeiou".indexOf(ch) != -1)
                return "Vowel";
            else
                return "Consonant";
        }

        return "Not Letter";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        System.out.println("Char\tType");

        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            System.out.println(ch + "\t" + check(ch));
        }
    }
}
