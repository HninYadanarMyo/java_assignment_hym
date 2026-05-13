package com.talent.batch11.day6.homework.homework6_3;

public class FleetManager {
    public static void main(String[] args) {
        Vehicle[] fleet = {
                new Car("Japan", 2022, 40.5),
                new Motorcycle("USA", 2021, 15.0),
                new Car("Germany", 2023, 55.0),
                new Motorcycle("China", 2020, 12.5)
        };

        for (Vehicle vehicle : fleet) {
            vehicle.displayInfo();
            vehicle.startEngine();
            vehicle.drive();
            vehicle.refuel(10);
            System.out.println();
        }
        System.out.println("Total Vehicles Created: " + Vehicle.getTotalVehicles());
    }

}
