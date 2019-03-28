package medicalapp_v1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class MainMenuUICntl {

    @FXML
    private Label mainMenuLabel;
    @FXML
    private Button getDiagnosisButton;

    public void DiagnosisButtonAction(ActionEvent event) throws Exception {
        Stage stage = (Stage) mainMenuLabel.getScene().getWindow();
        stage.hide();
        DiagnosisCntl theDiagnosisCntl = DiagnosisCntl.getDiagnosisCntl(stage);
    }
}
