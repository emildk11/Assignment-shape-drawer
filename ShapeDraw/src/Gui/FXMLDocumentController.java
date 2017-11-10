/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import bll.Draw;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
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
    private Button clearButton;
    @FXML
    public Canvas canvas;
    Draw draw = new Draw();
    @FXML
    private ListView<String> list1;
    @FXML
    private ComboBox<String> selectShape;
    @FXML
    private TextField txtSize;
    @FXML
    private Button addSize;
    @FXML
    private ComboBox<String> setPattern; 
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {  
        selectShape.getItems().addAll("Triangle", "Circle", "Rectangle");
        setPattern.getItems().addAll("Grid", "Cross", "Random");
    }
    @FXML
    private void drawShapes(ActionEvent event)
    {
        GraphicsContext gc = canvas.getGraphicsContext2D();
        for (String item : list1.getItems()) 
        {
            int x = 0;
            int y = 0;
            Random random = new Random();
            String type = setPattern.getSelectionModel().getSelectedItem();
            String[] splitted = item.split("\\s+");
            String shape = splitted[0];
            int size = Integer.parseInt(splitted[1]);
            int buffer = size/2;
            if(type.equals("Random")) 
            {
                
                x = random.nextInt(((int) canvas.getWidth() -buffer))+buffer;
                y = random.nextInt(((int) canvas.getHeight() -buffer))+buffer;
            }
            if(type.equals("Cross")) {
                if(random.nextInt(2)== 0) 
                {
                    x = (int) canvas.getWidth()/2;
                    y = random.nextInt((int) canvas.getHeight());
                }
                else 
                {
                    x = random.nextInt((int) canvas.getWidth());
                    y = (int) canvas.getHeight()/2;
                }
            }
            if(type.equals("Grid")) 
            {
                int xSpace = (int) canvas.getWidth()/5;
                int ySpace = (int) canvas.getHeight()/5;
            int previousX = 0;
            int[] xCoordinates = new int[5];
            for (int i = 0; i < 5; i++) 
            {
                xCoordinates[i] = previousX;
                previousX += xSpace;
               
            }
            int previousY = 0;
            int[] yCoordinates = new int[5];
            for (int i = 0; i < 5; i++) {
                yCoordinates[i] = previousY;
                previousY += ySpace;
            }
            x = xCoordinates[random.nextInt(xCoordinates.length)];
            y = yCoordinates[random.nextInt(yCoordinates.length)];
            
            
            }
            if(shape.equals("Circle")) 
            {
                draw.drawCircle(x, y, gc);
            }
            if(shape.equals("Triangle")) 
            {
                draw.drawTriangle(x, y, gc);
            }
            if(shape.equals("Rectangle")) 
            {
                draw.drawRectangle(x, y, gc);
            }
        }
            
            
        
    }
    /*@FXML
    private void handleSelectTriangleAction(ActionEvent event) 
    {
        selectShape.setText("Triangle");
        marin=1;
    }
    @FXML
    private void handleSelectCircleAction(ActionEvent event) 
    {
        selectShape.setText("Circle");
        marin=2;
    }
    @FXML
    private void handleSelectRectangleAction(ActionEvent event) 
    {
        selectShape.setText("Rectangle");
        marin=3;
    }
    private void handleAddButton(ActionEvent event) 
    {
        AddToList();
    }*/
    @FXML
    public void AddToList(ActionEvent event)
    {
        String shape = selectShape.getSelectionModel().getSelectedItem();
        String size = txtSize.getText();
        list1.getItems().add(shape + " " + size);
        
    }
   
@FXML
    private void clearCanvas(ActionEvent event) 
    {
        canvas.getGraphicsContext2D().clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
        list1.getItems().clear();
    }
}
