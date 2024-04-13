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
import javafx.scene.control.TableColumn;

/**
 * FXML Controller class
 *
 * @author User
 */
public class ShipmentController implements Initializable {

    @FXML
    private TableColumn<?, ?> productsTableColumn;
    @FXML
    private TableColumn<?, ?> IssuedDateTableColumn;
    @FXML
    private TableColumn<?, ?> ToBeShippedDateTableColumn;
    @FXML
    private TableColumn<?, ?> QuantityTableColumn;
    @FXML
    private TableColumn<?, ?> BillsTableColumn;
    @FXML
    private TableColumn<?, ?> ShippedStatusTableColumn;
    @FXML
    private TableColumn<?, ?> DetailsTableColumn;
    @FXML
    private ComboBox<?> ShipperIdComboBox;
    @FXML
    private ComboBox<?> ShippingIdComboBox;
    @FXML
    private DatePicker DatePicker;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void EditButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void SubmitButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void ShipmentBillButtonOnClick(ActionEvent event) {
    }
    
}
