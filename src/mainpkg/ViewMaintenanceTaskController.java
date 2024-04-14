/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

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
    private void BackButtonOnClick(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("MaintenanceTask.fxml"));
        Parent parent = loader.load();

        
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();


        Scene MaintenanceTask = new Scene(parent);

        currentStage.setScene(MaintenanceTask);
        currentStage.show();   
    }
    
}