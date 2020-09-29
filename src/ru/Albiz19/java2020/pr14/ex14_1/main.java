package ru.Albiz19.java2020.pr14.ex14_1;

public class main {
    public static void main(String []args){
        Search src = new Search();
       Student[] students = {
                new Student("Петров",19,35621,4.3),
                new Student("Иванов",20, 20653,3.9),
                new Student("Сидоров",21,12903,4.5),
        };
       System.out.println(src.search(students, "Иванов").toString()+"\n");
       students=src.sort(students);
       for (Student student : students){
           System.out.println(student.toString());
       }
    }
}
