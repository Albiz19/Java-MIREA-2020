package ru.Albiz19.java2020.pr4.ex4_1;

public class Square extends Rectangle{
    protected double side;
    Square(){};
    Square(double side){
        setSide(side);
    }
    Square(double side, String color, boolean filled){
        setSide(side);
        setColor(color);
        setFilled(filled);
    }
    public void setSide(double side){
        this.side=side;
    }
    public double getSide(){
        return this.side;
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
        return "Shape: square, side: "+this.side+", color: "+this.color;
    }
}
