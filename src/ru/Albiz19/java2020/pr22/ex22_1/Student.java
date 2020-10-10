package ru.Albiz19.java2020.pr22.ex22_1;

class Student {
    private String name;
    private int age;
    private int iDNumber;
    private String dateofbirth;

    public Student(String dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public String toString(String str) {
        String[] words = dateofbirth.split(" ");
        char[] tmp = words[2].toCharArray();
        if (str.compareTo("Короткий")==0){
            return words[0] + "." + words[1] + "." + tmp[2] + tmp[3];
        }
        if (str.compareTo("Средний")==0){
            return words[0] + "." + words[1] + "." + words[2];
        }
        if (str.compareTo("Полный")==0){
            switch (words[1]){
                case "01" : return words[0] + " января " + words[2];
                case "02" : return words[0] + " февраля " + words[2];
                case "03" : return words[0] + " марта " + words[2];
                case "04" : return words[0] + " апреля " + words[2];
                case "05" : return words[0] + " мая " + words[2];
                case "06" : return words[0] + " июня " + words[2];
                case "07" : return words[0] + " июля " + words[2];
                case "08" : return words[0] + " августа " + words[2];
                case "09" : return words[0] + " сентября " + words[2];
                case "10" : return words[0] + " октбяря " + words[2];
                case "11" : return words[0] + " ноября " + words[2];
                case "12" : return words[0] + " декабря " + words[2];
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getiDNumber() {
        return iDNumber;
    }

    public void setiDNumber(int iDNumber) {
        this.iDNumber = iDNumber;
    }

}
