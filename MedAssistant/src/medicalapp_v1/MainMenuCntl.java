package medicalapp_v1;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MainMenuCntl {
    @FXML
    private final Stage stage;
    private static MainMenuCntl theMainMenuCntl;
    
    private MainMenuCntl(Stage theExistingStage) {
        stage = theExistingStage;
        this.setUpMainMenuScene();
        stage.show();
    }
    
    public static MainMenuCntl getMainMenuCntl(Stage theStage) {
        theMainMenuCntl = new MainMenuCntl(theStage);
        return theMainMenuCntl;

    }
    
    @FXML
    public void setUpMainMenuScene() {
        Parent root;
        Scene scene;
        try {
            root = FXMLLoader.load(getClass().getResource("MainMenuUI.fxml"));
            scene = new Scene(root);
            stage.setTitle("Main Menu");
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            System.out.println("Error");
        }
    }
}