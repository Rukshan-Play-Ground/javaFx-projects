package lk.ijse.dep12.mediaplayer;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.net.URL;

public class AppInitializer extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException {

        URL resources = getClass().getResource("/view/MainView.fxml");
        AnchorPane container = FXMLLoader.load(resources);
        Scene mainScence = new Scene(container);
        stage.setScene(mainScence);
        container.setOpacity(0.8);
        mainScence.setFill(Color.TRANSPARENT);
        stage.initStyle(StageStyle.TRANSPARENT);
        stage.setTitle("Media player");
        stage.show();
        stage.centerOnScreen();
    }
}
