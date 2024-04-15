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
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

/**
 * FXML Controller class
 *
 * @author asiff
 */
public class OrderController implements Initializable {

    @FXML
    private Label orderListL;
    @FXML
    private Text itemListL;
    @FXML
    private TableColumn<?, ?> orderItemNameTB;
    @FXML
    private TableColumn<?, ?> quantityTB;
    @FXML
    private TableColumn<?, ?> itemDetailsTB;
    @FXML
    private TableColumn<?, ?> priceTb;
    @FXML
    private Button confirmOrderButton;
    @FXML
    private ComboBox<?> itemCB;
    @FXML
    private Text quantityL;
    @FXML
    private TextField quantityTF;
    @FXML
    private CheckBox orderCE;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
