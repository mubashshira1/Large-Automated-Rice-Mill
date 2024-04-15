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
public class CustomerController implements Initializable {

    @FXML
    private Label customerLabel;
    @FXML
    private Text customerIDL;
    @FXML
    private TextField customerTF;
    @FXML
    private TableColumn<?, ?> customerNameTB;
    @FXML
    private TableColumn<?, ?> customerIDTB;
    @FXML
    private TableColumn<?, ?> EmailTB;
    @FXML
    private TableColumn<?, ?> contactNumberTB;
    @FXML
    private TableColumn<?, ?> addressTB;
    @FXML
    private Button Ffndcustomerdetailsbutton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
