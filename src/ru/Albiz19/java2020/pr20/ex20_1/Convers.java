package ru.Albiz19.java2020.pr20.ex20_1;

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
            System.out.print(ls + " ");
        }
        System.out.println();
    }

    public void add(E element) {
        list.add(element);
    }

    public List getList() {
        return list;
    }
}
