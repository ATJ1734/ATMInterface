//package com.atm;

import java.util.Scanner;

public class ATM {
    private static int balance = 1000;
    private static final int PIN = 1234;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your PIN: ");
        int enteredPin = scanner.nextInt();

        if (enteredPin != PIN) {
            System.out.println("Incorrect PIN. Access denied.");
            return;
        }

        while (true) {
            System.out.println("\nATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Your balance is: $" + balance);
                    break;
                case 2:
                    System.out.print("Enter deposit amount: ");
                    int deposit = scanner.nextInt();
                    if (deposit > 0) {
                        balance += deposit;
                        System.out.println("Deposited: $" + deposit);
                    } else {
                        System.out.println("Invalid deposit amount.");
                    }
                    break;
                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    int withdrawal = scanner.nextInt();
                    if (withdrawal > 0 && withdrawal <= balance) {
                        balance -= withdrawal;
                        System.out.println("Withdrew: $" + withdrawal);
                    } else {
                        System.out.println("Invalid withdrawal amount or insufficient funds.");
                    }
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}
