package com.talent.batch11.day8.homework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<String, Integer> students = new HashMap<>();

        System.out.print("How many students? ");
        int count = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < count; i++) {
            System.out.print("Enter student name: ");
            String name = sc.nextLine();

            System.out.print("Enter marks: ");
            int marks = sc.nextInt();
            sc.nextLine();

            students.put(name, marks);
        }

        System.out.println("\nStudent List:");
        for (Map.Entry<String, Integer> entry : students.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        String topStudent = "";
        int maxMarks = -1;

        for (Map.Entry<String, Integer> entry : students.entrySet()) {
            if (entry.getValue() > maxMarks) {
                maxMarks = entry.getValue();
                topStudent = entry.getKey();
            }
        }
        System.out.println("\nTop Student: " + topStudent + " = " + maxMarks);

        System.out.print("\nEnter student name to remove: ");
        String removeName = sc.nextLine();

        if (students.containsKey(removeName)) {
            students.remove(removeName);
            System.out.println(removeName + " removed successfully.");
        } else {
            System.out.println("Student not found.");
        }

        System.out.println("\nUpdated Students:");
        for (Map.Entry<String, Integer> entry : students.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        sc.close();
    }
}