package com.talent.batch11.day3.homework;

import java.util.Scanner;

public class Homework2 {
    public static int multiply(int num1,int num2){
        return (num1 * num2);
    }
    public static int multiply(int num1,int num2,int num3){
        return (num1 * num2 * num3);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number1 : ");
        int number1=sc.nextInt();
        System.out.print("Number2 : ");
        int number2=sc.nextInt();
        System.out.print("Number3 : ");
        int number3=sc.nextInt();
        int result = multiply(number1,number2);
        System.out.println("Multiple of two integers: "+result);
        int result1 = multiply(number1,number2,number3);
        System.out.println("Multiple of three integers: "+result1);
    }
}
