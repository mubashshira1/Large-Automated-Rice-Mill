/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author User
 */
public class MaintenanceTaskController implements Initializable {

    private Label MaintenanceStatusComboBox;
    @FXML
    private Label DateIssuedForMaintenanceDatePicker;
    @FXML
    private TextField maintenanceIdTextField;
    @FXML
    private TextField maintenanceBillTextField;
    @FXML
    private ComboBox<String> maintenanceStatusComboBox;
    @FXML
    private DatePicker dateIssuedForMaintenanceDatePicker;


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
             ObservableList<String> maintenancestatus = FXCollections.observableArrayList(
     "Requires maintenance", "Currently does not requires maintenance");
     

    }    

    public Label getMaintenanceStatusComboBox() {
        return MaintenanceStatusComboBox;
    }

    public Label getDateIssuedForMaintenanceDatePicker() {
        return DateIssuedForMaintenanceDatePicker;
    }

    public TextField getMaintenanceIdTextField() {
        return maintenanceIdTextField;
    }

    public TextField getMaintenanceBillTextField() {
        return maintenanceBillTextField;
    }

    public ComboBox<String> getMaintenanceStatusComboBox() {
        return maintenanceStatusComboBox;
    }

    public DatePicker getDateIssuedForMaintenanceDatePicker() {
        return dateIssuedForMaintenanceDatePicker;
    }

    @FXML
    private void AddMaintenanceTaskButtonOnClick(ActionEvent event) {
        sceneSwitch("/com/MachineMaintenanceEngineer/views/Maintenance/AddMaintenanceTaskButtonOnClick.fxml"); 
    }

    private void BackButtonOnCLick(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Task.fxml"));
        Parent parent = loader.load();

        
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();


        Scene Task = new Scene(parent);

        currentStage.setScene(Task);
        currentStage.show();
    }


    
}
