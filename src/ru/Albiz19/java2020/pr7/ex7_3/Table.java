package ru.Albiz19.java2020.pr7.ex7_3;

public class Table extends Furniture {
    private int square;

    @Override
    public String toString() {
        return "Table{" +
                "square=" + square +
                ", color='" + color + '\'' +
                ", material='" + material + '\'' +
                ", height=" + height +
                ", length=" + length +
                ", width=" + width +
                '}';
    }

    public int getSquare() {
        return square;
    }

    public void setSquare(int square) {
        this.square = square;
    }

    public Table(String color, String material, int height, int length, int width, int square) {
        super(color, material, height, length, width);
        this.square = square;
    }
}
