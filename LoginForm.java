package com.example.javafxregistrationform2;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginForm {

    @FXML private TextField usernameField;
    @FXML private PasswordField passwordField;

    @FXML
    public void handleLogin() {
        String username = usernameField.getText();
        String password = passwordField.getText();

        // Example validation
        if ("student".equals(username) && "1234".equals(password)) {
            System.out.println("✅ Login successful!");
        } else {
            System.out.println("❌ Invalid credentials!");
        }
    }
}
