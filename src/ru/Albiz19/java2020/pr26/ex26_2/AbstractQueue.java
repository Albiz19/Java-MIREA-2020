package ru.Albiz19.java2020.pr26.ex26_2;

public abstract class AbstractQueue implements Queue {
    public void clear() { //метод очистки очереди
        while (!isEmpty()) {
            dequeue();
        }
    }
    public boolean isEmpty() {
        if (size()==0){ return true; }
        else { return false; }
    }

}

