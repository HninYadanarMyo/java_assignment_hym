package com.talent.batch11.day6.homework.homework6_5;

public class StrengthHero extends Superhero {

    public StrengthHero(String heroName, int powerLevel) {
        super(heroName, powerLevel);
    }

    @Override
    public void usePower() {
        System.out.println(heroName + " use power to lift heavy weight");
    }
}

