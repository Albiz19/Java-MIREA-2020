package ru.Albiz19.java2020.pr3.ex3_2;

public class Head {
    private int volume;
    private int weig;
    private int size;

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setWeig(int weig) {
        this.weig = weig;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getVolume() {
        return volume;
    }

    public int getWeig() {
        return weig;
    }

    public int getSize() {
        return size;
    }

    public Head(int volume, int weig, int size) {
        this.volume = volume;
        this.weig = weig;
        this.size = size;
    }
}
