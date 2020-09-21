package ru.Albiz19.java2020.pr8.ex8_1;

import javax.swing.*;
import java.awt.*;

class Figure extends JComponent{
    private Color color;
    private int type;
    Figure(Color color, int type) {
        this.color = color;
        this.type = type;
        setOpaque(false);
    }
    public void paintComponent(Graphics g) {
        g.setColor(color);
        switch (type) {
            case 0: g.fillOval(0, 0, 90, 90); break;
            case 1: g.fillRect(0, 0, 130, 80); break;
        }
    }
}
public class MyTest extends JFrame{
    private static final long serialVersionUID = 1L;

    public MyTest()
    {
        super("Window of Figures");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JLayeredPane lp = getLayeredPane();
        for (int i=1;i<21;i++){
            int r = (int) (Math.random()*((256)));
            int gr = (int) (Math.random()*((256)));
            int b = (int) (Math.random()*(256));
            Color cr = new Color(r,gr,b);
            int t = (int) (Math.random()*(2));
            System.out.println(t);
            Figure figure = new Figure(cr, t);
            int x1 = (int) (Math.random()*(700));
            int x2 = (int) (Math.random()*400);
            figure.setBounds(x1, x1,x2,x2);
            switch (t){
                case 0:lp.add(figure, JLayeredPane.POPUP_LAYER); break;
                case 1:lp.add(figure, JLayeredPane.PALETTE_LAYER); break;
            }

       }
        setSize(1000, 800);
        setVisible(true);
    }
    public static void main(String[] args)
    {
        JFrame.setDefaultLookAndFeelDecorated(true);
        new MyTest();
    }
}

