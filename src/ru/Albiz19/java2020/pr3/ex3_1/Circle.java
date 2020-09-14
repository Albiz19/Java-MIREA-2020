package ru.Albiz19.java2020.pr3.ex3_1;

public class Circle {
    private int Radius;
    private int X,Y;
    private String color;
    public Circle(int radius, int x, int y, String color) {
        Radius = radius;
        X = x;
        Y = y;
        color = color;
    }

    public void setRadius(int radius) {
        Radius = radius;
    }

    public void setX(int x) {
        X = x;
    }

    public void setY(int y) {
        Y = y;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getRadius() {
        return Radius;
    }

    public int getX() {
        return X;
    }

    public int getY() {
        return Y;
    }

    public String getColor() {
        return color;
    }
}
