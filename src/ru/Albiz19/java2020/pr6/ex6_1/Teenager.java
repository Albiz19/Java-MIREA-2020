package ru.Albiz19.java2020.pr6.ex6_1;

public class Teenager extends Human{
    protected double average_marks;
    public Teenager() {};
    public Teenager(double average_marks) {
        this.average_marks = average_marks;
    }

    public double getAverage_marks() {
        return average_marks;
    }

    public void setAverage_marks(double average_marks) {
        this.average_marks = average_marks;
    }

    public Teenager(int age, String name, int height, double average_marks) {
        super(age, name, height);
        this.average_marks = average_marks;
    }
}
