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
    Shapes shape = new Shapes();
    @FXML
    private ListView<String> list1;
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
    
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
       
    } 

    @FXML
    private void handleSelectTriangleAction(ActionEvent event) {
        selectShape.setText("Triangle");
        marin=1;
    }

    @FXML
    private void handleSelectCircleAction(ActionEvent event) {
        selectShape.setText("Circle");
        marin=2;
    }

    @FXML
    private void handleSelectRectangleAction(ActionEvent event) {
        selectShape.setText("Rectangle");
        marin=3;
    }
private int marin=0;
    @FXML
    private void handleAddButton(ActionEvent event) {
        addToList();
    }
    private void addToList()
    {
        switch(marin)
        {
            case 1:
            list1.getItems().add("Triangle"+"    "+Integer.parseInt(txtSize.getText()));
            break;
            case 2:
            list1.getItems().add("Circle"+"    "+Integer.parseInt(txtSize.getText()));
            break;
            case 3:
            list1.getItems().add("Rectangle"+"    "+Integer.parseInt(txtSize.getText()));
            break;
        }
       
    }
    
    
          
    }
