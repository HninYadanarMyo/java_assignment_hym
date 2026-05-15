package com.talent.batch11.day7.homework;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedList_hw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> peopleList = new LinkedList<>();
        for (int i = 0;i<5;i++){
            System.out.print("Enter person name from waiting room: ");
            String name = sc.nextLine();
            peopleList.add(name);
        }
        System.out.println("All people list in waiting room: "+peopleList);

        System.out.print("Press enter to remove first person:");
        sc.nextLine();
        if (!peopleList.isEmpty()) {
            String removedPerson = peopleList.removeFirst();
            System.out.println(removedPerson + " is removed successfully");
        } else {
            System.out.println("List is empty, can't remove");
        }

        System.out.print("Enter name to add person: ");
        String addName = sc.nextLine();
        peopleList.addLast(addName);
        System.out.println("After added last person : "+peopleList);

        System.out.println("Current number of people waiting: " + peopleList.size());
    }
}