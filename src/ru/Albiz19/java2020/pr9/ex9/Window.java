package ru.Albiz19.java2020.pr9.ex9;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.geom.Ellipse2D;
import javax.swing.*;

public class Window extends JFrame{

    int vx1[] = {50, 270, 250, 75},vy1[] = {100, 100, 250, 200};
    int vx2[] = {60, 140, 275, 220, 150, 100}, vy2[] = {100, 70, 260, 250, 280, 150};
    int[] arrayX1 = {50,250,270,70,50};
    int[] arrayY1 = {100,100,250,250,100};


    public Window()  {
        super("Фигура");
        setSize(300, 300);
        JFrame myWindow = new JFrame("Рисование");
        myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton button = new JButton("Нарисовать фигуру");
        button.addActionListener((ActionEvent e) -> {
            repaint();
            setVisible(true);
        });
        myWindow.add(button);
        myWindow.pack();
        myWindow.setVisible(true);
        myWindow.setLocationRelativeTo(null);
        myWindow.setSize(300,100);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    }


    @Override
    public void paint ( Graphics g ) {
        Graphics2D graph = (Graphics2D) g;
        graph.setPaint(new Color(250,250,250));
        graph.fillRect(0, 0, 300, 300);
        int r = (int) (Math.random()*((256)));
        int gr = (int) (Math.random()*((256)));
        int b = (int) (Math.random()*(256));
        Color Color = new Color(r, gr, b);
        g.setColor(Color);
        int rand_fig = (int) (Math.random()*(8)+1);
        //System.out.println(rand_fig);
        switch (rand_fig) {
            case 1:{
                Polygon poly = new Polygon(arrayX1, arrayY1, 5);
                graph.drawPolygon(poly);
                graph.fillPolygon(poly);
                break;
            }
            case 2:{
                graph.drawRect(100, 100, 120, 120);
                graph.fillRect(100, 100, 120, 120);
                break;
            }
            case 3:{
                graph.drawOval(100, 100, 150, 150);
                graph.fillOval(100, 100, 150, 150);
                break;
            }
            case 4:{
                graph.drawRoundRect(75,75,150,150,60,60);
                graph.fillRoundRect(75,75,150,150,60,60);
                break;
            }
            case 5:{
                int sa = (int) (Math.random()*(360));
                int aa = (int) (Math.random()*360);
                graph.drawArc(75,75,150,150,sa,aa);
                graph.fillArc(75,75,150,150,sa,aa);
                break;
            }
            case 6:{
                graph.draw(new Ellipse2D.Float(100,100,150,150));
                graph.fill(new Ellipse2D.Float(100,100,150,150));
                break;
            }
            case 7:{
                graph.drawPolygon(vx1,vy1,4);
                graph.fillPolygon(vx1,vy1,4);
                break;
            }
            case 8:{
                graph.drawPolygon(vx2, vy2, 6);
                graph.fillPolygon(vx2, vy2, 6);
                break;
            }
            default: { };

        }
    }


    public static void main(String args[]) {
        Window app = new Window();
    }

}