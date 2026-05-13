package com.talent.batch11.day2.homework;

import java.util.Scanner;

public class CalculateBMI {

    public static double calculateBMI(double weight, double height) {
        return (weight / (height * height)) * 703;
    }
    public static String getBMICategory(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25) {
            return "Normal Weight";
        } else if (bmi < 30) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }
    public static void displayResult(double bmi, String category) {
        System.out.printf("Your BMI is: %.2f%n", bmi);
        System.out.println("Category: " + category);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your weight in pounds: ");
        double weight = sc.nextDouble();
        System.out.print("Enter your height in inches: ");
        double height = sc.nextDouble();
        double bmi = calculateBMI(weight, height);
        String category = getBMICategory(bmi);
        displayResult(bmi, category);
        sc.close();
    }
}