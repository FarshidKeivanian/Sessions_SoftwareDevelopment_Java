module com.example.trycatchexample {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.logging; // Add this line

    opens com.example.trycatchexample to javafx.fxml;
    exports com.example.trycatchexample;
}