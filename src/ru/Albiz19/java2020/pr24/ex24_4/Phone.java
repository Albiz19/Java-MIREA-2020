package ru.Albiz19.java2020.pr24.ex24_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Phone {
    public static void main(String[] args){
        System.out.println("+<Код страны><Номер 10 цифр>, например “+79175655655” или 8<Номер 10 цифр> для России");
        Scanner scanner = new Scanner(System.in);
        Phone phone = new Phone(scanner.nextLine());
        phone.numHandler();
        System.out.println(phone.toString());
    }
    private String number;
    private List<String> mainNumber = new ArrayList<>();

    public Phone(String number) {
        this.number = number;

    }
    public void numHandler(){
        char[] chars = number.toCharArray();
        int j=0;
        if (number.contains("+")){
            mainNumber.add("+");
            for (int i=1; i<chars.length - 7; i++){ //получаем код страны и первые три цифры, пишем в мэйн
                mainNumber.add(String.valueOf(chars[i]));
            }
            mainNumber.add("-");
            for (int i=chars.length-7;i<chars.length;i++) { //добавляем остаток
                if (j == 3) { mainNumber.add("-");}
                j++;
                mainNumber.add(String.valueOf(chars[i]));
            }
        }
        else {
            mainNumber.add("+7");
            for (int i=1;i<chars.length;i++){
                if (i==4 || i==7) {mainNumber.add("-");}
                mainNumber.add(String.valueOf(chars[i]));
            }
        }
    }

    @Override
    public String toString() {
        return "Phone{" +
                "mainNumber=" + mainNumber +
                '}';
    }
}
