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
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author User
 */
public class AddProductsController implements Initializable {

    @FXML
    private ComboBox<?> QuantityComboBox;
    @FXML
    private DatePicker DispatchedDatePicker;
    @FXML
    private DatePicker ShippingDatePicker;
    @FXML
    private TextField AddProductTextField;
    @FXML
    private TextArea DetailsTextArea;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void ViewProductListButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void AddProductsButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void ViewProductBillButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void BackButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void CloseButtonOnClick(ActionEvent event) {
    }
    
}
