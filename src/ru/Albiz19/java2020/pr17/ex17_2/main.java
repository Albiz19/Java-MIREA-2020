package ru.Albiz19.java2020.pr17.ex17_2;

import java.io.*;

public class main {
    public static void main(String []args) throws IOException {
        File file = new File("C:\\Users\\nikol\\Desktop\\test.txt");
        FileInputStream fileInputStream = new FileInputStream(file);

        int i;

        while((i=fileInputStream.read())!= -1) {

            System.out.print((char) i);
        }
    }
}
