package com.talent.batch11.day7.homework;

import java.util.LinkedList;

public class LinkedList_hw {
    public static void main(String[] args) {
        LinkedList<String> peopleList = new LinkedList<>();

        peopleList.add("John");
        peopleList.add("Mary");
        peopleList.add("David");
        peopleList.add("Lily");
        peopleList.add("James");

        System.out.println(peopleList);

        peopleList.removeFirst();
        System.out.println("After first person removed: "+peopleList);

        peopleList.addLast("Sophia");
        System.out.println("After added last person : "+peopleList);

        System.out.println("Current number of people waiting: " + peopleList.size());
    }
}