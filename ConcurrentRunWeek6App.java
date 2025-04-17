package com.example.concurrent_run_week6;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ConcurrentRunWeek6App extends Application {

    private Label statusLabel = new Label("Click the button to run the thread.");

    @Override
    public void start(Stage primaryStage) {
        Button runButton = new Button("Start Background Task");

        runButton.setOnAction(e -> {
            Thread t = new Thread(new MyRunnableTask());
            t.start(); // Run in background
        });

        VBox root = new VBox(10, statusLabel, runButton);
        root.setStyle("-fx-padding: 20px; -fx-alignment: center");

        Scene scene = new Scene(root, 400, 200);
        primaryStage.setTitle("Concurrent Run - Week 6");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // Inner class: Runnable Task
    class MyRunnableTask implements Runnable {
        public void run() {
            System.out.println("Thread started: " + Thread.currentThread().getName());

            try {
                Thread.sleep(2000); // Simulate background task
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // Update UI safely
            Platform.runLater(() -> statusLabel.setText("Task finished on thread: " + Thread.currentThread().getName()));
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
