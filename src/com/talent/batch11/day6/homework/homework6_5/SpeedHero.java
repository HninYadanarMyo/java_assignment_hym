package com.talent.batch11.day6.homework.homework6_5;

public class SpeedHero extends Superhero {

    public SpeedHero(String heroName, int powerLevel) {
        super(heroName, powerLevel);
    }

    @Override
    public void usePower() {
        System.out.println(heroName + " as fast as The Flash");
    }
}

