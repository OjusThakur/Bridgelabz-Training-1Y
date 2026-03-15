package com.gla.objectandclass.level_2;

//Program to Simulate an ATM
//Problem Statement: Create a BankAccount class with attributes accountHolder,
//        accountNumber, and balance. Add methods for:
//        ● Depositing money.
//        ● Withdrawing money (only if sufficient balance exists).
//        ● Displaying the current balance.
//Explanation: The BankAccount class stores bank account details as attributes. The
//methods allow interaction with these attributes to modify and view the account's state.

public class BankAccount {
    private String accountHolder;
    private String accountNumber;
    private double balance;

    public BankAccount(String accountHolder, String accountNumber, double initialBalance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance       = initialBalance;
    }

    public String getAccountHolder() { return accountHolder; }
    public String getAccountNumber() { return accountNumber; }
    public double getBalance()       { return balance; }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("  Invalid deposit amount. Must be greater than 0.");
            return;
        }
        balance += amount;
        System.out.printf("  Deposited: Rs. %.2f | New Balance: Rs. %.2f%n", amount, balance);
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("  Invalid withdrawal amount.");
            return;
        }
        if (amount > balance) {
            System.out.println("  Insufficient balance! Available: Rs. " + balance);
            return;
        }
        balance -= amount;
        System.out.printf("  Withdrawn: Rs. %.2f | New Balance: Rs. %.2f%n", amount, balance);
    }

    public void displayBalance() {
        System.out.println("  Account Holder : " + accountHolder);
        System.out.println("  Account Number : " + accountNumber);
        System.out.printf ("  Current Balance: Rs. %.2f%n", balance);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("Rohit Patel", "SBI-007654321", 10000.00);

        System.out.println("=== ATM Simulation ===\n");

        System.out.println("--- Initial Balance ---");
        account.displayBalance();

        System.out.println("\n--- Depositing Rs. 5000 ---");
        account.deposit(5000);

        System.out.println("\n--- Withdrawing Rs. 3000 ---");
        account.withdraw(3000);

        System.out.println("\n--- Trying to withdraw Rs. 20000 (Insufficient) ---");
        account.withdraw(20000);

        System.out.println("\n--- Final Balance ---");
        account.displayBalance();
    }
}
