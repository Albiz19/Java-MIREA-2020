package ru.Albiz19.java2020.pr22.ex22_2;

public class Date {
    private String date;
    private String day, month, year;

    public Date(String date) {
        this.date = date;
        date_handler();
    }

    @Override
    public String toString() {
        return "Date {" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }

    public void date_handler(){
        String[] tmp = date.split(">");
        char[] chars = tmp[0].toCharArray();
        day = String.valueOf(chars[1]) + chars[2];
        chars = tmp[1].toCharArray();
        month = String.valueOf(chars[1]) + chars[2];
        chars = tmp[2].toCharArray();
        year = String.valueOf(chars[1]) + chars[2] + chars[3] + chars[4];
    }
}
