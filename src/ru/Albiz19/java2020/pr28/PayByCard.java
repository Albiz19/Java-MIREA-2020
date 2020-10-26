package ru.Albiz19.java2020.pr28;

import java.util.Scanner;

public class PayByCard implements PaymentStrategy {
    private int summ;
    private String cardnum, carddate;
    private int CVV;

    public PayByCard(int summ) {
        this.summ = summ;
        pay();
    }

    public boolean input_card_info() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Оплата картой. Введите Номер карты");
            while (true) {
                cardnum = scanner.nextLine();
                String regex = "\\d{13,16}";
                if (cardnum.matches(regex)) {
                    System.out.println("Номер корректен");
                    break;
                } else {
                    System.out.println("Некорректный номер карты, повторите");
                }
            }
            System.out.println("Введите срок действия карты Пример 12/2020");
            while (true) {
                carddate = scanner.nextLine();
                if (carddate.matches("(0[1-9]|[12][0-9]|3[01])[- /.](19|20)\\d\\d")) {
                    System.out.println("Корректно");
                    break;
                } else {
                    System.out.println("Неккоретно, повторите ввод");
                }
            }
            System.out.println("Введите CVV код");
            while (true) {
                CVV = scanner.nextInt();
                if (CVV < 1000 && CVV > 99) {
                    System.out.println("Введен верно");
                    return true;
                } else {
                    System.out.println("Неверный код");
                }
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return false;
    }

    @Override
    public void pay() {
        while (true) {
            if (input_card_info()) {
                System.out.println("Все данные корректны, оплата произведена. Спасибо за заказ!");
                return;
            } else {
                System.out.println("Что-то пошло не так");
            }
        }
    }
}
