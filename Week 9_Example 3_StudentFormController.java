package com.example.trycatchexample;

import javafx.fxml.FXML;
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
    private void handleAdd() {
        String name = nameField.getText();
        String email = emailField.getText();
        String course = courseField.getText();

        try (Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/your database", "your user", "your password")) {

            String sql = "INSERT INTO students(name, email, course) VALUES (?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, name);
            stmt.setString(2, email);
            stmt.setString(3, course);
            stmt.executeUpdate();

            System.out.println("Student added: " + name);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
