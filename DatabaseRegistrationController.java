import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.ComboBox;

public class RegistrationController {
    @FXML private TextField nameField;
    @FXML private TextField emailField;
    @FXML private ComboBox<String> countryBox;

    @FXML
    public void registerUser() {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/UserDB", "root", "admin")) {
            String sql = "INSERT INTO Users (name, email, country) VALUES (?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, nameField.getText());
            stmt.setString(2, emailField.getText());
            stmt.setString(3, countryBox.getValue());
            stmt.executeUpdate();
            System.out.println("User Registered in Database!");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}