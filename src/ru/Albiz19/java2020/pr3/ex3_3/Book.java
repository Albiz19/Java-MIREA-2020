package ru.Albiz19.java2020.pr3.ex3_3;

public class Book {
    private String author;
    private String name;
    private int year;
    private int price;
    Book(String author, String name, int year, int price)
    {
        SetAuthor(author);
        SetName(name);
        SetYear(year);
        SetPrice(price);
    }
    public void SetAuthor(String author){
        this.author = author;
    }
    public void SetName(String name){
        this.name = name;
    }
    public void SetYear(int year){
        this.year = year;
    }
    public void SetPrice(int price){
        this.price = price;
    }
    public String GetAuthor(){
        return this.author;
    }
    public String GetName(){
        return this.name;
    }
    public int GetYear(){
        return this.year;
    }
    public int GetPrice(){
        return this.price;
    }
}
