package com.talent.batch11.day6.homework.homework6_3;

public class Vehicle {
    private String country;
    private int year;
    private double fuelLevel;
    private static int totalVehicles = 0;

    public Vehicle(String country,int year,double fuelLevel){
        this.country = country;
        this.year = year;
        this.fuelLevel = fuelLevel;
        totalVehicles++;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public static int getTotalVehicles() {
        return totalVehicles;
    }

    public static void setTotalVehicles(int totalVehicles) {
        Vehicle.totalVehicles = totalVehicles;
    }

    public void startEngine(){
        System.out.println("Engine Starting...");
    }
    public void drive(){
        System.out.println("Driving now...");
    }
    public void refuel(double amount) {
        this.fuelLevel += amount;
        System.out.println(getVehicleType() + " refueled by " + amount + " liters.");
        System.out.println("Current fuel level: " + getFuelLevel());
    }
    public String getVehicleType() {
        return "Generic Vehicle";
    }
    public void displayInfo() {
        System.out.println("Type: " + getVehicleType());
        System.out.println("Country: " + getCountry());
        System.out.println("Year: " + getYear());
        System.out.println("Fuel Level: " + getFuelLevel());
    }

}
