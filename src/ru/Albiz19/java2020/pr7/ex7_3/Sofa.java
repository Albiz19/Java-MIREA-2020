package ru.Albiz19.java2020.pr7.ex7_3;

public class Sofa extends Furniture{
    private double springflex;

    public double getSpringflex() {
        return springflex;
    }

    public void setSpringflex(double springflex) {
        this.springflex = springflex;
    }

    @Override
    public String toString() {
        return "Sofa{" +
                "springflex=" + springflex +
                ", color='" + color + '\'' +
                ", material='" + material + '\'' +
                ", height=" + height +
                ", length=" + length +
                ", width=" + width +
                '}';
    }

    public Sofa(String color, String material, int height, int length, int width, double springflex) {
        super(color, material, height, length, width);
        this.springflex = springflex;
    }
}
