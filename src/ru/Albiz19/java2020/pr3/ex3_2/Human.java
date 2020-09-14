package ru.Albiz19.java2020.pr3.ex3_2;

public class Human {
    public static void main(String[] args){
        Head hd = new Head(5, 4, 30);
        System.out.println(hd.getVolume() + " " + hd.getWeig() + " " + hd.getSize());
        Leg lg = new Leg(100, 8, 43);
        System.out.println(lg.getLeng()+ " " + lg.getWeig() + " " + lg.getSize());
        Hand had = new Hand(60, 4);
        System.out.println(had.getLeng() + " " + had.getWeig());
    }
}
