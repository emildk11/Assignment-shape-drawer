/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bll;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/**
 *
 * @author MrEss
**/



public class Draw {

    public void drawTriangle (int x, int y, GraphicsContext context) 
    {
        context.setFill(Color.BLACK);
        context.setStroke(Color.BLACK);
        context.setLineWidth(1);
        
        double[] xPoints = {x, x+50, x-50};
        double[] yPoints = {y, y+50,y+50};
        
        context.beginPath();
        context.strokePolygon(xPoints, yPoints, 3);
    }
    public void drawCircle (int x, int y, GraphicsContext context)
    {
        context.setLineWidth(2.0);
        context.setFill(Color.BLACK);
        context.strokeOval(x,y,x+50,y+50);
    }
    public void drawRectangle (int x, int y, GraphicsContext context)
    {
        context.setLineWidth(2);
        context.setFill(Color.BLACK);
        context.setStroke(Color.BLACK);
        context.strokeRect(x,y,x+50,y+50);
    
    }
    
    
    
    
}
