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
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author SUSMOY
 */
public class CashPaymentController implements Initializable {

    @FXML
    private TextField NameTF;
    @FXML
    private TextField PhoneNumbeTF;
    @FXML
    private TextField EmailTF;
    @FXML
    private Button PaymentButton;
    @FXML
    private Button LogOut;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void PaymentButtonOnClicked(ActionEvent event) {
    }

    @FXML
    private void BackButtonOnClicked(ActionEvent event) {
    }
    
}
