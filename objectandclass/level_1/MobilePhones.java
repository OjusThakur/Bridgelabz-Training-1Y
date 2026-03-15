package com.gla.objectandclass;

//Program to Handle Mobile Phone Details
//Problem Statement: Create a MobilePhone class with attributes brand, model, and
//        price. Add a method to display all the details of the phone. The MobilePhone class
//uses attributes to store the phone's characteristics. The method is used to retrieve and
//display this information for each object.

public class MobilePhones {
    private String brand;
    private String model;
    private double price;

    public MobilePhones(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public String getBrand() { return brand; }
    public String getModel() { return model; }
    public double getPrice() { return price; }

    public void setBrand(String brand) { this.brand = brand; }
    public void setModel(String model) { this.model = model; }
    public void setPrice(double price) { this.price = price; }

    public void displayDetails() {
        System.out.println("Mobile Phone Details:");
        System.out.println("  Brand : " + brand);
        System.out.println("  Model : " + model);
        System.out.printf ("  Price : Rs. %.2f%n", price);
    }

    public static void main(String[] args) {
        MobilePhones phone1 = new MobilePhones("Samsung", "Galaxy S24",  85000.00);
        MobilePhones phone2 = new MobilePhones("Apple",   "iPhone 15",  110000.00);
        MobilePhones phone3 = new MobilePhones("OnePlus", "12 Pro",      65000.00);

        System.out.println("=== Phone 1 ===");
        phone1.displayDetails();

        System.out.println("\n=== Phone 2 ===");
        phone2.displayDetails();

        System.out.println("\n=== Phone 3 ===");
        phone3.displayDetails();
    }
}
