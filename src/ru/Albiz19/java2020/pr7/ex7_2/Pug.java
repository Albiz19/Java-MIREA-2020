package ru.Albiz19.java2020.pr7.ex7_2;

public class Pug extends Dog {
    protected String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Pug(int age, String name, int height, String color) {
        super(age, name, height);
        this.color = color;
    }
    public int HumanAge(){
        return this.age*8;
    }

}
