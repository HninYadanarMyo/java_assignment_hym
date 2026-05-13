package com.talent.batch11.day6.homework.homework6_2;

public abstract class Animal {
    private String name;
    private int age;

    public Animal(String name,int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract void makeSound();

    public void displayInfo(){
        System.out.println("This animal is "+getName());
        System.out.println("It's "+getAge()+"years old");
    }
}
