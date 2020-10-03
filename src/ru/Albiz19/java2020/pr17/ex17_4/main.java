package ru.Albiz19.java2020.pr17.ex17_4;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class main {
    public static void main(String []args) throws IOException {
        File file = new File("C:\\Users\\nikol\\Desktop\\test.txt");
        try (FileWriter writer = new FileWriter(file, true)){
            String str;
            Scanner scanner = new Scanner(System.in);
            str = scanner.nextLine();
            writer.write("\n");
            writer.write(str);
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
