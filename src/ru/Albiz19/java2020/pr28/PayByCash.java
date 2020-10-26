package ru.Albiz19.java2020.pr28;

public class PayByCash implements PaymentStrategy {
    private int summ;

    public PayByCash(int summ) {
        this.summ = summ;
        pay();
    }

    @Override
    public void pay() {
        System.out.println("Оплатите Ваш заказ при получении, сумма к оплате: " + summ + " Спасибо за заказ!");
    }
}
