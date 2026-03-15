package com.gla.objectandclass.level_2;

//Program to Simulate Student Report
//Problem Statement: Create a Student class with attributes name, rollNumber, and
//        marks. Add two methods:
//        ● To calculate the grade based on the marks.
//        ● To display the student's details and grade.
//Explanation: The Student class organizes all relevant details about a student as
//        attributes. Methods are used to calculate the grade and provide a way to display all
//information.

public class Student {
    private String name;
    private int    rollNumber;
    private double marks; // out of 100

    public Student(String name, int rollNumber, double marks) {
        this.name       = name;
        this.rollNumber = rollNumber;
        this.marks      = marks;
    }

    public String getName()        { return name; }
    public int    getRollNumber()  { return rollNumber; }
    public double getMarks()       { return marks; }
    public void   setMarks(double marks) { this.marks = marks; }

    public String calculateGrade() {
        if (marks >= 90)      return "A+ (Outstanding)";
        else if (marks >= 80) return "A  (Excellent)";
        else if (marks >= 70) return "B  (Good)";
        else if (marks >= 60) return "C  (Average)";
        else if (marks >= 50) return "D  (Below Average)";
        else                  return "F  (Fail)";
    }

    public void displayDetails() {
        System.out.println("Student Report:");
        System.out.println("  Name        : " + name);
        System.out.println("  Roll Number : " + rollNumber);
        System.out.printf ("  Marks       : %.1f / 100%n", marks);
        System.out.println("  Grade       : " + calculateGrade());
    }

    public static void main(String[] args) {
        Student s1 = new Student("Aarav Singh",  1, 92.5);
        Student s2 = new Student("Neha Gupta",   2, 75.0);
        Student s3 = new Student("Karan Verma",  3, 45.0);
        Student s4 = new Student("Simran Kaur",  4, 88.0);

        System.out.println("=== Student 1 ===");
        s1.displayDetails();

        System.out.println("\n=== Student 2 ===");
        s2.displayDetails();

        System.out.println("\n=== Student 3 ===");
        s3.displayDetails();

        System.out.println("\n=== Student 4 ===");
        s4.displayDetails();
    }
}
