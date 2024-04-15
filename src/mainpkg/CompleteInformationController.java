/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

/**
 * FXML Controller class
 *
 * @author SUSMOY
 */
public class CompleteInformationController implements Initializable {

    @FXML
    private TableView<?> CompleteInformationTableView;
    @FXML
    private TableColumn<?, ?> EmployeeNameInformation;
    @FXML
    private TableColumn<?, ?> PhoneNumberInformation;
    @FXML
    private TableColumn<?, ?> EmailInformation;
    @FXML
    private TableColumn<?, ?> GenderInformation;
    @FXML
    private TableColumn<?, ?> EmployeeTypeInformation;
    @FXML
    private TableColumn<?, ?> OthersInformation;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
