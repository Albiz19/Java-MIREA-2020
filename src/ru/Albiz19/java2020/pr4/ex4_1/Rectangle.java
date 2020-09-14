package ru.Albiz19.java2020.pr4.ex4_1;

public class Rectangle extends Shape {
    protected double width;
    protected double length;
    Rectangle(){};
    Rectangle(double width, double length){
        setWidth(width);
        setLength(length);
    }
    Rectangle(double width, double length, String color, boolean filled){
        setWidth(width);
        setLength(length);
        setColor(color);
        setFilled(filled);
    }
    public double getWidth(){
        return this.width;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public double getLength(){
        return this.length;
    }
    public void setLength(double length){
        this.length = length;
    }
    @Override
    public double getArea()
    {
        return width*length;
    }
    @Override
    public double getPerimeter()
    {
        return 2*(width + length);
    }
    @Override
    public String toString() {
        return "Shape: rectangle, width: "+this.width+", length: "+this.length+", color: "+this.color;
    }

}
