/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package main;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

/**
 *
 * @author asiff
 */
public class FXMLDocumentController implements Initializable {
    
    private Label label;
    @FXML
    private Label largeAutomaticRiceMill;
    @FXML
    private Text idL;
    @FXML
    private TextField idTF;
    @FXML
    private Text passwordL;
    @FXML
    private TextField passwordTF;
    @FXML
    private Button loginButton;
    @FXML
    private Button forgetpasswordButton;
    @FXML
    private Button signupButton;
    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
