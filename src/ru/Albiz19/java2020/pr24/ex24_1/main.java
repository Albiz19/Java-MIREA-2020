package ru.Albiz19.java2020.pr24.ex24_1;

import java.util.Scanner;

public class main {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        Person person = new Person(scanner.nextLine());
        System.out.println(person.nameHandler());
    }
}
