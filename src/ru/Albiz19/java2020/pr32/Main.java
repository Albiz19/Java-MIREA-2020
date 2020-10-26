package ru.Albiz19.java2020.pr32;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Цена название описание");
        int price = in.nextInt();
        String name = in.next();
        String desc = in.next();
        MenuItem menuItem = new MenuItem(price, name, desc);
        try {
            FileWriter fileWriter = new FileWriter("C:\\Users\\nikol\\Desktop\\test.txt", false);
            fileWriter.write(menuItem.toString());
        } catch (Exception ex) {
            System.out.println(ex);
        }
        try {
            FileReader fileReader = new FileReader("C:\\Users\\nikol\\Desktop\\test.txt");
            System.out.println("Вывод");
            Scanner scan = new Scanner(fileReader);
            while (scan.hasNextLine()) {
                System.out.println(scan.nextLine());
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
