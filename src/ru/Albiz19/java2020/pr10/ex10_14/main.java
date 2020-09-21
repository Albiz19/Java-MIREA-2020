package ru.Albiz19.java2020.pr10.ex10_14;

public class main {
    public static void main(String []args){
        System.out.println(recursion(253));
    }
    public static String recursion(int n) {
        if (n < 10) {
            return Integer.toString(n);
        }
        else {
            return recursion(n / 10) + " " + n % 10;
        }
    }
}
