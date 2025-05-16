module com.example.trycatchexample {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.logging;
    requires java.sql; // ✅ Required for JDBC usage

    opens com.example.trycatchexample to javafx.fxml;
    exports com.example.trycatchexample;
}
