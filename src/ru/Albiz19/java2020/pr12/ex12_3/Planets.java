package ru.Albiz19.java2020.pr12.ex12_3;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

import static java.lang.StrictMath.pow;

public class Planets extends JFrame{
    public static void main(String []args){
        new Planets();
    }
    public Planets(){
        JFrame frame = new JFrame();
        frame.setSize(700,400);
        //frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        //panel.setSize(700,400);
        //panel.setVisible(true);

        JButton button = new JButton("Подтвердить");
        button.setBounds(300,300,50,50);
        panel.add(button);

        JTextField textField = new JTextField(15);
        textField.setBounds(10,10,100,50);
        textField.setToolTipText("Введите планету для получения массы");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(Planets.this,"g = " + texthandler(textField.getText()));
            }
        });
        panel.add(textField);
        frame.add(panel);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public String texthandler(String str){
        switch (str){
            case "Земля": {
                str = String.valueOf(Planet.EARTH.getForce());
                break;
            }
            case "Меркурий":{
                str = String.valueOf(Planet.MERCURY.getForce());
                break;
            }
            case "Венера":{
                str = String.valueOf(Planet.VENUSIAN.getForce());
                break;
            }
            case "Марс":{
                str = String.valueOf(Planet.MARS.getForce());
                break;
            }
            case "Юпитер":{
                str = String.valueOf(Planet.JOVIAN.getForce());
                break;
            }
            case "Сатурн":{
                str = String.valueOf(Planet.SATURN.getForce());
                break;
            }
            case "Уран":{
                str = String.valueOf(Planet.URANIUM.getForce());
                break;
            }
            case "Нептун":{
                str = String.valueOf(Planet.NEPTUNE.getForce());
                break;
            }
        }
        return str;
    }
}
enum Planet{
    MERCURY(3.3,2440),
    VENUSIAN(48.7,6052),
    EARTH(59.7,6357),
    MARS(6.42,6786),
    JOVIAN(19000,71398),
    SATURN(5690,60300),
    URANIUM(869,23800),
    NEPTUNE(1040,22200);
    private int radius;
    private double mass;
    Planet(double mass, int radius){
        this.radius=radius;
        this.mass=mass;
    };

    public void setMass(double mass) {
        this.mass = mass;
    };

    public void setRadius(int radius) {
        this.radius = radius;
    };

    public double getMass() {
        return mass;
    };

    public int getRadius() {
        return radius;
    };
    public double getForce(){
        return 6.67*(mass*(pow(10,6)))/(pow(radius,2));
    }
}

