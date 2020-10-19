package ru.Albiz19.java2020.pr27.ex27_1;

public class MVCCalculator {
    public static void main(String[] args) {
        CalcModel theModel = new CalcModel();
        CalcContr theController = new CalcContr(theModel);
    }
}
