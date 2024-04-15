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
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

/**
 * FXML Controller class
 *
 * @author SUSMOY
 */
public class EditEmployeeController implements Initializable {

    @FXML
    private TableView<?> EditEmployeeTableView;
    @FXML
    private Button AddEmployeeButton;
    @FXML
    private Button RemoveEmployeeButton;
    @FXML
    private Button BackButton;
    @FXML
    private Button LoadButton;
    @FXML
    private TableColumn<?, ?> NameEmployee;
    @FXML
    private TableColumn<?, ?> IDEmployee;
    @FXML
    private TableColumn<?, ?> EmailEmployee;
    @FXML
    private TableColumn<?, ?> GenderEmployee;
    @FXML
    private TableColumn<?, ?> PhoneNumberEmployee;
    @FXML
    private TableColumn<?, ?> DepartmentEmployee;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void AddEmployeeButtonOnClicked(ActionEvent event) {
    }

    @FXML
    private void RemoveEmployeeButtonOnClicked(ActionEvent event) {
    }

    @FXML
    private void BackButtonOnClicked(ActionEvent event) {
    }

    @FXML
    private void LoadbuttonOnClicked(ActionEvent event) {
    }
    
}
