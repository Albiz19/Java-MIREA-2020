package ru.Albiz19.java2020.pr14.ex14_2;

public class Sort {
    Student[] students = {
            new Student("Петров",19,35621,4.3),
            new Student("Иванов",20, 20653,3.9),
            new Student("Сидоров",21,12903,4.5),
    };
    public boolean sort(){
        Student student = new Student("Иванов",20,20653,3.9);
        for (Student student1 : students){
            if (student1.equals(student)){
                return true;
            }
            else return false;
        }
        return false;
    }
}
