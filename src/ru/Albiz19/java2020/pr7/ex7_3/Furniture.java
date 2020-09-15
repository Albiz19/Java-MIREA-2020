package ru.Albiz19.java2020.pr7.ex7_3;

public abstract class Furniture extends FurnitureShop{
    protected String color;
    protected String material;
    protected int height;
    protected int length;
    protected int width;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }


    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public Furniture(String color, String material, int height, int length, int width) {
        this.color = color;
        this.material = material;
        this.height = height;
        this.length = length;
        this.width = width;
    }
}
