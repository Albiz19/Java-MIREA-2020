package ru.Albiz19.java2020.pr17.ex17_1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class main {
    public static void main(String []args) throws IOException {
        File file = new File("C:\\Users\\nikol\\Desktop\\test.txt");
        try (FileWriter writer = new FileWriter(file, false)){
            String str = "Test string";
            writer.write(str);
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
