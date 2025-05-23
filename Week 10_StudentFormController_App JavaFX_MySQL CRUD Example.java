package com.example.trycatchexample;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

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
    private Button addButton;  // Optional, but good to include if you set fx:id="addButton" in FXML

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

            // Show success alert
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Success");
            alert.setHeaderText(null);
            alert.setContentText("Student added: " + name);
            alert.showAndWait();

            // Clear form fields after submission
            nameField.clear();
            emailField.clear();
            courseField.clear();

        } catch (SQLException e) {
            // Show error alert
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Database Error");
            alert.setHeaderText("Failed to add student.");
            alert.setContentText(e.getMessage());
            alert.showAndWait();

            e.printStackTrace();
        }
    }
}
