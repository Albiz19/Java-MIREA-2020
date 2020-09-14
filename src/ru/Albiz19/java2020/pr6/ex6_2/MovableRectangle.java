package ru.Albiz19.java2020.pr6.ex6_2;

import ru.Albiz19.java2020.pr4.ex4_1.Shape;

public class MovableRectangle implements Movable {
    protected double width;
    protected double length;
    private int x;
    private int y;
    public MovableRectangle(double width, double length, int x, int y) {
        this.width = width;
        this.length = length;
        this.x = x;
        this.y = y;
    }

    public MovableRectangle() {
    };

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "width=" + width +
                ", length=" + length +
                ", x=" + x +
                ", y=" + y +
                '}';
    }

    public void moveUp(){
        y++;
    }
    public void moveDown(){
        y--;
    }
    public void moveLeft(){
        x--;
    }
    public void moveRight(){
        x++;
    }
}
