package ru.Albiz19.java2020.pr21.ex21_3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Foundation extends JFrame {
    public static void main(String []args){
        new Foundation();
    }
    public Foundation(){
        super("Создание документа");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JMenuBar menuBar = new JMenuBar();
        menuBar.add(createFileMenu());
        setJMenuBar(menuBar);
        setSize(500,500);
        setVisible(true);
    }
    public JMenu createFileMenu(){
        JMenu file = new JMenu("File");
        JMenu new_ = new JMenu("New");
        JMenuItem open = new JMenuItem("Open");
        JMenuItem textdoc = new JMenuItem("TextDocument");
        JMenuItem imgdoc = new JMenuItem("ImageDocument");
        JMenuItem musdoc = new JMenuItem("MusicDocument");
        file.add(new_);
        file.add(open);
        new_.add(textdoc);
        new_.add(imgdoc);
        new_.add(musdoc);
        textdoc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Нажата textdoc");
                ICreateDocument iCreateDocument = new ICreateDocument();
                iCreateDocument.CreateNew();
                System.out.println("Файл создан");
            }
        });
        open.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Нажата open");
                ICreateDocument iCreateDocument = new ICreateDocument();
                iCreateDocument.CreateOpen();
                System.out.println("Открыт файл");
            }
        });
        return file;
    }
}
