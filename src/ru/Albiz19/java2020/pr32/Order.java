package ru.Albiz19.java2020.pr32;

import ru.Albiz19.java2020.pr30.Customer;
import ru.Albiz19.java2020.pr30.MenuItem;

public interface Order {
    boolean add(ru.Albiz19.java2020.pr30.MenuItem item);
    String[] itemsNames();
    int itemsQuantity();
    int itemQuantity(String itemName);
    int itemQuantity(ru.Albiz19.java2020.pr30.MenuItem itemName);
    ru.Albiz19.java2020.pr30.MenuItem[] getItems();
    boolean remove(String itemName);
    boolean remove(ru.Albiz19.java2020.pr30.MenuItem item);
    int removeAll(String itemName);
    int removeAll(ru.Albiz19.java2020.pr30.MenuItem item);
    MenuItem[] sortedItemByCostDesc();
    int costTotal();
    ru.Albiz19.java2020.pr30.Customer getCustomer();
    void setCustomer(Customer customer);
}
