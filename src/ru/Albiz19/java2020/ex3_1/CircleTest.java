package ru.Albiz19.java2020.ex3_1;

public class CircleTest {
    public static void main(String[] args){
        Circle cir = new Circle(3, "Blue", 0, 0);
        System.out.println(cir.GetColor());
        System.out.print(cir.GetCoordX() + " " + cir.GetCoordY());
    }
}
