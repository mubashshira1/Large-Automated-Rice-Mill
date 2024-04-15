/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

/**
 * FXML Controller class
 *
 * @author HRShanto Productions
 */
public class Business_Continuity_Disaster_RecoveryController implements Initializable {

    @FXML
    private ComboBox<?> checkOptionsComboBox;
    @FXML
    private Text chooseOptionsTF;
    @FXML
    private TextField planTF;
    @FXML
    private Text inputTF;
    @FXML
    private Label result;
    @FXML
    private Text PanelTF;
    @FXML
    private Text titleOfTheProjectTF;
    @FXML
    private Label resultInfoTF;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void getReportButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void validateButtonOnAction(ActionEvent event) {
    }
    
}
