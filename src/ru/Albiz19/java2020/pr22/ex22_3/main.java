package ru.Albiz19.java2020.pr22.ex22_3;

import java.util.Date;
import java.util.Scanner;
public class main{
    public static void main(String[] args) {
        DevInf devInf = new DevInf();
        String surname = devInf.InputFio();
        System.out.println("Developers Surname is " + surname);
        devInf.getDateOfBeginTask();
        devInf.getDateOfFinishTask();
    }
}
