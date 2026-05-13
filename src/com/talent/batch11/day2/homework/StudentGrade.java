package com.talent.batch11.day2.homework;

import java.util.Scanner;

public class StudentGrade {
    public static int getValidMark(Scanner sc, int subjectNumber) {
        int mark;
        while (true) {
            System.out.print("Enter Subject " + subjectNumber + " marks (0-100): ");
            mark = sc.nextInt();
            if (mark >= 0 && mark <= 100) {
                return mark;
            } else {
                System.out.println("Invalid mark! Please enter between 0 and 100.");
            }
        }
    }
    public static double calculateAverage(int totalMarks, int subjects) {
        return (double) totalMarks / subjects;
    }
    public static void printGrade(double avgMarks) {
        if (avgMarks >= 90) {
            System.out.println("Grade A");
        } else if (avgMarks >= 80) {
            System.out.println("Grade B");
        } else if (avgMarks >= 70) {
            System.out.println("Grade C");
        } else if (avgMarks >= 60) {
            System.out.println("Grade D");
        } else {
            System.out.println("Grade F");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many subjects do you have? ");
        int subjects = sc.nextInt();
        int totalMarks = 0;
        for (int i = 1; i <= subjects; i++) {
            totalMarks += getValidMark(sc, i);
        }
        double avgMarks = calculateAverage(totalMarks, subjects);
        System.out.println("Average Mark: " + avgMarks);
        printGrade(avgMarks);

        sc.close();
    }
}