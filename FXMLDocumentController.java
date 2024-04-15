/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package ricemill;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author SUSMOY
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Button LoginButton;
    @FXML
    private Label label;
    @FXML
    private ComboBox<?> SelectComboBox;
    @FXML
    private TextField LoginTextField;
    @FXML
    private TextField PasswordTextField;
    @FXML
    private Button SignUpButton;
    @FXML
    private Button ForgetPasswordutton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void LoginButtonOnClicked(ActionEvent event) {
    }

    @FXML
    private void SignUpButtonOnclicked(ActionEvent event) {
    }

    @FXML
    private void ForgetPassworduttonOnClicked(ActionEvent event) {
    }
    
}
