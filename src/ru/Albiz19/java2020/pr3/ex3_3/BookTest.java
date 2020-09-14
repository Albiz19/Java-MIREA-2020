package ru.Albiz19.java2020.pr3.ex3_3;

public class BookTest {
    public static void main(String []args){
        Book bk1 = new Book("Пушкин", "Капитанская дочка", 1830 , 100);
        System.out.println(bk1.getAuthor()+ " " + bk1.getName() + " " + bk1.getYear() + " " + bk1.getPrice());
        bk1.setYear(1836);
        System.out.println(bk1.getAuthor()+ " " + bk1.getName() + " " + bk1.getYear() + " " + bk1.getPrice());
    }
}
