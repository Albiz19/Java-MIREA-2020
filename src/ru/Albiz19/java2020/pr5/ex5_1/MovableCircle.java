package ru.Albiz19.java2020.pr5.ex5_1;

public class MovableCircle implements Movable{
    private int radius;
    private int x;
    private int y;
    private int xSpeed;
    private int ySpeed;
    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.radius = radius;
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "radius=" + radius +
                ", x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }
    public void moveUp(){
        this.y++;
    };
    public void moveDown(){
        this.y--;
    };
    public void moveLeft(){
        this.x--;
    };
    public void moveRight(){
        this.x--;
    };
}
