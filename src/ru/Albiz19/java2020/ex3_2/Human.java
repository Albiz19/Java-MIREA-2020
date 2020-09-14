package ru.Albiz19.java2020.ex3_2;

public class Human {
    public static void main(String[] args){
        Head hd = new Head(5, 4, 30);
        System.out.println(hd.GetVol() + " " + hd.GetWeig() + " " + hd.GetSize());
        Leg lg = new Leg(100, 8, 43);
        System.out.println(lg.GetLeng() + " " + lg.GetWeig() + " " + lg.GetSize());
        Hand had = new Hand(60, 4);
        System.out.println(had.GetLeng() + " " + had.GetWeig());
    }
}
