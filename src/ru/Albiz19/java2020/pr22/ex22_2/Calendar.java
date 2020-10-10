package ru.Albiz19.java2020.pr22.ex22_2;

public class Calendar {
    private String time;
    private String hours;
    private String minutes;

    public Calendar(String time) {
        this.time = time;
        date_handler();
    }
    public void date_handler(){
        String[] tmp = time.split(">");
        char[] tmp1 = tmp[0].toCharArray();
        hours = tmp1[1] + String.valueOf(tmp1[2]);
        tmp1 = tmp[1].toCharArray();
        minutes = String.valueOf(tmp1[1]) + tmp1[2];
    }

    @Override
    public String toString() {
        return "Time {" +
                "hours=" + hours +
                ", minutes=" + minutes +
                '}';
    }
}
