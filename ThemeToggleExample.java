import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ThemeToggleExample extends Application {
    @Override
    public void start(Stage primaryStage) {
        StackPane root = new StackPane();
        Button toggleButton = new Button("Toggle Dark Mode");

        Scene scene = new Scene(root, 300, 200);
        scene.getStylesheets().add(getClass().getResource("light.css").toExternalForm());

        toggleButton.setOnAction(e -> {
            scene.getStylesheets().clear();
            scene.getStylesheets().add(getClass().getResource("dark.css").toExternalForm());
        });

        root.getChildren().add(toggleButton);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Theme Toggle Example");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}