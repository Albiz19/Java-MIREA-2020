package ru.Albiz19.java2020.pr32;

import ru.Albiz19.java2020.pr30.Address;

public final class Customer {
    private String firstName;
    private String secondName;
    private int age;
    private ru.Albiz19.java2020.pr30.Address address;
    private Customer MATURE_UNKNOWN_CUSTOMER;
    private Customer NOT_MATURE_UNKNOWN_CUSTOMER;

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getAge() {
        return age;
    }

    public Address getAdress() {
        return address;
    }
}
