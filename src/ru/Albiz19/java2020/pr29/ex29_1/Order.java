package ru.Albiz19.java2020.pr29.ex29_1;

import java.util.HashMap;

public interface Order {
        int remove(Item x); //удаление с заданным именем
        int remove(Item x, HashMap<String, Order> hashMap);
        int size(); //возврат размера
        boolean addFront(Item x);
        boolean addFront(Item x, HashMap<String, Order> hashMap);
        boolean addFront(HashMap<String, Order> hashMap);
        Item getOrders(HashMap<String, Order> hashMap);
        Item massOrders(); //возврат массива заказов
        Item massOrdersSorted(); //возврат заказов, сорт по убыванию
        int cost(); //возврат стоимости заказа
        int quantityporshions(String name);
        int quantity(Item x); //
        Item massOrdersnames();

}
