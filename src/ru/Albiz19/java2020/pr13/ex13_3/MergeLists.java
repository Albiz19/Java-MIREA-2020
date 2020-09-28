package ru.Albiz19.java2020.pr13.ex13_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeLists {
    Student[] studentsm = {
            new Student("Петров",19,35621,4.3),
            new Student("Иванов",20, 20653,3.9),
            new Student("Сидоров",21,12903,4.5),
    };
    Student[] studentsf = {
            new Student("Петрова",20,27364,3.8),
            new Student("Иванова",19,65342,4.8),
            new Student("Сидорова",21,43028,5.0),
    };
    public void merge(){
        List <Student> list_of_studm = new ArrayList<Student>(Arrays.asList(studentsm));
        List <Student> list_of_studmf = new ArrayList<Student>(Arrays.asList(studentsf));
        List <Student> list_of_res = new ArrayList<Student>();
        list_of_res.addAll(list_of_studm);
        list_of_res.addAll(list_of_studmf);
        System.out.println(list_of_res.toString());
    }
}
