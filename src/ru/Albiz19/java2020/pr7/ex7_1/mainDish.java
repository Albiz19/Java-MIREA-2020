package ru.Albiz19.java2020.pr7.ex7_1;

public class mainDish {
    public static void main(String []args){
        Cup c = new Cup("Керамика",90,false,20);
        c.breakDish();
        System.out.println(c.toString());
    }
}
