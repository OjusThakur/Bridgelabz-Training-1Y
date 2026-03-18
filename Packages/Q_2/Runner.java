package com.gla.Packages.Q_2;

public class Runner {
    public static void main(String[] args) {
        Course c = new Course(101, "Introduction to CSE", 4);

        System.out.println("Course Code: " + c.code);
        System.out.println("Course Title: " + c.title);
        System.out.println("Credits: " + c.credits);
    }
}
