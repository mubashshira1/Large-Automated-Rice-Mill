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
public class FeedbackSubmissionController implements Initializable {

    @FXML
    private Button SubmitButton;
    @FXML
    private TextField FeedbackName;
    @FXML
    private TextField FeedbackPhoneNumber;
    @FXML
    private TextField feedbackText;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void SubmitButtonOnClicked(ActionEvent event) {
    }

    @FXML
    private void BackButtonOnClicked(ActionEvent event) {
    }
    
}
