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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

/**
 * FXML Controller class
 *
 * @author User
 */
public class ViewShipmentReportController implements Initializable {

    @FXML
    private TableView<?> ViewShipmentReportTableView;
    @FXML
    private TableColumn<String, ?> ProductTableColumn;
    @FXML
    private TableColumn<?, ?> IssuedDateTableColumn;
    @FXML
    private TableColumn<?, ?> ShippingDateTableColumn;
    @FXML
    private TableColumn<?, ?> QuantityTableColumn;
    @FXML
    private TableColumn<?, ?> BillsTableColumn;
    @FXML
    private TableColumn<?, ?> ShippedStatusTableColumn;
    @FXML
    private TableColumn<?, ?> DetailsTableColumn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void BackButtonOnClick(ActionEvent event) {
    }
    
}
