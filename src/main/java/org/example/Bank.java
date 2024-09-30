package org.example;

public class Bank {
    // this is sensitive information hence must be kept private
    private double balance;

    // Constructor to initialize a bank account with a starting balance
    public Bank(double initialBalance) { // constructor with parameter to contain balance
        this.balance = initialBalance; // can now be used with methods in this class
    }

    // Method to deposit money
    // tried to initialise amount as a variable w/in bank constructor but didn't work
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited: £" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrew: £" + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }

    // Method to check the current balance
    public double getBalance() {
        return balance;
    }
}

