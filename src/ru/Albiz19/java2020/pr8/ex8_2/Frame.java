package ru.Albiz19.java2020.pr8.ex8_2;
import javax.swing.*;
import java.awt.*;

class ShowImage extends JPanel
{
    private Image img;

    ShowImage()
    {
        img = getToolkit().getImage("C:\\Users\\nikol\\Pictures\\Screenshots\\fix.png");
        setPreferredSize(new Dimension(820, 620));
    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.drawImage(img, 10, 10, this);
    }
}



class Frame extends JFrame
{
    Frame()
    {
        setContentPane(new ShowImage());
    }
    public static void main(String[] argv)
    {
        Frame myFrame = new Frame();
        myFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        Graphics gr = myFrame.getGraphics();
        myFrame.paintComponents(gr);
        myFrame.pack();
        myFrame.setVisible(true);
    }
}