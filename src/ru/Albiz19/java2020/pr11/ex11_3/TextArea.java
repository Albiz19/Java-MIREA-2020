package ru.Albiz19.java2020.pr11.ex11_3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextArea extends JFrame
{
    public TextArea()
    {
        super("Пример JTextArea");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JMenuBar menuBar = new JMenuBar();
        menuBar.add(createViewManu());
        setJMenuBar(menuBar);
    }
    public static void main(String[] args) {
        new TextArea();
    }
    public JMenu createViewManu(){
        JMenu viewMenu = new JMenu("Вид");
        JTextArea area2 = new JTextArea(3, 20);
        area2.setText(" ");
        // Параметры переноса слов
        area2.setLineWrap(true);
        area2.setWrapStyleWord(true);
        // поля в окно
        JPanel contents = new JPanel();
        contents.add(new JScrollPane(area2));
        setContentPane(contents);

        ActionListener clr_b = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                area2.setSelectedTextColor(Color.blue);
            }
        };
        ActionListener clr_r = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                area2.setSelectedTextColor(Color.red);
            }
        };
        ActionListener clr_bl = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                area2.setSelectedTextColor(Color.black);
            }
        };
        ActionListener font_rom = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Font font = new Font("Times New Roman", Font.BOLD, 14);
                area2.setFont(font);
            }
        };
        ActionListener font_ms = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Font font = new Font("MS Sans Serif", Font.BOLD, 14);
                area2.setFont(font);
            }
        };
        ActionListener font_cour = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Font font = new Font("Courier New", Font.BOLD, 14);
                area2.setFont(font);
            }
        };
        JRadioButtonMenuItem blue  = new JRadioButtonMenuItem("Синий");
        blue.addActionListener(clr_b);
        JRadioButtonMenuItem red  = new JRadioButtonMenuItem("Красный");
        red.addActionListener(clr_r);
        JRadioButtonMenuItem black = new JRadioButtonMenuItem("Черный");
        red.addActionListener(clr_bl);
        JRadioButtonMenuItem roman = new JRadioButtonMenuItem("Times New Roman");
        roman.addActionListener(font_rom);
        JRadioButtonMenuItem ms = new JRadioButtonMenuItem("MS Sans Serif");
        ms.addActionListener(font_ms);
        JRadioButtonMenuItem cour = new JRadioButtonMenuItem("Courier New");
        ms.addActionListener(font_cour);
        ButtonGroup bg = new ButtonGroup();
        bg.add(roman);
        bg.add(ms);
        bg.add(cour);
        viewMenu.add(blue);
        viewMenu.add(red);
        viewMenu.add(black);
        viewMenu.add( new JSeparator());
        viewMenu.add(roman);
        viewMenu.add(ms);
        viewMenu.add(cour);
        setSize(400, 300);
        setVisible(true);

        return viewMenu;
    }
}