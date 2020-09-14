package ru.Albiz19.java2020.pr3.ex3_3;

public class Book {
    private String author;
    private String name;
    private int year;
    private int price;

    public Book(String author, String name, int year, int price) {
        this.author = author;
        this.name = name;
        this.year = year;
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
