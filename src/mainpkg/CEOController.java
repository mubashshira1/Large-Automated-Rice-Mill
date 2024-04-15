/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package mainpkg;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.text.Text;

/**
 *
 * @author HRShanto Productions
 */
public class CEOController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private Text titleOfTheProjectT;
    @FXML
    private Text clickToSeeT;
    @FXML
    private Text ceoPanelT;
    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void strategicVisionB(ActionEvent event) {
    }

    @FXML
    private void organizationalCultureB(ActionEvent event) {
    }

    @FXML
    private void operationalOptimizationB(ActionEvent event) {
    }

    @FXML
    private void stakeholderInfoB(ActionEvent event) {
    }

    @FXML
    private void technologicalAdvancementB(ActionEvent event) {
    }

    @FXML
    private void cSRInitiativeB(ActionEvent event) {
    }

    @FXML
    private void complianceGovernanceB(ActionEvent event) {
    }

    @FXML
    private void revenueGrowthB(ActionEvent event) {
    }
    
}
