package lk.ijse.dep12.windowsnotepad.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class MainViewController {
    public void btnAboutOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage = new Stage();
        AnchorPane container = FXMLLoader.load(getClass().getResource("/view/ApplicationModel.fxml"));
        Scene scene = new Scene(container);
        stage.setScene(scene);
        stage.setTitle("About Window");
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.show();
        stage.centerOnScreen();
    }
}
