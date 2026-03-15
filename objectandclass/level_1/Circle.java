package com.gla.objectandclass;

//Program to Compute Area of a Circle
//Problem Statement: Write a program to create a Circle class with an attribute
//        radius. Add methods to calculate and display the area and circumference of the circle.

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius()          { return radius; }
    public void   setRadius(double r)  { this.radius = r; }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    public void displayDetails() {
        System.out.println("Circle Details:");
        System.out.printf ("  Radius          : %.2f units%n", radius);
        System.out.printf ("  Area            : %.4f sq. units%n", calculateArea());
        System.out.printf ("  Circumference   : %.4f units%n",    calculateCircumference());
    }

    public static void main(String[] args) {
        Circle c1 = new Circle(7.0);
        Circle c2 = new Circle(3.5);

        System.out.println("=== Circle 1 ===");
        c1.displayDetails();

        System.out.println("\n=== Circle 2 ===");
        c2.displayDetails();
    }
}
