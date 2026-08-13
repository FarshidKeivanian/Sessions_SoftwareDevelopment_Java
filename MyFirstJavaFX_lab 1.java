package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MyFirstJavaFX extends Application {

    @Override
    public void start(Stage primaryStage) {

        Button btOK = new Button("SUCCESS!");

        Scene scene = new Scene(btOK, 200, 250);

        primaryStage.setTitle("My First JavaFX");

        primaryStage.setScene(scene);

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}