package ru.Albiz19.java2020.pr1.ex1_1;

public class Main {

    public static void main(String[] args) {
        System.out.println(num3());
    }
    public static int num3() {
        int[] array = {100, 15, 12, 102, 156, 1000, 1, 0};
        int s=0;
        //реализация на for
        for (int i = 0; i < array.length; i++) {
            s = s + array[i];
        }

        /* // реализация на while
        int i=0;
        while (i<array.length)
        {
            s=s+array[i];
            i++;
        }
        */
        /* //реализация на do while
        int i=0;
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

