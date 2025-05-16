package com.example.trycatchexample;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class StudentFormController {

    @FXML
    private TextField nameField;

    @FXML
    private TextField emailField;

    @FXML
    private TextField courseField;

    @FXML
    private void handleAdd() {
        System.out.println("Student added:");
        System.out.println("Name: " + nameField.getText());
        System.out.println("Email: " + emailField.getText());
        System.out.println("Course: " + courseField.getText());
    }
}
