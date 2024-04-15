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
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;

/**
 * FXML Controller class
 *
 * @author asiff
 */
public class Item_ListController implements Initializable {

    @FXML
    private Button findDetailsbutton;
    @FXML
    private Label itemlistL;
    @FXML
    private TableColumn<?, ?> itemNameTB;
    @FXML
    private TableColumn<?, ?> itemDetailsTB;
    @FXML
    private TableColumn<?, ?> itemPriceTB;
    @FXML
    private TableColumn<?, ?> itemAvailableTB;
    @FXML
    private ComboBox<?> itemlistCB;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
