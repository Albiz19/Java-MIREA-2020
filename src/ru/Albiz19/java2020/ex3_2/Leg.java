package ru.Albiz19.java2020.ex3_2;

public class Leg {
    private int leng;
    private int weig;
    private int size;
    Leg(int l, int w, int s){
        setLeng(l);
        setWeig(w);
        setSize(s);
    }
    public void setSize(int s)
    {
        this.size = s;
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
    public int GetSize()
    {
        return this.size;
    }
}
