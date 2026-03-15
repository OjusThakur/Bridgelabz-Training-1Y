package com.gla.objectandclass.level_2;

//Program to Simulate a Shopping Cart
//Problem Statement: Create a CartItem class with attributes itemName, price, and
//        quantity. Add methods to:
//        ● Add an item to the cart.
//        ● Remove an item from the cart.
//        ● Display the total cost.
//Explanation: The CartItem class models a shopping cart item. The methods handle
//cart operations like adding or removing items and calculating the total cost.

public class CartItem {
    private String itemName;
    private double price;
    private int    quantity;

    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price    = price;
        this.quantity = quantity;
    }

    public String getItemName() { return itemName; }
    public double getPrice()    { return price; }
    public int    getQuantity() { return quantity; }

    public void setPrice(double price)    { this.price    = price; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    public void addItem(int quantityToAdd) {
        if (quantityToAdd <= 0) {
            System.out.println("  Invalid quantity to add.");
            return;
        }
        this.quantity += quantityToAdd;
        System.out.println("  Added " + quantityToAdd + " unit(s) of \"" + itemName
                + "\". New quantity: " + this.quantity);
    }

    public void removeItem(int quantityToRemove) {
        if (quantityToRemove <= 0) {
            System.out.println("  Invalid quantity to remove.");
            return;
        }
        if (quantityToRemove > this.quantity) {
            System.out.println("  Cannot remove " + quantityToRemove
                    + " unit(s). Only " + this.quantity + " available.");
            return;
        }
        this.quantity -= quantityToRemove;
        System.out.println("  Removed " + quantityToRemove + " unit(s) of \"" + itemName
                + "\". New quantity: " + this.quantity);
    }

    public double calculateTotalCost() {
        return price * quantity;
    }

    public void displayItem() {
        System.out.printf("  %-15s | Rs. %7.2f | Qty: %3d | Total: Rs. %8.2f%n",
                itemName, price, quantity, calculateTotalCost());
    }

    public static void main(String[] args) {
        CartItem item1 = new CartItem("Notebook",   150.00, 2);
        CartItem item2 = new CartItem("Pen Set",     80.00, 3);
        CartItem item3 = new CartItem("Backpack",  1200.00, 1);

        System.out.println("=== Shopping Cart Simulation ===\n");

        System.out.println("--- Initial Cart ---");
        System.out.printf("  %-15s | %-10s | %-8s | %s%n", "Item", "Price", "Qty", "Total Cost");
        System.out.println("  -------------------------------------------------------");
        item1.displayItem();
        item2.displayItem();
        item3.displayItem();

        System.out.println("\n--- Adding Items ---");
        item1.addItem(3);    // Add 3 more notebooks
        item2.addItem(2);    // Add 2 more pen sets

        System.out.println("\n--- Removing Items ---");
        item3.removeItem(1); // Remove the backpack
        item2.removeItem(10); // Try to remove more than available

        System.out.println("\n--- Updated Cart ---");
        System.out.printf("  %-15s | %-10s | %-8s | %s%n", "Item", "Price", "Qty", "Total Cost");
        System.out.println("  -------------------------------------------------------");
        item1.displayItem();
        item2.displayItem();
        item3.displayItem();

        double grandTotal = item1.calculateTotalCost()
                + item2.calculateTotalCost()
                + item3.calculateTotalCost();
        System.out.println("  -------------------------------------------------------");
        System.out.printf("  %-40s Total: Rs. %8.2f%n", "GRAND TOTAL", grandTotal);
    }
}
