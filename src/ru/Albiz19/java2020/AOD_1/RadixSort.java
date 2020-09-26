package ru.Albiz19.java2020.AOD_1;

import java.util.ArrayList;
import java.util.List;

public class RadixSort {

    public static void main(String[] args) {

        int[] num = {170, 45, 75, 90, 802, 2, 24, 65, 1235, 563, 10, 357}; //изначальный массив

        radixsort(num); //основная функция сортировки

        for (int h : num)
            System.out.print(h + " "); //вывод массива
    }

    public static void radixsort(int[] input) { //основная функция сортировки

        List<Integer>[] buckets = new ArrayList[10]; //инициалхиация списка
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<Integer>(); //заполнение списка
        }

        boolean flag = false;
        int tmp = -1, divisor = 1;
        while (!flag) {
            flag = true;
            // раззделяем входной массив на списки
            for (Integer i : input) {//в i записывается член изначального массива
                tmp = i / divisor; //tmp - i разделить на делитель
                buckets[tmp % 10].add(i); //добавление в список числа, индекс - последнее число исходного
                if (flag && tmp > 0) {
                    flag = false;
                }
            }
            // перевести список в изначальный массив
            int a = 0;
            for (int b = 0; b < 10; b++) { //
                for (Integer i : buckets[b]) { //проходимся по списку и перемещаем значения в изначальный массив
                    input[a++] = i; //нет необходимости сравнивать числа, все учтено на предыдущем цикле
                }
                buckets[b].clear(); //очищаем список
            }
            //переходим к следующему числу
            divisor *= 10;
        }
    }
}
