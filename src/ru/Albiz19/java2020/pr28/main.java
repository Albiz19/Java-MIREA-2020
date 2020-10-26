package ru.Albiz19.java2020.pr28;

import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String []args){
        System.out.print("К оплате: ");
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int summ = Math.abs(random.nextInt()/100000);
        System.out.println(summ);
        System.out.println("Выберите способ оплаты: Наличными, Картой");
        try {
            String str = scanner.nextLine();
            switch (str) {
                case "Наличными": PayByCash payByCash = new PayByCash(summ); break;
                case "Картой": PayByCard payByCard = new PayByCard(summ); break;
            }
        }
        catch (Exception ex){
            System.out.println(ex);
        }
    }
}
