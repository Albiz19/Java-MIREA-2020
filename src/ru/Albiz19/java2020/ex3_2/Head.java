package ru.Albiz19.java2020.ex3_2;

public class Head {
    private int volume;
    private int weig;
    private int size;
    Head(int v, int w, int s){
        setVol(v);
        setWeig(w);
        setSize(s);
    }
    public void setSize(int s)
    {
        this.size = s;
    }
    public void setVol(int v) {
        this.volume = v;
    }
    public void setWeig(int w){
        this.weig = w;
    }
    public int GetVol()
    {
        return this.volume;
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
