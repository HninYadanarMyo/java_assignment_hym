package com.talent.batch11.day6.homework.homework6_2;

public class Elephant extends Animal {
    public Elephant(String name,int age){
        super(name,age);
    }

    @Override
    public void makeSound() {
        System.out.println("woo woo");
    }
}
