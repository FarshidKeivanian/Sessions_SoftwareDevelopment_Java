package com.example.javafxregistrationform;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private TextField nameField;
    @FXML
    private Label responseLabel;

    @FXML
    protected void onSubmitButtonClick() {
        String name = nameField.getText();
        responseLabel.setText("Hello, " + name + "!");
    }
}
