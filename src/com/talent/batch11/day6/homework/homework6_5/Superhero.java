package com.talent.batch11.day6.homework.homework6_5;

abstract class Superhero {
    protected String heroName;
    protected int powerLevel;

    public Superhero(String heroName, int powerLevel) {
        this.heroName = heroName;
        this.powerLevel = powerLevel;
    }
    public abstract void usePower();
    public void powerBoost(int boostAmount) {
        powerLevel += boostAmount;
        System.out.println(heroName + " received a power boost And New power level: " + powerLevel);
    }

    public void displayInfo() {
        System.out.println("Hero: " + heroName + " Power Level: " + powerLevel);
    }
}
