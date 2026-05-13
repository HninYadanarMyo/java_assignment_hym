package com.talent.batch11.day6.homework.homework6_2;

public class Lion extends Animal {

    public Lion(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("woah woah");
    }
}
