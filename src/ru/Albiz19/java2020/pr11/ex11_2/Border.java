package ru.Albiz19.java2020.pr11.ex11_2;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class TestFrame {

    public static void createGUI() {
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("Test frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        JTextField textField = new JTextField();
        textField.setColumns(30);
        panel.add(textField);
        ActionListener nrthAct = e -> {
            JDialog dialog = new JDialog(frame, "Добро пожаловать в САО");
            dialog.setBounds(500,500,200,100);
            dialog.getRootPane().setWindowDecorationStyle(JRootPane.INFORMATION_DIALOG);
            dialog.setVisible(true);
        };
        ActionListener sthAct = e ->{
            JDialog dialog = new JDialog(frame, "Добро пожаловать в ЮАО");
            dialog.setBounds(500,600,200,100);
            dialog.getRootPane().setWindowDecorationStyle(JRootPane.INFORMATION_DIALOG);
            dialog.setVisible(true);
        };
        ActionListener estAct = e ->{
            JDialog dialog = new JDialog(frame, "Добро пожаловать в ВАО");
            dialog.setBounds(800,600,200,100);
            dialog.getRootPane().setWindowDecorationStyle(JRootPane.INFORMATION_DIALOG);
            dialog.setVisible(true);
        };
        ActionListener wstAct = e ->{
            JDialog dialog = new JDialog(frame, "Добро пожаловать в ЗАО");
            dialog.setBounds(400,600,200,100);
            dialog.getRootPane().setWindowDecorationStyle(JRootPane.INFORMATION_DIALOG);
            dialog.setVisible(true);
        };
        ActionListener cntrAct = e ->{
            JDialog dialog = new JDialog(frame, "Добро пожаловать в ЦАО");
            dialog.setBounds(500,500,200,100);
            dialog.getRootPane().setWindowDecorationStyle(JRootPane.INFORMATION_DIALOG);
            dialog.setVisible(true);
        };
        JButton northButton = new JButton("NORTH");
        panel.add(northButton, BorderLayout.NORTH);
        northButton.addActionListener(nrthAct);

        JButton southButton = new JButton("SOUTH");
        panel.add(southButton, BorderLayout.SOUTH);
        southButton.addActionListener(sthAct);

        JButton eastButton = new JButton("EAST");
        panel.add(eastButton, BorderLayout.EAST);
        eastButton.addActionListener(estAct);

        JButton westButton = new JButton("WEST");
        panel.add(westButton, BorderLayout.WEST);
        westButton.addActionListener(wstAct);

        JButton centerButton = new JButton("CENTER");
        panel.add(centerButton, BorderLayout.CENTER);
        centerButton.addActionListener(cntrAct);

        frame.getContentPane().add(panel);
        frame.setPreferredSize(new Dimension(600, 300));


        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createGUI();
            }
        });
    }
}
/*import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

import javax.swing.*;

public class Border extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

    Button west_button = new Button("West");
    Button east_button = new Button("East");
    Button north_button = new Button("North");
    Button south_button = new Button("South");
    Button center_button = new Button("Center");
    //west_button.setPrefSize(100,100);
    //primaryStage.
    //west_button.setVisible(true);
    FlowPane root = new FlowPane(Orientation.VERTICAL,50,50, west_button);
    Scene scene = new Scene(root);
    primaryStage.setScene(scene);
    primaryStage.setTitle("Стороны света");
    primaryStage.show();
    }
}

 */
