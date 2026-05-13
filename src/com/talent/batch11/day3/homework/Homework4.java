package com.talent.batch11.day3.homework;

import java.util.Scanner;

public class Homework4 {

    public static int countVowels(String input) {
        int count = 0;
        input = input.toLowerCase();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        int vowelCount = countVowels(text);
        System.out.println("Number of vowels: " + vowelCount);
        sc.close();
    }
}
