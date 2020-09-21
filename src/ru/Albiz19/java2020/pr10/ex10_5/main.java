package ru.Albiz19.java2020.pr10.ex10_5;

public class main {
    public static void main(String []args){
        int n=1010;
        int s=0;
        s += n % 10;
        n /= 10;
        s += n % 10;
        n /= 10;
        s += n % 10;
        n /= 10;
        s += n % 10;
        n /= 10;
        s += n % 10;
        n /= 10;
        s += n % 10;
        n /= 10;
        s += n % 10;
        n /= 10;
        s += n % 10;
        n /= 10;
        s += n % 10;
        n /= 10;
        /*
        while (n!=0){
            s += n%10;
            n /= 10;
        }
        */
        System.out.print(s);
    }
}
