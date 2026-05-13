package com.talent.batch11.day1.homework;

import java.util.Scanner;

public class MyAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter birth year: ");
        int birthYear=sc.nextInt();
        int currentYear = 2026;
        int age = currentYear-birthYear;
        System.out.println("Your age is :"+age);
    }
}
