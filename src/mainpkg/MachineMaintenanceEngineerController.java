/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;

/**
 * FXML Controller class
 *
 * @author User
 */
public class MachineMaintenanceEngineerController implements Initializable {

    @FXML
    private Label l;
    @FXML
    private MenuItem EditProfileMenuItem;
    @FXML
    private MenuItem CommunicateMenuItem;
    @FXML
    private MenuItem SignOutMenuItem;
    @FXML
    private Menu homeMenu;
    @FXML
    private Menu profileMenu;
    @FXML
    private Menu viewMenu;
    @FXML
    private MenuItem productsMenuItem;
    @FXML
    private MenuItem maintenanceReportMenuItem;
    @FXML
    private MenuItem maintenanceScheduleMenuItem;
    @FXML
    private MenuItem maintenanceHistoryMenuItem;
    @FXML
    private MenuItem shipmentHistoryMenuItem;
    @FXML
    private MenuItem shipmentReportMenuItem;
    @FXML
    private MenuItem tasksMenuItem;
    @FXML
    private MenuItem statusMenuItem;
    @FXML
    private MenuItem safetyProtocolsMenuItem;
    @FXML
    private Menu editMenu;
    @FXML
    private MenuItem maintenanceReportsMenuItem;
    @FXML
    private MenuItem maintenanceSchedulesMenuItem;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
            sceneSwithch("/com/MachineMaintenanceEngineer/views/MachineMaintenanceEngineer/Home.fxml");
    }    
    
}
