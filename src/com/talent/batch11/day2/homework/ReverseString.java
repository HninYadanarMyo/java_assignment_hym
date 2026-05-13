package com.talent.batch11.day2.homework;

import java.util.Scanner;

public class ReverseString {

   public static String reverseString(String input){
       String reversed="";
       for (int i = input.length()-1;i >= 0;i--){
           reversed += input.charAt(i);
       }
       return reversed;
   }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String input =sc.nextLine();
        String output = reverseString(input);
        System.out.println("Input: "+input);
        System.out.println("Output: "+output);
        sc.close();
    }
}


