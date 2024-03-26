package lk.ijse.dep12.dashboardui.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginViewController {

    @FXML
    public TextField txtPassword;

    @FXML
    public TextField txtUserName;

    @FXML
    void btnLoginOnAction(ActionEvent event) {
        String userName = txtUserName.getText();
        String password = txtPassword.getText();

        if (userName.equals("admin") && password.equals("admin")){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Login Success!");
            alert.setHeaderText(null);
            alert.setContentText("Yeei! Login Successfully!");
            alert.showAndWait();


            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/DashboardView.fxml"));
            Parent root = null;

            try {

                root = loader.load();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();

            // Close the login stage
            Stage loginStage = (Stage) txtUserName.getScene().getWindow();
            loginStage.close();


        }else {
            // Failed login
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Login Error");
            alert.setHeaderText(null);
            alert.setContentText("Invalid username or password!");
            alert.showAndWait();
        }
    }
}
