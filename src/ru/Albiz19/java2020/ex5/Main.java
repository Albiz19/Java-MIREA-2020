package ru.Albiz19.java2020.ex5;

public class Main {
    public static void main(String[] args)
    {
        int n=10; //факториал 10 = 3628800

        System.out.println(factmeth(n));
    }
    public static int factmeth(int n)
    {
        if (n==0)
        {
            return 1;
        }
        for (int i=n-1; i>0;i--)
        {
            n = n * i;
        }
        return n;
    }

}
