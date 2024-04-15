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
public class SalesTeamController implements Initializable {

    @FXML
    private Label label;
    @FXML
    private Text teamIDL;
    @FXML
    private TextField teamTF;
    @FXML
    private TableColumn<?, ?> teamNameTB;
    @FXML
    private TableColumn<?, ?> teamMembersNameTB;
    @FXML
    private TableColumn<?, ?> membercontactNumberTB;
    @FXML
    private TableColumn<?, ?> membersEmailTB;
    @FXML
    private TableColumn<?, ?> teamLeaderNameTB;
    @FXML
    private Button teamDetailsButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
