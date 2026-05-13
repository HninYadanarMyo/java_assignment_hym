package com.talent.batch11.day6.homework.homework6_5;

public class FlyingHero extends Superhero {

    public FlyingHero(String heroName, int powerLevel) {
        super(heroName, powerLevel);
    }

    @Override
    public void usePower() {
        System.out.println(heroName + " fly like aeroplane");
    }
}

