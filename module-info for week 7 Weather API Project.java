module com.example.weatherapiproject {
    requires javafx.controls;
    requires javafx.fxml;

    requires java.net.http;
    requires org.json;

    opens com.example.weatherapiproject to javafx.fxml;
    exports com.example.weatherapiproject;
}
