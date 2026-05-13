package com.talent.batch11.day3.homework;

import java.util.Scanner;

public class Homework3 {

        public static void printTable(int number, int row) {
            if (row > 50) {
                System.out.println("Row limit must be under 50.");
                return;
            }

            for (int i = 1; i <= row; i++) {
                System.out.println(number + " x " + i + " = " + (number * i));
            }
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int number = sc.nextInt();
            System.out.print("Enter number of rows (under 50): ");
            int row = sc.nextInt();
            printTable(number, row);
            sc.close();
        }
    }

