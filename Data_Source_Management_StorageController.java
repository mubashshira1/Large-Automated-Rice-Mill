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
public class Data_Source_Management_StorageController implements Initializable {

    @FXML
    private ComboBox<?> checkOptions;
    @FXML
    private Text chooseOptionsT;
    @FXML
    private TextField planTF;
    @FXML
    private Text input;
    @FXML
    private Label result;
    @FXML
    private Text plan;
    @FXML
    private Text PanelT;
    @FXML
    private Text titleOfTheProjectT;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void getReportB(ActionEvent event) {
    }

    @FXML
    private void submit(ActionEvent event) {
    }
    
}
