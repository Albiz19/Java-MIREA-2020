package ru.Albiz19.java2020.ex3_2;

public class Hand {
    private int leng;
    private int weig;
    Hand(int l, int w){
        setLeng(l);
        setWeig(w);
    }
    public void setLeng(int l) {
        this.leng = l;
    }
    public void setWeig(int w){
        this.weig = w;
    }
    public int GetLeng()
    {
        return this.leng;
    }
    public int GetWeig()
    {
        return this.weig;
    }
}
