package ru.Albiz19.java2020.pr26.ex26_2;

public class LinkedQueue extends AbstractQueue {
    private int size = 0;
    private Node head = null;
    private Node tail = null;
    public Object element() {
        assert !isEmpty();
        return head.value;
    }
    public void enqueue(Object element) {
        Node node = new Node(element);
        if (head == null) {
            this.head = node;
            this.tail = node;
        } else {
            tail.next = node;
            tail = tail.next;
        }
        size++;
    }
    public Object dequeue() {
        if(isEmpty()) { return null; }
        Node node = head;
        head = head.next;
        size--;
        return node.value;
    }
    public int size() {
        return size;
    }
}
