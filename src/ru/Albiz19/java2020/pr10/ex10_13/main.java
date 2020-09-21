package ru.Albiz19.java2020.pr10.ex10_13;

public class main {
    public static void main(String []args){
        recursion();
    }
    public static void recursion() {
        java.util.Scanner in = new java.util.Scanner(System.in);
        int n = in.nextInt();
        if (n > 0) {
            int m = in.nextInt();
            System.out.println(n);
            if (m > 0) {
                recursion();
            }
        }
    }
}
