package ru.Albiz19.java2020.pr24.ex24_1;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }
    public String nameHandler(){
        try {
            String[] str = name.split(" ");
            char[] tmp = str[1].toCharArray();
            char[] tmp1 = str[2].toCharArray();
            return str[0] + " " + tmp[0] + "." + tmp1[0] + ".";
        }
        catch (Exception e){
            return "Ошибка ввода";
        }

    }
}
