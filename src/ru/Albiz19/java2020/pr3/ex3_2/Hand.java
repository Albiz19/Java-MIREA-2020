package ru.Albiz19.java2020.pr3.ex3_2;

public class Hand {
    private int leng;
    private int weig;

    public void setLeng(int leng) {
        this.leng = leng;
    }

    public void setWeig(int weig) {
        this.weig = weig;
    }

    public int getLeng() {
        return leng;
    }

    public int getWeig() {
        return weig;
    }

    public Hand(int leng, int weig) {
        this.leng = leng;
        this.weig = weig;
    }
}
