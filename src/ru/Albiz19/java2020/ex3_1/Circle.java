package ru.Albiz19.java2020.ex3_1;

public class Circle {
    private int Radius;
    private int X,Y;
    String color;
    Circle(int R, String col, int x, int y)
    {
        SetRadius(R);
        SetColor(col);
        SetCoordinates(x,y);
    }
    public void SetRadius(int R)
    {
        this.Radius = R;
    }
    public void SetColor(String c)
    {
        this.color = c;
    }
    public void SetCoordinates(int x, int y)
    {
        this.X=x;
        this.Y=y;
    }
    public int GetRadius()
    {
        return this.Radius;
    }
    public String GetColor()
    {
        return this.color;
    }
    public int GetCoordX()
    {
        return this.X;
    }
    public int GetCoordY()
    {
        return this.Y;
    }
}
