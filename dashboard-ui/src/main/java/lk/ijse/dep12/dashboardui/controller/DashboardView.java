package lk.ijse.dep12.dashboardui.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class DashboardView {
    public AnchorPane root;

    @FXML
    void btnCustomerOnAction(ActionEvent event) {
    loadPanel("/view/CustomerPanelView.fxml");
    }

    @FXML
    void btnDashboardOnAction(ActionEvent event) {
        loadPanel("/view/DashPanelView.fxml");
    }

    @FXML
    void btnLogoutOnAction(ActionEvent event) {
        try {

            Stage currentStage = (Stage) root.getScene().getWindow();
            currentStage.close();

            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/LoginView.fxml"));
            Parent root = loader.load();

            Stage stage = new Stage();
            stage.setScene(new Scene(root));

            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @FXML
    void btnOrderOnAction(ActionEvent event) {
        loadPanel("/view/OrderPanelView.fxml");
    }

    @FXML
    void btnReportsOnAction(ActionEvent event) {
        loadPanel("/view/ReportPanelView.fxml");
    }

    @FXML
    void btnStockOnAction(ActionEvent event) {
        loadPanel("/view/StockPanelView.fxml");
    }

    public void loadPanel(String fxmlFileName) {
        FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlFileName));
        try {
            Parent panel = loader.load();
            root.getChildren().setAll(panel);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
