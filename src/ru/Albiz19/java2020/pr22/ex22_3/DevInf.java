package ru.Albiz19.java2020.pr22.ex22_3;

import java.util.Date;
import java.util.Scanner;

public class DevInf {
    private String surname;
    private Date getDateOfTask;
    private Date getDateOfFinishTask;
   public String ImputFio() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Surname ");
        surname = scanner.nextLine();
        return surname;
    }
    public void getDateOfBeginTask() {
        Date getDateOfTask = new Date();
        Long time = getDateOfTask.getTime();
        long anotherDate = -7;
        time = time + (60 * 60 * 24 * 1000 * anotherDate); //неделю назад
        getDateOfTask = new Date(time);
        System.out.println("Task received: " + getDateOfTask);
        //return getDateOfTask;
    }
    public void getDateOfFinishTask() {
        Date getDateOfFinishTask = new Date();
        System.out.println("Task completed: " + getDateOfFinishTask);
    }
}
