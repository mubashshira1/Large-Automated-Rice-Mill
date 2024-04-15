/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author User
 */
public class MachineController implements Initializable {

    @FXML
    private TableColumn<Machine, Integer> MachineIdTableColumn;
    @FXML
    private TableColumn<Machine, String> MachineStatusTableColumn;
    @FXML
    private TableColumn<Machine, Integer> LastManufacturedTableColumn;
    @FXML
    private TableColumn<Machine, Integer> MaintenanceBillTableColumn;
    
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        // TODO
    }    

    public TableColumn<Machine, Integer> getMachineIdTableColumn() {
        return MachineIdTableColumn;
    }

    public void setMachineIdTableColumn(TableColumn<Machine, Integer> MachineIdTableColumn) {
        this.MachineIdTableColumn = MachineIdTableColumn;
    }

    public TableColumn<Machine, String> getMachineStatusTableColumn() {
        return MachineStatusTableColumn;
    }

    public void setMachineStatusTableColumn(TableColumn<Machine, String> MachineStatusTableColumn) {
        this.MachineStatusTableColumn = MachineStatusTableColumn;
    }

    public TableColumn<Machine, Integer> getLastManufacturedTableColumn() {
        return LastManufacturedTableColumn;
    }

    public void setLastManufacturedTableColumn(TableColumn<Machine, Integer> LastManufacturedTableColumn) {
        this.LastManufacturedTableColumn = LastManufacturedTableColumn;
    }

    public TableColumn<Machine, Integer> getMaintenanceBillTableColumn() {
        return MaintenanceBillTableColumn;
    }

    public void setMaintenanceBillTableColumn(TableColumn<Machine, Integer> MaintenanceBillTableColumn) {
        this.MaintenanceBillTableColumn = MaintenanceBillTableColumn;
        
    }


    @FXML
    private void BackButtonOnClick(ActionEvent event)throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("MachineMaintenanceEngineer.fxml"));
        Parent parent = loader.load();

        
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();


        Scene MachineMaintenanceEngineer = new Scene(parent);

        currentStage.setScene(MachineMaintenanceEngineer);
        currentStage.show();  
    }


    
}
