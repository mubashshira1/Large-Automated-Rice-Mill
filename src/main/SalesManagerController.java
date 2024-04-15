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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

/**
 * FXML Controller class
 *
 * @author asiff
 */
public class SalesManagerController implements Initializable {

    @FXML
    private Label managerListL;
    @FXML
    private Text managerNameL;
    @FXML
    private TextField managerNameTF;
    @FXML
    private Text managerIDL;
    @FXML
    private TextField managerTF;
    @FXML
    private TableColumn<?, ?> teamNameTB;
    @FXML
    private TableColumn<?, ?> teamMemderNameTB;
    @FXML
    private TableColumn<?, ?> teamCapacityTB;
    @FXML
    private TableColumn<?, ?> salaryTB;
    @FXML
    private TableColumn<?, ?> yearTb;
    @FXML
    private Button findmanagerButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
