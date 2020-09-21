package ru.Albiz19.java2020.pr7.ex7_1;

public class Plate extends Dish{
    protected int radius;
    protected String shape;

    public int getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "Plate{" +
                "radius=" + radius +
                ", shape='" + shape + '\'' +
                ", material='" + material + '\'' +
                ", price=" + price +
                ", isBroken=" + isBroken +
                '}';
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public Plate(String material, int price, boolean isBroken, int radius, String shape) {
        super(material, price, isBroken);
        this.radius = radius;
        this.shape = shape;
    }

    public void breakDish(){
        this.isBroken = true;
    }
}
