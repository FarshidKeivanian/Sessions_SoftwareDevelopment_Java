import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.ComboBox;

public class RegistrationController {
    @FXML private TextField nameField;
    @FXML private TextField emailField;
    @FXML private ComboBox<String> countryBox;

    @FXML
    public void registerUser() {
        System.out.println("User Registered: " + nameField.getText() + " - " + emailField.getText());
    }
}