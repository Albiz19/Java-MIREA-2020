package ru.Albiz19.java2020.pr32;

import ru.Albiz19.java2020.pr30.Customer;
import ru.Albiz19.java2020.pr30.MenuItem;
import ru.Albiz19.java2020.pr30.Order;

public class TableOrder implements Order {
    private int size;
    ru.Albiz19.java2020.pr30.MenuItem[] items;

    @Override
    public boolean add(ru.Albiz19.java2020.pr30.MenuItem item) {
        return false;
    }

    @Override
    public String[] itemsNames() {
        return new String[0];
    }

    @Override
    public int itemsQuantity() {
        return 0;
    }

    @Override
    public int itemQuantity(String itemName) {
        return 0;
    }

    @Override
    public int itemQuantity(ru.Albiz19.java2020.pr30.MenuItem itemName) {
        return 0;
    }

    @Override
    public ru.Albiz19.java2020.pr30.MenuItem[] getItems() {
        return new ru.Albiz19.java2020.pr30.MenuItem[0];
    }

    @Override
    public boolean remove(String itemName) {
        return false;
    }

    @Override
    public boolean remove(ru.Albiz19.java2020.pr30.MenuItem item) {
        return false;
    }

    @Override
    public int removeAll(String itemName) {
        return 0;
    }

    @Override
    public int removeAll(ru.Albiz19.java2020.pr30.MenuItem item) {
        return 0;
    }

    @Override
    public ru.Albiz19.java2020.pr30.MenuItem[] sortedItemByCostDesc() {
        return new MenuItem[0];
    }

    @Override
    public int costTotal() {
        return 0;
    }

    @Override
    public ru.Albiz19.java2020.pr30.Customer getCustomer() {
        return null;
    }

    @Override
    public void setCustomer(Customer customer) {

    }
}