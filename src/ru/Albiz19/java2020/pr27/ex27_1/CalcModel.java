package ru.Albiz19.java2020.pr27.ex27_1;

public class CalcModel {
    private int calculationValue;
    public void addTwoNumbers(int firstNumber, int secondNumber, char operation) {
        try {
            switch (operation) {
                case '+':
                    calculationValue = firstNumber + secondNumber;
                    break;
                case '-':
                    calculationValue = firstNumber - secondNumber;
                    break;
                case '*':
                    calculationValue = firstNumber * secondNumber;
                    break;
                case '/':
                    if (secondNumber == 0) {
                        System.out.println("infinity");
                    } else {
                        calculationValue = firstNumber / secondNumber;
                    } break;
                default: throw new Exception();
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
    public int getCalculationValue() {
        return calculationValue;
    }
}
