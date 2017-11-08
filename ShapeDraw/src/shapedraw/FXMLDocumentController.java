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
import javafx.scene.control.ListView;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TextField;


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
    private ListView<?> list1;
    @FXML
    private MenuButton selectShape;
    @FXML
    private TextField txtSize;
    @FXML
    private Button addSize;
    @FXML
    private MenuButton canvType;
    @FXML
    private void handleButtonAction(ActionEvent event) {
    draw.draw(50, 50, canvas.getGraphicsContext2D());
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        
    } 
}