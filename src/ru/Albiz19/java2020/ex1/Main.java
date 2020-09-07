package ru.Albiz19.java2020.ex1;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println(num3());
    }
    public static int num3() {
            int[] array = {100, 15, 12, 102, 156, 1000, 1, 0};
            int s=0;
            for (int i = 0; i < array.length; i++) {
                s = s + array[i];
            }
        /*int i=0;
        while (i<array.length)
        {
            s=s+array[i];
            i++;
        }
        do
        {
            s=s+array[i];
            i++;
        }

        while (i<array.length);
         */
            return s;
        }
}

