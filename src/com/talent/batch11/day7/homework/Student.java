package com.talent.batch11.day7.homework;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {

    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name;
    }

    public static void searchStudent(ArrayList<Student> students, Scanner sc) {
        System.out.print("Enter student name to search: ");
        String searchName = sc.nextLine();
        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(searchName)) {
                System.out.println("Found: " + student);
                return;
            }
        }
        System.out.println("Student not found.");
    }
    public static void deleteStudent(ArrayList<Student> students, Scanner sc) {
        System.out.print("Enter student Id to delete: ");
        int deleteId = sc.nextInt();
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == deleteId) {
                students.remove(i);
                System.out.println("Student removed.");
                return;
            }
        }
        System.out.println("Student ID not found.");
    }
    public static void countStudents(ArrayList<Student> students) {
        System.out.println("Total students: " + students.size());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(1, "John"));
        students.add(new Student(2, "Mary"));
        students.add(new Student(3, "Lily"));
        students.add(new Student(4, "David"));
        students.add(new Student(5, "Jane"));

        System.out.println("Student List:");
        for (Student student :students){
            System.out.println(student);
        }

        searchStudent(students,sc);
        deleteStudent(students,sc);
        System.out.println("\nUpdated Student List:");
        for (Student student : students) {
            System.out.println(student);
        }
        countStudents(students);
    }
}