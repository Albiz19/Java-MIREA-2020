package ru.Albiz19.java2020.pr23.ex23_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class main {
    public static void main(String[] args){
        Map<String, ArrayList<String>> map = new HashMap();
        ArrayList<String> tmp = new ArrayList<>();
        tmp.add("Москва");
        tmp.add("Санкт-Петербуг");
        ArrayList<String> tmp1 = new ArrayList<>();
        tmp1.add("Вашингтон");
        tmp1.add("Нью-Йорк");
        map.put("Россия", tmp);
        map.put("США",tmp1);
        System.out.println(map.get("Россия"));
    }
}
