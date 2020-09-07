package ru.Albiz19.java2020.ex4;

import java.util.Random;

import static com.sun.tools.javac.jvm.ByteCodes.swap;

public class Main {
    public static void main(String[] args)
    {
        int[] array = new int[10];
        Random rand = new Random();

        for (int i=0; i<10; i++)
        {
           // array[i] = (int) (Math.random()*100);
            array[i] = rand.nextInt(100);
            System.out.println(array[i]);
        }
        for (int left = 0; left < array.length; left++) {
            int minInd = left;
            for (int i = left; i < array.length; i++) {
                if (array[i] < array[minInd]) {
                    minInd = i;
                }
            }
            swap(array, left, minInd);
        }
    }
}
