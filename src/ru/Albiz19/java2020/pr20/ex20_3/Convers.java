package ru.Albiz19.java2020.pr20.ex20_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Convers<E> {
    private List<E> list = new ArrayList<>();
    public Convers(E[] array) {
        list.addAll(Arrays.asList(array));
    }
    public void showList() {
        for (Object ls : list) {
            System.out.println(ls);
        }
    }
    public E getByIndex(int index){
        return list.get(index);
    }
    public void showFive(){
        int i=0;
        for (Object ls : list){
            System.out.println(i + ": " + ls);
            if (i==4){ break;}
            i++;
        }
    }
    public void add(E element) {
        list.add(element);
    }
    public List getList() {
        return list;
    }
}
