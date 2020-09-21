package ru.Albiz19.java2020.pr10.ex10_3;

public class main {
    public static void main(String []args){
        char first = 'a';
        char second = 'c';
        if (first<second) {
            for (char i = first; i <= second; i++) {
                System.out.print(i + " ");
            }
        }
        else {
            for (char i = first; i >= second; i--) {
                System.out.print(i + " ");
            }
        }
    }
}
