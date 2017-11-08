/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapedraw;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.control.Label;


/**
 *
 * @author MrEss
 */
public class FXMLDocumentController implements Initializable {
   
    @FXML
    private Label label;
    @FXML
    private Button button;
    @FXML
    private Canvas canvas;
    Draw draw = new Draw();
    @FXML
    private void handleButtonAction(ActionEvent event) {
    draw.draw(50, 50, canvas.getGraphicsContext2D());
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        
    } 
}