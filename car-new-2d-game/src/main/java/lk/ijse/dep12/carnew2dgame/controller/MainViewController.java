package lk.ijse.dep12.carnew2dgame.controller;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.AnchorPane;

public class MainViewController {

    @FXML
    private AnchorPane root;

    @FXML
    public ImageView imgCar;

    @FXML
    public ImageView imgRoad1;

    @FXML
    public ImageView imgRoad2;

    public void initialize() {
//        Platform.runLater(()->{
//            root.getScene().setOnKeyPressed(keyEvent -> {
//                if (keyEvent.getCode() == KeyCode.RIGHT){
//                    if (imgCar.getLayoutX() < 165.0){
//                        imgCar.setLayoutX(imgCar.getLayoutX() + 10);
//                    }
//
//                }else if (keyEvent.getCode() == KeyCode.LEFT){
//                    if (imgCar.getLayoutX() > 65.0){
//                        imgCar.setLayoutX(imgCar.getLayoutX() - 10);
//                        System.out.println(imgCar.getLayoutX());
//                    }
//
//                }else if (keyEvent.getCode() == KeyCode.UP){
//                    if (imgCar.getLayoutY() > 65.0){
//                        imgCar.setLayoutY(imgCar.getLayoutY() - 10);
//                    }
//                    System.out.println(imgCar.getLayoutY());
//
//                }/*else if (keyEvent.getCode() == KeyCode.DOWN){
//                    car.setLayoutY(car.getLayoutY() + 10);
//                }*/ else if (keyEvent.getCode() == KeyCode.DOWN){
//                    imgRoad1.setLayoutY(imgRoad1.getLayoutY() + 10);
//                }
//            });
//        });

        imgRoad2.setLayoutX(imgRoad2.getLayoutX());
        imgRoad2.setLayoutY(imgRoad2.getLayoutY() -553); // Initial position of imgRoad2
        double imgCarStartX = imgCar.getLayoutX();

        Platform.runLater(() -> {
            root.getScene().setOnKeyPressed(keyEvent -> {
                if (keyEvent.getCode() == KeyCode.RIGHT) {
                    if (imgCar.getLayoutX() + 10 < 234.0) {
                        imgCar.setLayoutX(imgCar.getLayoutX() + 10);
                    }
                } else if (keyEvent.getCode() == KeyCode.LEFT) {
                    System.out.println(imgCar.getLayoutX());
                    if (imgCar.getLayoutX() - 10 > 100)
                        imgCar.setLayoutX(imgCar.getLayoutX() - 10);
                }
                if (keyEvent.getCode() == KeyCode.UP) {
                    imgRoad2.setLayoutY(imgRoad2.getLayoutY() + 10); // Move imgRoad2 down
                    imgRoad1.setLayoutY(imgRoad1.getLayoutY() + 10); // Move imgRoad1 down with imgRoad2
                    if (imgRoad2.getLayoutY() >= imgRoad2.getBoundsInLocal().getHeight()) {
                        imgRoad2.setLayoutY(0); // Reset imgRoad2 position to the top
                        imgRoad1.setLayoutY(-imgRoad1.getBoundsInLocal().getHeight()); // Position imgRoad1 above imgRoad2
                    }
                    if (imgRoad1.getLayoutY() >= imgRoad1.getBoundsInLocal().getHeight()) {
                        imgRoad1.setLayoutY(0); // Reset imgRoad1 position to the top when it completely goes down
                    }
                }


            });
        });

    }
}
