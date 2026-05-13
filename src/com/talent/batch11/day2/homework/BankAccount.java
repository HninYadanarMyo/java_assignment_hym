package com.talent.batch11.day2.homework;

import java.util.Scanner;

public class BankAccount {

    public static double deposit(double balance, Scanner sc) {
        System.out.print("Enter Deposit amount: ");
        double depositAmount = sc.nextDouble();

        if (depositAmount > 0) {
            balance += depositAmount;
            System.out.println("Deposit Successful");
            System.out.println("Updated Balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount");
        }
        return balance;
    }
    public static double withdraw(double balance, Scanner sc) {
        System.out.print("Enter Withdraw amount: ");
        double withdrawAmount = sc.nextDouble();
        if (withdrawAmount > balance) {
            System.out.println("Insufficient balance! Withdraw failed");
        } else if (withdrawAmount > 0) {
            balance -= withdrawAmount;
            System.out.println("Withdraw Successful");
            System.out.println("Updated Balance: " + balance);
        } else {
            System.out.println("Invalid withdraw amount");
        }
        return balance;
    }
    public static void showBalance(double balance) {
        System.out.println("Current Balance: " + balance);
    }
    public static void showMenu() {
        System.out.println("\n===== Bank Menu =====");
        System.out.println("1. Deposit Balance");
        System.out.println("2. Withdraw Balance");
        System.out.println("3. Current Balance");
        System.out.println("4. Exit");
        System.out.print("Choose an option: ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter initial Balance: ");
        double balance = sc.nextDouble();

        int choice;

        do {
            showMenu();
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    balance = deposit(balance, sc);
                    break;

                case 2:
                    balance = withdraw(balance, sc);
                    break;

                case 3:
                    showBalance(balance);
                    break;

                case 4:
                    System.out.println("Thank you");
                    break;

                default:
                    System.out.println("Invalid Option! Please choose between 1-4");
            }

        } while (choice != 4);

        sc.close();
    }
}