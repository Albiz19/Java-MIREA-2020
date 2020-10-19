package ru.Albiz19.java2020.pr27.ex27_1;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class CalcContr {
    private CalcModel theModel;
    public CalcContr(CalcModel theModel) {
        this.theModel = theModel;
        this.input();
    }
    public void input() {
        int firstNumber, secondNumber = 0;
        char operation;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                firstNumber = scanner.nextInt();
                secondNumber = scanner.nextInt();
                operation = scanner.next().charAt(0);
                theModel.addTwoNumbers(firstNumber, secondNumber, operation);
                System.out.println(theModel.getCalculationValue());
            } catch (Exception ex) {
                System.out.println(ex);
                break;
            }
        }
    }
}
