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
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

/**
 * FXML Controller class
 *
 * @author asiff
 */
public class Customer_FeedbackController implements Initializable {

    @FXML
    private Label customerfeedbackLabel;
    @FXML
    private Text customerNameL;
    @FXML
    private TextField customerNameTF;
    @FXML
    private Text customerIDL;
    @FXML
    private TextField customerIDTF;
    @FXML
    private Text customerFeedbackL;
    @FXML
    private Button submitButton;
    @FXML
    private TextField customerFeedbackTF;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
