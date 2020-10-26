package ru.Albiz19.java2020.pr32;

import ru.Albiz19.java2020.pr30.MenuItem;
import ru.Albiz19.java2020.pr30.Order;
import ru.Albiz19.java2020.pr30.OrdersManager;

public class TableOrdersManager implements OrdersManager {
    private ru.Albiz19.java2020.pr30.Order[] orders;

    public void add(ru.Albiz19.java2020.pr30.Order order, int tableNumber) { }
    public void addItem(ru.Albiz19.java2020.pr30.MenuItem item, int tableNumber) { }

    @Override
    public int itemsQuantity(String itemName) {
        return 0;
    }

    @Override
    public int itemsQuantity(MenuItem item) {
        return 0;
    }

    @Override
    public ru.Albiz19.java2020.pr30.Order[] getOrders() {
        return new Order[0];
    }

    @Override
    public int ordersCostSummary() {
        return 0;
    }

    @Override
    public int ordersQuantity() {
        return 0;
    }
}
