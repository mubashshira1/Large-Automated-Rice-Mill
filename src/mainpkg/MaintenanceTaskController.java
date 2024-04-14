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
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

/**
 * FXML Controller class
 *
 * @author User
 */
public class MaintenanceTaskController implements Initializable {

    @FXML
    private Label MaintenanceIdTextField;
    @FXML
    private Label MaintenanceStatusComboBox;
    @FXML
    private Label MaintenanceBillTextField;
    @FXML
    private DatePicker DateIssuedForMaintenanceDatePicker;


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void AddMaintenanceTaskButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void BackButtonOnCLick(ActionEvent event) {
    }

    
}
