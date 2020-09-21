package ru.Albiz19.java2020.pr10.ex10_10;

public class main {
    public static void main(String []args){
        System.out.println(func(158,0));
    }
    public static int func(int n, int i){
        if (n==0){
            return i;
        }
        else{
           return func(n/10,i*10+n%10);
        }
    }
}
