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
public class MarketAnalysisController implements Initializable {

    @FXML
    private Label marketAnalysisL;
    @FXML
    private Text marketIDL;
    @FXML
    private TextField marketIDTF;
    @FXML
    private TableColumn<?, ?> marketNameTB;
    @FXML
    private TableColumn<?, ?> targetAudienceTB;
    @FXML
    private TableColumn<?, ?> competitorTB;
    @FXML
    private TableColumn<?, ?> marketTrendTb;
    @FXML
    private TableColumn<?, ?> marketSizeTB;
    @FXML
    private Button marketDetailsButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
