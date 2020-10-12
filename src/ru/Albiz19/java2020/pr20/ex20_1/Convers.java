package ru.Albiz19.java2020.pr20.ex20_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Convers<E> {
    private List<E> list = new ArrayList<>();
    public Convers(E[] arr) {
        list.addAll(Arrays.asList(arr));
    }
    public void showList() {
        for (Object ls : list) {
            System.out.println(ls);
        }
    }
    public void add(E element) {
        list.add(element);
    }
    public List getList() {
        return list;
    }
}
