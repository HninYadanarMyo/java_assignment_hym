package com.talent.batch11.day1.homework;

import java.util.Scanner;

public class MyIcon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Symbol: ");
        String symbol = sc.next();
        System.out.print("Enter count number: ");
        int count = sc.nextInt();
        for (int i = 0;i<count;i++){
            System.out.println(symbol);
        }
    }
}
