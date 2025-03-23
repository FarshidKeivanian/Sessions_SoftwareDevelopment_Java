package com.example.javafxregistrationform;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

public class RegistrationController implements Initializable {

    @FXML
    private TextField nameField;

    @FXML
    private TextField emailField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private ComboBox<String> countryCombo;

    @FXML
    private RadioButton maleRadio;

    @FXML
    private RadioButton femaleRadio;

    @FXML
    private Button registerButton;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        countryCombo.getItems().addAll("Australia", "US", "UK", "Canada", "India");
    }

    @FXML
    private void handleRegister() {
        String name = nameField.getText();
        String email = emailField.getText();
        String country = countryCombo.getValue();
        String gender = maleRadio.isSelected() ? "Male" : "Female";

        System.out.println("Registered: " + name + " | " + email + " | " + gender + " | " + country);
    }
}
