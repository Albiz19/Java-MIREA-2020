package ru.Albiz19.java2020.pr10.ex10_4;

public class main {
    public static void main(String []args){
        double s=5;
        double k=3;
        double j=Math.pow(10.0, k-1.0);
        int buff=0,buff1;
        int u=0;
        double k1 =Math.pow(10.0, k);
        for (int i=(int) j; i<k1; i++){
            buff1=i;
            while (buff1!=0){
                buff= (int) (buff+(buff1%(10)));
                buff1=(int) (buff1/(10));
            }
            //System.out.println(buff);
            if (buff==s){
                u++;
            }
            buff=0;
            //double buff=(i/(Math.pow(10, 1)))+(i/(Math.pow(10,k)))
            //if (
        }
        System.out.print(u);
    }
}
