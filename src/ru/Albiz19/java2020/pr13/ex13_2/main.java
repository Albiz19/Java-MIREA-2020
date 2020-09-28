package ru.Albiz19.java2020.pr13.ex13_2;

public class main {
    public static void main(String []args){
        Student[]students = {
                new Student("Петров",19,35621,4.3),
                new Student("Иванов",20, 20653,3.9),
                new Student("Сидоров",21,12903,4.5),
                new Student("Иванова",20,63213,4.6),
                new Student("Полякова",19,53421,4.0)
        };
        SortingStudentsByGPA srt = new SortingStudentsByGPA();
        srt.sort(students);
    }
}
