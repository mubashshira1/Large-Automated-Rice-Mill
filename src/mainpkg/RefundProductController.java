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
public class RefundProductController implements Initializable {

    @FXML
    private TextField ProductNameTF;
    @FXML
    private TextField PriceTF;
    @FXML
    private TextField CauseTF;
    @FXML
    private Button RefundButton;
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
    private void RefundButtonOnClicked(ActionEvent event) {
    }

    @FXML
    private void BackButtonOnClicked(ActionEvent event) {
    }
    
}
