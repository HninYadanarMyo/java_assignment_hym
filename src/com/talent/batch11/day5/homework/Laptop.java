package com.talent.batch11.day5.homework;

public class Laptop {
    private String brand;
    private int ram;
    private double price;

    public Laptop(String brand, int ram, double price) {
        this.brand = brand;
        this.ram = ram;
        this.price = price;
    }
    @Override
    public String toString() {
        return "Laptop{" +
                "brand='" + brand + '\'' +
                ", ram=" + ram +
                ", price=" + price +
                '}';
    }

    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("Lenovo",16,3000000.0);
        Laptop laptop2 = new Laptop("Dell",16,3500000.0);
        Laptop laptop3 = new Laptop("Asus",16,3800000.0);
        System.out.println(laptop1);
        System.out.println(laptop2);
        System.out.println(laptop3);
    }

}
