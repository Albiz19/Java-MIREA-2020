package ru.Albiz19.java2020.pr10.ex10_1;

public class main {
    public static void main(String []args){
        int n=6; //число для вывода
        int buff=n,k;
        for (int i=1;i<=n;i++){
            k=i;
            while (k>0 && buff>0){
                System.out.print(i + " ");
                buff--;
                k--;
            }
        }
    }
}
