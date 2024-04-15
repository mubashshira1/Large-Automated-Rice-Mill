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
public class SupplierController implements Initializable {

    @FXML
    private Label supplierListL;
    @FXML
    private Text supplierIDL;
    @FXML
    private TextField supplierIDTF;
    @FXML
    private TableColumn<?, ?> supplierNameTB;
    @FXML
    private TableColumn<?, ?> supplierIDTB;
    @FXML
    private TableColumn<?, ?> supplierEmailTB;
    @FXML
    private TableColumn<?, ?> supplierContactNumberTB;
    @FXML
    private TableColumn<?, ?> supplierAddressTB;
    @FXML
    private Button findsupplierButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
