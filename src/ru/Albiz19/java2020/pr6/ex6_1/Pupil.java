package ru.Albiz19.java2020.pr6.ex6_1;

public class Pupil extends Teenager {
    private int form;

    public Pupil(int form) {
        this.form = form;
    }

    public Pupil(int age, String name, int height, double average_marks, int form) {
        super(age, name, height, average_marks);
        this.form = form;
    }

    public int getForm() {
        return form;
    }

    public void setForm(int form) {
        this.form = form;
    }
}
