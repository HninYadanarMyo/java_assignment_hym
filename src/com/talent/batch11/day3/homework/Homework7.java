package com.talent.batch11.day3.homework;
import java.util.Scanner;

public class Homework7 {
    public static int countLetters(String input) {
        int letters = 0;
        for (int i = 0; i < input.length(); i++) {
            if (Character.isLetter(input.charAt(i))) {
                letters++;
            }
        }
        return letters;
    }
    public static int countDigits(String input) {
        int digits = 0;
        for (int i = 0; i < input.length(); i++) {
            if (Character.isDigit(input.charAt(i))) {
                digits++;
            }
        }
        return digits;
    }
    public static int countSpecialCharacters(String input) {
        int specialChars = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (!Character.isLetter(ch) && !Character.isDigit(ch) && !Character.isWhitespace(ch)) {
                specialChars++;
            }
        }
        return specialChars;
    }
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a string: ");
            String input = sc.nextLine();

            System.out.println("Letters: " + countLetters(input));
            System.out.println("Digits: " + countDigits(input));
            System.out.println("Special Characters: " + countSpecialCharacters(input));

            sc.close();
        }
    }
