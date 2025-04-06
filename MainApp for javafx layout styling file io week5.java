package com.example.javafxlayoutstylingfileioweek5;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class MainApp extends Application {

    @Override
    public void start(Stage stage) {
        VBox vbox = new VBox(10);
        Label label = new Label("Name:");
        TextField field = new TextField();
        Button saveBtn = new Button("Save");

        // Step 4: CSS Styling
        Scene scene = new Scene(vbox, 300, 150);
        scene.getStylesheets().add(getClass().getResource("/style.css").toExternalForm());

        // Step 5 & 6: File I/O and Serialization
        saveBtn.setOnAction(e -> {
            String name = field.getText();

            // Save to text file
            try {
                Files.write(Paths.get("output.txt"), name.getBytes());
            } catch (IOException ex) {
                ex.printStackTrace();
            }

            // Save as serialized object
            try {
                Student s = new Student(name);
                ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("student.ser"));
                out.writeObject(s);
                out.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        });

        vbox.getChildren().addAll(label, field, saveBtn);
        stage.setScene(scene);
        stage.setTitle("VBox Layout");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
