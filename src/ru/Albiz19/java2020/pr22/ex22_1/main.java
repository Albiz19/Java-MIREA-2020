package ru.Albiz19.java2020.pr22.ex22_1;

import java.util.Scanner;

public class main {
    public static void main(String []args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дату через пробел. Введите способ вывода: короткий, средний полный");
        Student student = new Student(scanner.nextLine());
        System.out.println(student.toString(scanner.nextLine()));
    }
}
