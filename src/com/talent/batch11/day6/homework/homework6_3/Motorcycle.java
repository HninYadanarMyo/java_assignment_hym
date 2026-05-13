package com.talent.batch11.day6.homework.homework6_3;

public class Motorcycle extends Vehicle {

    public Motorcycle(String country, int year, double fuelLevel) {
        super(country, year, fuelLevel);
    }
    @Override
    public void startEngine() {
        System.out.println("Motorcycle engine is starting...");
    }

    @Override
    public void drive() {
        System.out.println("Motorcycle is driving...");
    }
    @Override
    public String getVehicleType() {
        return "Motorcycle";
    }

}
