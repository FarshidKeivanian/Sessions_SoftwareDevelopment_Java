package com.example.trycatchexample;

import javafx.animation.FadeTransition;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.util.Duration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentFormController {

    @FXML
    private TextField nameField;

    @FXML
    private TextField emailField;

    @FXML
    private TextField courseField;

    @FXML
    private Button addButton;

    @FXML
    private Label statusLabel; // New label for animated feedback

    @FXML
    private void handleAdd() {
        String name = nameField.getText();
        String email = emailField.getText();
        String course = courseField.getText();

        try (Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/schooldb", "root", "YourPassword")) {

            String sql = "INSERT INTO students2(name, email, course) VALUES (?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, name);
            stmt.setString(2, email);
            stmt.setString(3, course);
            stmt.executeUpdate();

            // Animated success message
            statusLabel.setText("✅ Student added: " + name);
            statusLabel.setOpacity(1.0); // Reset visibility in case reused

            FadeTransition ft = new FadeTransition(Duration.seconds(3), statusLabel);
            ft.setFromValue(1.0);
            ft.setToValue(0.0);
            ft.setCycleCount(1);
            ft.setAutoReverse(false);
            ft.play();

            // Clear form
            nameField.clear();
            emailField.clear();
            courseField.clear();

        } catch (SQLException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Database Error");
            alert.setHeaderText("Failed to add student.");
            alert.setContentText(e.getMessage());
            alert.showAndWait();
            e.printStackTrace();
        }
    }
}
