package ru.Albiz19.java2020.ex3;

public class Main {
    public static void main(String[] args)
    {
        double n = 1.0;
        double var;
        for (int i=0; i<10;i++) {
            var = 1.0 / n;
            n = n + 1.0;
            System.out.format("Num: %.2f\n", var);
        }
    }
}
