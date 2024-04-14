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
public class ViewMaintenanceTaskController implements Initializable {

    @FXML
    private TableView<?> ViewMaintenanceTaskTableView;
    @FXML
    private TableColumn<?, ?> MaintenanceIdTableColumn;
    @FXML
    private TableColumn<?, ?> MaintenanceStatusTableColumn;
    @FXML
    private TableColumn<?, ?> DateIssuedForMaintenanceTableColumn;
    @FXML
    private TableColumn<?, ?> MaintenanceBillTableColumn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void BackButtonOnClick(ActionEvent event) {
    }
    
}
