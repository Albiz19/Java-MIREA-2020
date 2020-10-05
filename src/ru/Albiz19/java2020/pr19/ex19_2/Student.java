package ru.Albiz19.java2020.pr19.ex19_2;

class Student {
    private String name;
    private int age;
    private int iDNumber;

    public Student(String name, int age, int iDNumber) {
        this.name = name;
        this.age = age;
        this.iDNumber = iDNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", iDNumber=" + iDNumber +
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

    public boolean compareTo(Student student){
        if (student.getName() == this.getName()) return true;
        else return false;
    }

}
