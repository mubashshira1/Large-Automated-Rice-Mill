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
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;

/**
 * FXML Controller class
 *
 * @author User
 */
public class MaintenanceScheduleController implements Initializable {

    @FXML
    private TableColumn<?, ?> MachineIDTableColumn;
    @FXML
    private TableColumn<?, ?> OnWorkScheduleTableColumn;
    @FXML
    private TableColumn<?, ?> AvailableSlotsForMaintenanceTableColumn;
    @FXML
    private Label MaintenanceScheduleTableView;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void EditButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void BackButtonOnClick(ActionEvent event) {
    }
    
}
