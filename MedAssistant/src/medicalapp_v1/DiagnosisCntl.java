package medicalapp_v1;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class DiagnosisCntl {

    @FXML
    private final Stage stage;
    private static DiagnosisCntl theDiagnosisCntl;

    private DiagnosisCntl(Stage theExistingStage) {
        stage = theExistingStage;
        this.setUpDiagnosisScene();
        stage.show();
    }

    public static DiagnosisCntl getDiagnosisCntl(Stage theStage) {
        theDiagnosisCntl = new DiagnosisCntl(theStage);
        return theDiagnosisCntl;

    }

    @FXML
    public void setUpDiagnosisScene() {
        Parent root;
        Scene scene;
        try {
            root = FXMLLoader.load(getClass().getResource("DiagnosisUI.fxml"));
            scene = new Scene(root);
            stage.setTitle("Diagnosis");
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            System.out.println("Error");
        }
    }
}
