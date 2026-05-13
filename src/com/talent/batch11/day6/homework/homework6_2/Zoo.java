package com.talent.batch11.day6.homework.homework6_2;

public class Zoo {
    public static void main(String[] args) {
        Animal[] animals = {
                            new Lion("Simba",5),
                            new Elephant("Mo Mo",6),
                            new Lion("Roar",4),
                            new Elephant("De De",5)};

        for (Animal a : animals){
            a.displayInfo();
            a.makeSound();
            System.out.println();
        }
    }
}
