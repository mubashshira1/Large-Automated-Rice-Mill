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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

/**
 * FXML Controller class
 *
 * @author User
 */
public class SchedulesController implements Initializable {

    @FXML
    private TableView<?> MachineMaintenanceTableView;
    @FXML
    private TableColumn<?, Integer> MachineIdTableColumn;
    @FXML
    private TableColumn<?, ?> OnWorkScheduleTableColumn;
    @FXML
    private TableColumn<?, ?> AvailableSlotsForMaintenanceTableColumn;
    @FXML
    private TableView<?> TaskTableView;
    @FXML
    private TableColumn<?, ?> TaskTableColumn;
    @FXML
    private TableColumn<?, ?> DateTableColumn;
    @FXML
    private TableColumn<?, ?> TaskStatusTableColumn;
    @FXML
    private TableView<?> ShipmentScheduleTableView;
    @FXML
    private TableColumn<?, ?> ShipmentIdTableColumn;
    @FXML
    private TableColumn<?, ?> ShipmentStatusTableColumn;
    @FXML
    private TableColumn<?, ?> ShipmentDateTableColumn;

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
    private void SubmitButtonOnClick(ActionEvent event) {
    }
    
}
