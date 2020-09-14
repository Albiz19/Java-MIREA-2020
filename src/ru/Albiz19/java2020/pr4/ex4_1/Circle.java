package ru.Albiz19.java2020.pr4.ex4_1;

public class Circle extends Shape{
    protected double radius;
    Circle() {};
    Circle (double radius){
        setRadius(radius);
    }
    Circle (double radius, String color, boolean filled){
        setColor(color);
        setRadius(radius);
        setFilled(filled);
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getRadius() {
        return this.radius;
    }
    @Override
    public double getArea()
    {
        return 3.14*radius*radius;
    }
    @Override
    public double getPerimeter()
    {
        return 2*3.14*radius;
    }
    @Override
    public String toString() {
        return "Shape: circle, radius: "+this.radius+", color: "+this.color;
    }
}
