package ru.Albiz19.java2020.pr3.ex3_3;

public class BookTest {
    public static void main(String []args){
        Book bk1 = new Book("Пушкин", "Капитанская дочка", 1830 , 100);
        System.out.println(bk1.GetAuthor() + " " + bk1.GetName() + " " + bk1.GetYear() + " " + bk1.GetPrice());
        bk1.SetYear(1836);
        System.out.println(bk1.GetAuthor() + " " + bk1.GetName() + " " + bk1.GetYear() + " " + bk1.GetPrice());
    }
}
