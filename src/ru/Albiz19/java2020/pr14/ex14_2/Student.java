package ru.Albiz19.java2020.pr14.ex14_2;

import java.util.Objects;

class Student implements Comparable <Student>{
    private String name;
    private int age;
    private int iDNumber;
    private double gpa;

    public Student(String name, int age, int iDNumber, double gpa) {
        this.name = name;
        this.age = age;
        this.iDNumber = iDNumber;
        this.gpa = gpa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                iDNumber == student.iDNumber &&
                Double.compare(student.gpa, gpa) == 0 &&
                name.equals(student.name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", iDNumber=" + iDNumber +
                ", gpa=" + gpa +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getiDNumber() {
        return iDNumber;
    }

    public void setiDNumber(int iDNumber) {
        this.iDNumber = iDNumber;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public int compareTo(Student o) {
        if (this.getName() == o.getName()){
            return 1;
        }
        else return -1;
    }
}
