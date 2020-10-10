package ru.Albiz19.java2020.pr22.ex22_2;

import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Date date = new Date(scanner.nextLine());
        Calendar calendar = new Calendar(scanner.nextLine());
        System.out.println(calendar.toString());
        System.out.println(date.toString());
    }
}

