package com.example.trycatchexample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Parent;

public class StudentApp extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        // ✅ FIX: Assign loaded FXML to 'root'
        Parent root = FXMLLoader.load(getClass().getResource("/com/example/trycatchexample/StudentForm.fxml"));
        Scene scene = new Scene(root, 400, 250);
        stage.setTitle("Student Form");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
