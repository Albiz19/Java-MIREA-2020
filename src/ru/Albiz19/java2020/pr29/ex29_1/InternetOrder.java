package ru.Albiz19.java2020.pr29.ex29_1;

public class InternetOrder<I> {
    I data;
    InternetOrder<I> next;
    InternetOrder<I> prev;
    InternetOrder(I data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
    InternetOrder(InternetOrder<I> prev, I data, InternetOrder<I> next) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }
}
