package ru.Albiz19.java2020.pr25.ex25_3;

import java.util.Scanner;
import java.util.regex.*;

public class test {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        System.out.println(checkExpression(scanner.nextLine()));
    }
    private static boolean checkExpression(String input) {
        Pattern pattern = Pattern.compile("\\([\\d+/*-]*\\)");
        Matcher matcher = pattern.matcher(input);
        do {
            input = matcher.replaceAll("");
            matcher = pattern.matcher(input);
        } while (matcher.find());
        return input.matches("[\\d+/*-]*");
    }
}
