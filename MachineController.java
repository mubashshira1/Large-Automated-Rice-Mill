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
import javafx.scene.control.TableColumn;

/**
 * FXML Controller class
 *
 * @author User
 */
public class MachineController implements Initializable {

    @FXML
    private TableColumn<?, ?> MachineIdTableColumn;
    @FXML
    private TableColumn<?, ?> MachineTableColumn;
    @FXML
    private TableColumn<?, ?> MachineStatusTableColumn;
    @FXML
    private TableColumn<?, ?> LastManufacturedTableColumn;
    @FXML
    private TableColumn<?, ?> ScheduleDateTableColumn;
    @FXML
    private ComboBox<?> MonthComboBox;

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
