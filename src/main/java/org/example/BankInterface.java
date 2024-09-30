package org.example;

import java.util.Scanner;

public class BankInterface {
    private Scanner scanner = new Scanner(System.in); // allows user input

    // Method to display the menu that user can use
    // account is of type bank so can access all its methods
    // initially i got confused and instantiated amount as an object
    public void showMenu(Bank account) {
        int choice;
        // do while statement
        // The difference between do-while and while is that do-while evaluates its expression at the bottom of the loop instead of the top.
        // Hence, the statements within the do block are always executed at least once
        do {
            System.out.println("\nBank Account Menu:");
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Deposit
                    System.out.print("Enter the amount to deposit: £");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    // Withdraw
                    System.out.print("Enter the amount to withdraw: £");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    // Check balance
                    System.out.println("Current balance: £" + account.getBalance());
                    break;
                case 4:
                    // Exit
                    System.out.println("Bye for now");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (choice != 4);
        // if option for selected break the loop
    }
}
