package com.gla.objectandclass;

//Program to Track Inventory of Items
//Problem Statement: Create an Item class with attributes itemCode, itemName, and
//        price. Add a method to display item details and calculate the total cost for a given
//quantity.

public class Item {
    private int    itemCode;
    private String itemName;
    private double price;

    public Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price    = price;
    }

    public int    getItemCode() { return itemCode; }
    public String getItemName() { return itemName; }
    public double getPrice()    { return price; }

    public void setPrice(double price) { this.price = price; }

    public void displayDetails() {
        System.out.println("Item Details:");
        System.out.println("  Item Code : " + itemCode);
        System.out.println("  Item Name : " + itemName);
        System.out.printf ("  Price     : Rs. %.2f%n", price);
    }

    public double calculateTotalCost(int quantity) {
        return price * quantity;
    }

    public static void main(String[] args) {
        Item item1 = new Item(1001, "Laptop",     75000.00);
        Item item2 = new Item(1002, "Headphones",  2500.00);
        Item item3 = new Item(1003, "Mouse",        800.00);

        System.out.println("=== Item 1 ===");
        item1.displayDetails();
        int qty1 = 3;
        System.out.printf("  Total Cost for %d units: Rs. %.2f%n%n", qty1, item1.calculateTotalCost(qty1));

        System.out.println("=== Item 2 ===");
        item2.displayDetails();
        int qty2 = 5;
        System.out.printf("  Total Cost for %d units: Rs. %.2f%n%n", qty2, item2.calculateTotalCost(qty2));

        System.out.println("=== Item 3 ===");
        item3.displayDetails();
        int qty3 = 10;
        System.out.printf("  Total Cost for %d units: Rs. %.2f%n", qty3, item3.calculateTotalCost(qty3));
    }
}
