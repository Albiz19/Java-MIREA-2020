package ru.Albiz19.java2020.pr7.ex7_1;

public class Cup extends Dish {
    private int volume;
    public void breakDish(){
        this.isBroken = true;
    }

    public int getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return "Cup{" +
                "volume=" + volume +
                ", material='" + material + '\'' +
                ", price=" + price +
                ", isBroken=" + isBroken +
                '}';
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public Cup(String material, int price, boolean isBroken, int volume) {
        super(material, price, isBroken);
        this.volume = volume;
    }
}
