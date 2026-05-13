package com.talent.batch11.day6.homework.homework6_1;

public class PersonDemo {
    public static void main(String[] args) {
        Person[] person1 = {new Student("Mary", 12, 6),
                new Teacher("Lily", 29, "Mathematics"),
                new Student("John", 10, 5),
                new Teacher("David", 28, "History")};

        for (Person person : person1) {
            System.out.println("Role: " + person.getRole());
            person.introduce();
            System.out.println("-------------------");
        }
    }
}
