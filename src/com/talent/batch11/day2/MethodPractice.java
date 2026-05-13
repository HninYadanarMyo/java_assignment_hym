package com.talent.batch11.day2;

import java.time.LocalDateTime;

public class MethodPractice {
    public static void main(String[] args) {
        eat();
        sleep();
        int age = calculateAge(2000);
        System.out.println("I'm "+age+" years old");
    }
    static void eat(){
        System.out.println("I am Eating now");
    }
    static void sleep(){
        System.out.println("I am Sleeping now");
    }
    static void shopping(){
          System.out.println("I am Shopping now");
    }
    static void drinking(){
        System.out.println("I am Drinking now");
    }
    static void studying(){
        System.out.println("I am Studying now");
    }
    static int calculateAge(int birthYear){
        int currentYear = LocalDateTime.now().getYear();
        return currentYear-birthYear;
    }
}
