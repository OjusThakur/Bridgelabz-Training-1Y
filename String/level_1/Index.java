package com.gla.String;

import java.util.Scanner;
public class Index {
    public static void generateException(String[] names) {
        System.out.println(names[names.length + 1]);
    }

    public static void handleException(String[] names) {

        try {
            System.out.println(names[names.length + 1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException handled");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException handled");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] names = new String[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter name: ");
            names[i] = sc.next();
        }

        // generateException(names);

        handleException(names);
    }
}
