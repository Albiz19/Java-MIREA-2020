package ru.Albiz19.java2020.pr6.ex6_1;

public class Student extends Teenager {
    private int course;
    private String speciality;

    public Student(int course, String speciality) {
        this.course = course;
        this.speciality = speciality;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
}
