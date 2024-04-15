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
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author SUSMOY
 */
public class LeaveRequestsController implements Initializable {

    @FXML
    private TextField NameTextField;
    @FXML
    private TextField IdTextField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void AcceptButtonOnClicked(ActionEvent event) {
    }

    @FXML
    private void RejectButtonOnClicked(ActionEvent event) {
    }
    
}
