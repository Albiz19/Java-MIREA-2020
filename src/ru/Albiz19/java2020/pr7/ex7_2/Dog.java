package ru.Albiz19.java2020.pr7.ex7_2;

public abstract class Dog {
    protected int age;
    protected String name;
    protected int height;
    public abstract int HumanAge();

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Dog(int age, String name, int height) {
        this.age = age;
        this.name = name;
        this.height = height;
    }
}
