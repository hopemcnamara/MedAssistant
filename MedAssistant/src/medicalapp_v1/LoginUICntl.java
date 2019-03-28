package medicalapp_v1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginUICntl {

    @FXML
    private Label lblStatus;
    @FXML
    private TextField txtUserName;
    @FXML
    private TextField txtPassword;

    public LoginUICntl() {

    }

    public void Login(ActionEvent event) throws Exception {
        if (txtUserName.getText().equals("user") && txtPassword.getText().equals("pass")) {
            lblStatus.setText("Login Success");
            Stage stage = (Stage) lblStatus.getScene().getWindow();
            stage.hide();
            MainMenuCntl theMainMenuCntl = MainMenuCntl.getMainMenuCntl(stage);
        } else {
            lblStatus.setText("Login Failed");
        }
    }
}
