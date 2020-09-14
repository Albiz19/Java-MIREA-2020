package ru.Albiz19.java2020.pr3.ex3_1;

public class CircleTest {
    public static void main(String[] args){
        Circle cir = new Circle(3,0, 0, "Blue");
        System.out.println(cir.getColor());
        System.out.print(cir.getX() + " " + cir.getY());
    }
}
