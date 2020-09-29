package ru.Albiz19.java2020.pr15.ex15_1;

import java.util.ArrayList;
import java.util.List;

public class Student {
    public static void main(String []args){
        List <Integer> list = new ArrayList<Integer>();
        for (int i=0;i<20;i++){
            list.add(i);
        }
        for (Integer list1 : list){
            System.out.println(list1);
        }
        list.remove(5);
        list.remove(10);
        for (Integer list1 : list){
            System.out.println(list1);
        }
    }
}
