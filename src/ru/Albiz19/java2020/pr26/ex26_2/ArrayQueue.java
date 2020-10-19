package ru.Albiz19.java2020.pr26.ex26_2;

public class ArrayQueue extends AbstractQueue {
    private int head = 0;
    private int tail = 0;
    private Object[] elems = new Object[16];
    private void ensureCapacity(int size) {
        if ((size == elems.length) || ((size > 3) && (size == elems.length / 4))) {
            Object[] newElems;
            if (size == elems.length) {
                newElems = new Object[elems.length * 2];
            } else {
                newElems = new Object[elems.length / 2];
            }
            if (head <= tail) {
                System.arraycopy(elems, head, newElems, 0, size());
            } else {
                System.arraycopy(elems, head, newElems, 0, elems.length - head);
                System.arraycopy(elems, 0, newElems, elems.length - head, tail);
            }
            tail = size();
            head = 0;
            elems = newElems;
        }
    }
    //Метод добавления элемента в очередь
    public void enqueue(Object element) {
        ensureCapacity(size() + 1);
        elems[tail] = element;
        tail = (tail + 1) % elems.length;
    }
    //получение первого элемента в очереди
    public Object element() {
        if (isEmpty()) { return null; }
        return elems[head];
    }

    public Object dequeue() {
        if(isEmpty()) { return null; }
        ensureCapacity(size() - 1);
        Object tmp = elems[head];
        elems[head] = null;
        head = (head + 1) % elems.length;
        return tmp;
    }
    //Размер очереди
    public int size() {
        return tail - head + (head > tail ? elems.length : 0);
    }
    //проверка на пустоту
    public boolean isEmpty() {
        return head == tail;
    }
    //очистка
    public void clear() {
        while (!isEmpty()) {
            dequeue();
        }
    }
}
