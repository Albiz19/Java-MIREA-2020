package ru.Albiz19.java2020.ex4;

import java.util.Random;


public class Main {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            // array[i] = (int) (Math.random()*100);
            array[i] = rand.nextInt(100);
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");
        for (int left = 0; left < array.length; left++) {
            // Вытаскиваем значение элемента
            int value = array[left];
            // Перемещаемся по элементам, которые перед вытащенным элементом
            int i = left - 1;
            for (; i >= 0; i--) {
                // Если вытащили значение меньшее — передвигаем больший элемент дальше
                if (value < array[i]) {
                    array[i + 1] = array[i];
                } else {
                    // Если вытащенный элемент больше — останавливаемся
                    break;
                }
            }
            // В освободившееся место вставляем вытащенное значение
            array[i + 1] = value;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
