package com.talent.batch11.day6.homework.homework6_3;

public class Car extends Vehicle {

    public Car(String country, int year, double fuelLevel) {
        super(country, year, fuelLevel);
    }
    @Override
    public void startEngine() {
        System.out.println("Car is starting...");
    }

    @Override
    public void drive() {
        System.out.println("Car is driving...");
    }

    @Override
    public String getVehicleType() {
        return "Car";
    }
}
