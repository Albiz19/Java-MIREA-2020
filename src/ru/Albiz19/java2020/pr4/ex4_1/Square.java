package ru.Albiz19.java2020.pr4.ex4_1;

public class Square extends Rectangle{
    protected double side;
    Square(){};

    public Square(String color, boolean filled, double side) {
        this.color = color;
        this.filled = filled;
        this.side = side;
    }

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea()
    {
        return side*side;
    }
    @Override
    public double getPerimeter()
    {
        return 4*side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
