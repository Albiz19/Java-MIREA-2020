package ru.Albiz19.java2020.pr3.ex3_2;

public class Leg {
    private int leng;
    private int weig;
    private int size;

    public int getLeng() {
        return leng;
    }

    public void setLeng(int leng) {
        this.leng = leng;
    }

    public int getWeig() {
        return weig;
    }

    public void setWeig(int weig) {
        this.weig = weig;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Leg(int leng, int weig, int size) {
        this.leng = leng;
        this.weig = weig;
        this.size = size;
    }
}
