package org.example.itec313_lab2_javafx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class FourClocks extends Application {

    @Override
    public void start(Stage primaryStage) {

        // Create four separate ClockPane objects
        ClockPane clock1 = new ClockPane();
        ClockPane clock2 = new ClockPane();
        ClockPane clock3 = new ClockPane();
        ClockPane clock4 = new ClockPane();

        // Create a GridPane to organise the four clocks
        GridPane pane = new GridPane();

        // Add spacing and centre the grid
        pane.setHgap(10);
        pane.setVgap(10);
        pane.setPadding(new Insets(10));
        pane.setAlignment(Pos.CENTER);

        // Place the clocks in a 2 x 2 arrangement
        pane.add(clock1, 0, 0);
        pane.add(clock2, 1, 0);
        pane.add(clock3, 0, 1);
        pane.add(clock4, 1, 1);

        // Create a Scene containing the GridPane
        Scene scene = new Scene(pane, 520, 520);

        // Put the Scene in the Stage and display it
        primaryStage.setTitle("Four Clocks");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
