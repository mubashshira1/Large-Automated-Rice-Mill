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
import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author User
 */
public class TaskScheduleController implements Initializable {

    @FXML
    private DatePicker WorkingDatePicker;
    @FXML
    private DatePicker DueDatePicker;
    @FXML
    private TextField TaskNameTextField;
    @FXML
    private TextArea DetailsTextArea;
    @FXML
    private CheckBox CompleteCheckBox;
    @FXML
    private CheckBox IncompleteCheckBox;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void ViewScheduleButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void CloseButtonOnCLick(ActionEvent event) {
    }
    
}
