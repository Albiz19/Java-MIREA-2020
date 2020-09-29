package ru.Albiz19.java2020.pr15.ex15_2;

import java.util.LinkedList;

public class main {
    public static void main(String[] args) {
        LinkedList<String> strings = new LinkedList<>();
        strings.add("String #1");
        strings.add("String #2");
        strings.add("String #3");
        strings.add("String #4");
        System.out.println(strings.get(2));
        for (String string : strings){
            System.out.println(string);
        }
    }
}
