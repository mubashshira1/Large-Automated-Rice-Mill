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
public class ReportAnalysisController implements Initializable {

    @FXML
    private Label reportAnalysisL;
    @FXML
    private Text reportIDL;
    @FXML
    private TextField reportTF;
    @FXML
    private TableColumn<?, ?> reportDateTB;
    @FXML
    private TableColumn<?, ?> analyzedByTB;
    @FXML
    private TableColumn<?, ?> findingsTB;
    @FXML
    private TableColumn<?, ?> conclusionTB;
    @FXML
    private TableColumn<?, ?> recommandationsTB;
    @FXML
    private Button findReportButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
