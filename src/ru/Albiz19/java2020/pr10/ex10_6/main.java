package ru.Albiz19.java2020.pr10.ex10_6;

public class main {
    public static void main(String []args){
        int n=100, temp;
        boolean isPr = true;
        for (int i=2;i<n/2;i++){
            temp=n&i;
            if (temp==0){
                isPr=false;
                break;
            }
        }
        if (isPr) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
