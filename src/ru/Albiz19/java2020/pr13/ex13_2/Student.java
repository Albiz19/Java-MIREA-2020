package ru.Albiz19.java2020.pr13.ex13_2;

class Student {
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

    public boolean compareTo(Student student){
        if (student.getiDNumber() < iDNumber) return true;
        else return false;
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
}
