package ru.Albiz19.java2020.pr18.ex18_1;

import java.util.Scanner;

public class Exception2
{
    public void exceptionDemo() {
        Scanner myScanner = new Scanner( System.in );
        System.out.print( "Enter an integer ");
        String intString = myScanner.next();
        int i = Integer.parseInt(intString);
        double tmp;
        try {
             tmp = 2.0 / 0.0;
            if (tmp == Double.POSITIVE_INFINITY){
                throw (new ArithmeticException());
            } else
            System.out.println("Деление проведено успешно, исключения не было");
        }catch (ArithmeticException exe){
            System.out.println("Поймано исключение");
        }
        finally {
            System.out.println("Отрабол блок finally");
        }
    }
}
