package com.talent.batch11.day6.homework.homework6_6;

public class Book {
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double makeDiscount(int percent) {
        price = price - (price * percent / 100.0);
        return price;
    }

    public void displayBook() {
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Price: " + getPrice());
        System.out.println();
    }

    public static void main(String[] args) {
        Book book1 = new Book("Java Basics", "John Doe", 25000.0);
        Book book2 = new Book("Spring Boot", "Mary Jane", 40000.0);
        Book book3 = new Book("React", "Jane Doe", 35000.0);

        System.out.println("Original Book Details:");
        book1.displayBook();
        book2.displayBook();
        book3.displayBook();

        book1.makeDiscount(10);
        book2.makeDiscount(15);
        book3.makeDiscount(20);

        System.out.println("After Discount:");
        book1.displayBook();
        book2.displayBook();
        book3.displayBook();
    }
}
