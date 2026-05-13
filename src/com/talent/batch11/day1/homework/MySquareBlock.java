package com.talent.batch11.day1.homework;

import java.util.Scanner;

public class MySquareBlock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char c = sc.next().charAt(0);
        System.out.print("Enter count number: ");
        int count = sc.nextInt();
        for (int i=0;i<count;i++){
            for (int j=0;j<count;j++){
                System.out.print(c+" ");
            }
            System.out.println();
        }
    }
}
