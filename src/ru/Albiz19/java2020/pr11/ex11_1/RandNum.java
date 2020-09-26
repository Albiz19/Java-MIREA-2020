package ru.Albiz19.java2020.pr11.ex11_1;
public class RandNum {
    private int rand_num;
    private int i=0;
    RandNum() {
        rand_num = (int) (Math.random() * 30);
        System.out.println(rand_num);
    }

    public String compare(int num) {
        if (i==3){
            return "Попытки исчерпаны";
        }
        if (num > rand_num) {
            i++;
            return "Перебор";
        } else if (num < rand_num) {
            i++;
            return "Недобор";
        } else {
            i++;
            return "Угадал!";
        }
    }
}

