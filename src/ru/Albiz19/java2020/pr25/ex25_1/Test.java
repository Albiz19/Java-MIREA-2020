package ru.Albiz19.java2020.pr25.ex25_1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(String []args){
        String tmp = "SomeTextOverHere";
        boolean res = Pattern.matches("SomeTextOverhere", tmp);
        System.out.println(res);
        Pattern pattern = Pattern.compile("Some(\\w*)"); //означает, что после слова в совпадении может находиться любое
        Matcher matcher = pattern.matcher("SomeText and Some"); // количество алфавитно-цифровых символов
        res = matcher.matches();
        System.out.println(res);
        String newStr = matcher.replaceAll("Another");
        System.out.println(newStr);
    }
}
