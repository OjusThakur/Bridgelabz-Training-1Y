package com.gla.objectandclass;

//Program to Display Employee Details
//Problem Statement: Write a program to create an Employee class with attributes
//        name, id, and salary. Add a method to display the details.

public class Emplyee {
    private String name;
    private int id;
    private double salary;

    public Emplyee(String name, int id, double salary) {
        this.name   = name;
        this.id     = id;
        this.salary = salary;
    }

    public String getName()   { return name; }
    public int    getId()     { return id; }
    public double getSalary() { return salary; }

    public void setName(String name)     { this.name   = name; }
    public void setId(int id)            { this.id     = id; }
    public void setSalary(double salary) { this.salary = salary; }

    public void displayDetails() {
        System.out.println("Employee Details:");
        System.out.println("  Name   : " + name);
        System.out.println("  ID     : " + id);
        System.out.printf ("  Salary : Rs. %.2f%n", salary);
    }

    public static void main(String[] args) {
        Emplyee emp1 = new Emplyee("Rahul Sharma", 101, 75000.00);
        Emplyee emp2 = new Emplyee("Priya Mehta",  102, 92000.50);

        System.out.println("=== Employee 1 ===");
        emp1.displayDetails();

        System.out.println("\n=== Employee 2 ===");
        emp2.displayDetails();

        // Update salary using setter
        emp1.setSalary(80000.00);
        System.out.println("\n=== After Salary Update ===");
        emp1.displayDetails();
    }


}
