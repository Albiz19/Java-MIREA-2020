package ru.Albiz19.java2020.pr7.ex7_1;

public abstract class Dish {
    protected String material;
    protected int price;
    protected boolean isBroken;

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isBroken() {
        return isBroken;
    }

    public void setBroken(boolean broken) {
        isBroken = broken;
    }

    public Dish(String material, int price, boolean isBroken) {
        this.material = material;
        this.price = price;
        this.isBroken = isBroken;
    }

    public abstract void breakDish();
}
