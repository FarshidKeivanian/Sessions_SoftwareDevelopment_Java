package com.example.javafxregistrationform2;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

public class RegistrationControllerTask1 implements Initializable {

    @FXML private TextField nameField;
    @FXML private TextField emailField;
    @FXML private PasswordField passwordField;
    @FXML private ComboBox<String> countryCombo;
    @FXML private RadioButton maleRadio;
    @FXML private RadioButton femaleRadio;
    @FXML private Button registerButton;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // Populate the combo box
        countryCombo.getItems().addAll("Australia", "US", "UK", "Canada", "India");

        // Group the radio buttons
        ToggleGroup genderGroup = new ToggleGroup();
        maleRadio.setToggleGroup(genderGroup);
        femaleRadio.setToggleGroup(genderGroup);
    }

    @FXML
    private void handleRegister() {
        String name = nameField.getText();
        String email = emailField.getText();
        String password = passwordField.getText();
        String country = countryCombo.getValue();
        String gender = maleRadio.isSelected() ? "Male" : "Female";

        System.out.println("Registered: " + name + " | " + email + " | " + gender + " | " + country);
    }
}
