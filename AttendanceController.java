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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

/**
 * FXML Controller class
 *
 * @author SUSMOY
 */
public class AttendanceController implements Initializable {

    @FXML
    private TableView<?> AttendanceTableView;
    @FXML
    private TableColumn<?, ?> nameAttendance;
    @FXML
    private TableColumn<?, ?> IdAttendance;
    @FXML
    private TableColumn<?, ?> DepartmentAttendance;
    @FXML
    private TableColumn<?, ?> AbsentAttendance;
    @FXML
    private TableColumn<?, ?> presentAttendance;
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
    private void BackButtonOnClicked(ActionEvent event) {
    }
    
}
