package lk.ijse.dep12.mediaplayer.controller;

import javafx.fxml.FXML;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MainViewController {

    @FXML
    private ImageView frame;

    @FXML
    private ProgressBar proBar;

    @FXML
    private AnchorPane root;

    @FXML
    void closeOnMouseClicked(MouseEvent event) {
        ((Stage)root.getScene().getWindow()).close();
    }
}
