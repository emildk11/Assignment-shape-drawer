/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapedraw;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
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
    public Canvas canvas;
    Draw draw = new Draw();
    Shapes triangle = new Shapes();
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
    private MenuItem selectTriangle;
    @FXML
    private MenuItem selectCircle;
    @FXML
    private MenuItem selectRectangle;
    @FXML
    private void handleButtonAction(ActionEvent event) {
    draw.draw(canvas.getGraphicsContext2D());
    triangle.triangle(50, 50, canvas.getGraphicsContext2D());
    triangle.circle(75, 75, canvas.getGraphicsContext2D());
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        
    } 

    @FXML
    private void handleSelectTriangleAction(ActionEvent event) {
        selectShape.setText("Triangle");
    }

    @FXML
    private void handleSelectCircleAction(ActionEvent event) {
        selectShape.setText("Circle");
    }

    @FXML
    private void handleSelectRectangleAction(ActionEvent event) {
        selectShape.setText("Rectangle");
    }

  
            
    }
