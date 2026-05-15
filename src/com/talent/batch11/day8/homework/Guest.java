package com.talent.batch11.day8.homework;

import java.util.HashSet;
import java.util.Scanner;

public class Guest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<String> guests = new HashSet<String>();

        System.out.print("How many guest: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int  i = 0;i<n;i++){
            System.out.print("Enter guest name: ");
            String name = sc.nextLine();
            guests.add(name);
        }
        System.out.println("All Guests: "+guests);

        System.out.print("Enter guest name to check: ");
        String checkGuest = sc.nextLine();
        System.out.println("Guest exist: "+guests.contains(checkGuest));

        System.out.print("Enter name to remove guest: ");
        String removeGuest = sc.nextLine();
        if(guests.remove(removeGuest)){
            System.out.println(removeGuest+" is remove successfully");
        }else {
            System.out.println(removeGuest+" not found");
        }
        System.out.println("Total numbers of guest: "+guests.size());
        sc.close();
    }
}
