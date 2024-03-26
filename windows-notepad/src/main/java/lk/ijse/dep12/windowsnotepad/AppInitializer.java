package lk.ijse.dep12.windowsnotepad;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
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

        URL resource = getClass().getResource("/view/MainView.fxml");
        AnchorPane container = FXMLLoader.load(resource);
        Scene mainScene = new Scene(container);
        stage.setScene(mainScene);
//        stage.getIcons().add(new Image("/image/notepad.jpg"));
        stage.setTitle("Notepad");
        stage.show();
        stage.centerOnScreen();
    }
}
