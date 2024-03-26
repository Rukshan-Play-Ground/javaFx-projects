package lk.ijse.dep12.dashboardui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class AppInitializer extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException {

        URL resource = getClass().getResource("/view/LoginView.fxml");
        AnchorPane container = FXMLLoader.load(resource);
        Scene scene = new Scene(container);
        stage.setScene(scene);
        stage.setTitle("Login Window");
        stage.show();
        stage.centerOnScreen();
    }
}
