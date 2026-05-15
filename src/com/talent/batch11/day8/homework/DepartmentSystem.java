package com.talent.batch11.day8.homework;

import java.util.*;

public class DepartmentSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> studentName = new ArrayList<>();

        Map<String,Set<String>> department = new HashMap<>();

        System.out.println("How many students: ");
        int count = sc.nextInt();
        sc.nextLine();

        for (int i=0;i<count;i++){
            System.out.println("Enter student name: ");
            String name = sc.nextLine();
            studentName.add(name);

        Set<String> subjects = new HashSet<>();
            System.out.println("How many subject: ");
            int n = sc.nextInt();
            sc.nextLine();
            for (int j = 0;j<n;j++){
                System.out.println("Enter subject: ");
                String subjectName = sc.nextLine();
                subjects.add(subjectName);
            }
            department.put(name,subjects);
        }
        System.out.println("Students and Subjects List: ");
        for (String name: department.keySet()){
            System.out.println(name+"->"+department.get(name));
        }

        System.out.println("Enter student name to add subject: ");
        String student = sc.nextLine();
        if (!department.containsKey(student)){
            System.out.println("Student not found!");
            return;
        }
        System.out.println("Enter subject: ");
        String newSubject = sc.nextLine();
        department.get(student).add(newSubject);

        System.out.println("Update student list after added new subjects: ");
        for (String name : department.keySet()){
            System.out.println(name + "->"+department.get(name));
        }

        System.out.println("Enter student name to remove subject: ");
        String studentRemove = sc.nextLine();
        if (department.containsKey(studentRemove)) {
            System.out.print("Enter subject to remove: ");
            String removeSubject = sc.nextLine();

            if (department.get(studentRemove).contains(removeSubject)) {
                department.get(studentRemove).remove(removeSubject);
                System.out.println("Removed successfully!");
            } else {
                System.out.println("Subject not found!");
            }
        } else {
            System.out.println("Student not found!");
        }

        System.out.println("Update student list after remove subjects: ");
        for (String name : department.keySet()){
            System.out.println(name + "->"+ department.get(name));
        }

        Set<String> allSubjects = new HashSet<>();
        for (Set<String> set : department.values()) {
            allSubjects.addAll(set);
        }

        System.out.println("\nAll Unique Subjects: " + allSubjects);
    }
}