package ru.Albiz19.java2020.pr26.ex26_2;

public class Node {
    Object value;
    Node next;
    Node previous;
    public Node(Object value) {
        this.value = value;
        this.previous = null;
        this.next = null;
    }
    public Node(Object value, Node next) {
        this.value = value;
        this.previous = null;
        this.next = next;
    }
    public Node(Object value, Node prev, Node next) {
        this.value = value;
        this.previous = prev;
        this.next = next;
    }
}
