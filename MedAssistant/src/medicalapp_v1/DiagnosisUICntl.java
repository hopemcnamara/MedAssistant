package medicalapp_v1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.text.Text;

public class DiagnosisUICntl {
    
    @FXML Text diagnosisText;
    @FXML CheckBox nas_check;
    @FXML CheckBox cong_check;
    @FXML CheckBox chills_check;
    @FXML CheckBox fever_check;
    @FXML CheckBox dizz_check;
    @FXML CheckBox sweat_check;
    @FXML CheckBox thirst_check;
    @FXML CheckBox dm_check;
    @FXML CheckBox tired_check;
    @FXML CheckBox bv_check;
    @FXML CheckBox ab_check;
    @FXML CheckBox au_check;
    
    public DiagnosisUICntl(){
        
    }

    public void getDiagnosisAction(ActionEvent event) throws Exception {
        if(!nas_check.isSelected() && !cong_check.isSelected()&& !chills_check.isSelected()&& !fever_check.isSelected()&& !dizz_check.isSelected()&& !sweat_check.isSelected()&& !thirst_check.isSelected()&& !dm_check.isSelected()&& !tired_check.isSelected()&& !bv_check.isSelected()&& !ab_check.isSelected()&& !au_check.isSelected()) {
            diagnosisText.setText("Healthy");
        }
        else if(nas_check.isSelected()&& cong_check.isSelected()&& chills_check.isSelected()&& fever_check.isSelected()&& tired_check.isSelected()) {
            diagnosisText.setText("Cold or Flu");
        }
        else {
            diagnosisText.setText("Unknown or too many diagnoses");
        }
    }
}
