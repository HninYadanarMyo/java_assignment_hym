package com.talent.batch11.day6.homework.homework6_5;

import java.util.ArrayList;
import java.util.List;

public class SuperheroDemo {
    public static void main(String[] args) {

        List<Superhero> heroes = new ArrayList<>();

        heroes.add(new FlyingHero("FlyingHero", 80));
        heroes.add(new StrengthHero("The Rock", 95));
        heroes.add(new SpeedHero("Plash", 85));

        for (Superhero hero : heroes) {
            hero.displayInfo();
            hero.usePower();
            hero.powerBoost(10);
            System.out.println();
        }
    }
}
