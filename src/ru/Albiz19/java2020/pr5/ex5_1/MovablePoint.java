package ru.Albiz19.java2020.pr5.ex5_1;

public class MovablePoint implements Movable{
    protected int x;
    protected int y;
    protected int xSpeed;
    protected int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "x=" + x +
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
