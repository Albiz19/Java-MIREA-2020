package ru.Albiz19.java2020.pr10.ex10_6;

public class main {
    public static boolean recursion(int n, int i) {
        // i- дополнительный параметр. При вызове должен быть равен 2
        if (n < 2) {
            return false;
        }
        else if (n == 2) {
            return true;
        }
        else if (n % i == 0) {
            return false;
        }
        else if (i < n / 2) {
            return recursion(n, i + 1);
        } else {
            return true;
        }
    }
    public static void main(String[] args) {
        System.out.println(recursion(18, 2));
    }
}
