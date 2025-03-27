package com.example.javafxregistrationform2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Parent;

import java.net.URL;

public class LoginApp extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        // ✅ SAFELY LOAD FXML FILE
        URL fxmlLocation = getClass().getResource("/com/example/javafxregistrationform2/loginForm.fxml");
        System.out.println("🔍 FXML URL = " + fxmlLocation); // Debug print

        if (fxmlLocation == null) {
            throw new RuntimeException("❌ FXML file not found! Please check the path or build settings.");
        }

        FXMLLoader loader = new FXMLLoader(fxmlLocation);
        Parent root = loader.load();

        // ✅ SHOW WINDOW
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Student Login Form");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
