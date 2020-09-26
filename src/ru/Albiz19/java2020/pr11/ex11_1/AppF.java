package ru.Albiz19.java2020.pr11.ex11_1;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import javafx.event.ActionEvent;

import java.awt.event.MouseEvent;

public class AppF extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    private RandNum rd;
    @Override
    public void start(Stage primaryStage) throws Exception {
        RandNum rand = new RandNum();
        javafx.scene.control.Label lbl = new javafx.scene.control.Label();
        javafx.scene.control.TextField txtfld = new javafx.scene.control.TextField();
        txtfld.setText("Введите число");
        txtfld.setVisible(true);
        javafx.scene.control.Button conf_butt = new javafx.scene.control.Button("Подтвердить");

       conf_butt.setOnAction(new EventHandler<ActionEvent>() {
           @Override
           public void handle(ActionEvent actionEvent) {
                   String str = txtfld.getText();
                   int temp = Integer.parseInt(str);
                   str = rand.compare(temp);
                   lbl.setText(str);
           }
        });
       FlowPane root = new FlowPane(Orientation.VERTICAL,50,50,txtfld,conf_butt,lbl);
       Scene scene = new Scene(root, 200,200);
       primaryStage.setScene(scene);
       primaryStage.setTitle("Угадай число");
       primaryStage.show();
    }

}
