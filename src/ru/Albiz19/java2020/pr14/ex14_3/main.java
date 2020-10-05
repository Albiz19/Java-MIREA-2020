package ru.Albiz19.java2020.pr14.ex14_3;

public class main {
    public static void main(String []args){
        Student[] students = {
                new Student("Петров",19,35621,4.3),
                new Student("Иванов",20, 20653,3.9),
                new Student("Сидоров",21,12903,4.5),
        };
        Sort srt = new Sort();
        //srt.sort();
        //srt.binarySearch();
        Student student1 = new Student("Иванов",20,20654,3.9);
        System.out.println(srt.recursiveBinarySearch(students, students[0].getiDNumber(), students[2].getiDNumber(),student1));
    }
}
