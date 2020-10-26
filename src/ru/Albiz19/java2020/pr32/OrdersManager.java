package ru.Albiz19.java2020.pr32;

import ru.Albiz19.java2020.pr30.MenuItem;
import ru.Albiz19.java2020.pr30.Order;

public interface OrdersManager {
    int itemsQuantity(String itemName);
    int itemsQuantity(MenuItem item);
    Order[] getOrders();
    int ordersCostSummary();
    int ordersQuantity();
}
