package com.talent.batch11.day3.homework;

public class Homework1 {
    public static void print(){
        System.out.println("Hello!");
    }
    public static void print(String name){
        System.out.println("Hello ,["+name+"]");
    }

    public static void main(String[] args) {
        print();
        print("Daisy");
    }
}
