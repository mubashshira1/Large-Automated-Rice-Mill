/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

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
    private void BackButtonOnClick(ActionEvent event) {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Task.fxml"));
        Parent parent = loader.load();

        
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();


        Scene Task = new Scene(parent);

        currentStage.setScene(Task);
        currentStage.show();
    }

    @FXML
    private void AddTaskButtonOnClick(ActionEvent event) {
    }

    
}
