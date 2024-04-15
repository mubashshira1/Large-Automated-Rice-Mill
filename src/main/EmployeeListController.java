/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package main;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

/**
 * FXML Controller class
 *
 * @author asiff
 */
public class EmployeeListController implements Initializable {

    @FXML
    private Label employeelistLalel;
    @FXML
    private Text employeenameL;
    @FXML
    private TextField employeenameTF;
    @FXML
    private Text employeeIDL;
    @FXML
    private TextField employeeIDTF;
    @FXML
    private Text departmentL;
    @FXML
    private ComboBox<?> departmentCB;
    @FXML
    private TableColumn<?, ?> positionTB;
    @FXML
    private TableColumn<?, ?> salaryTB;
    @FXML
    private TableColumn<?, ?> yearTB;
    @FXML
    private Label AddressL;
    @FXML
    private Button findemployeeButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
