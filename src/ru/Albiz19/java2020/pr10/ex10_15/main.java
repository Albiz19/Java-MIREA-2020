package ru.Albiz19.java2020.pr10.ex10_15;

public class main {
    public static void main(String []args) {
        System.out.println(recursion(321));
    }
        public static int recursion(int n) {
            // Базовый случай
            if (n < 10) {
                return n;
            }// Шаг рекурсии / рекурсивное условие
            else {
                System.out.print(n % 10 + " ");
                return recursion(n / 10);
            }
    }
}
