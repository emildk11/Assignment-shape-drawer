package shapedraw;

import javafx.scene.canvas.GraphicsContext;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MrEss
 */
public class Shapes {
    
    public void triangle(int x, int y, GraphicsContext context) 
    {
        double[] xPoints = {x, x+50, x-50};
        double[] yPoints = {y, y+50,y+50};
        
        context.beginPath();
        context.strokePolygon(xPoints, yPoints, 3);
    
    }
    public void circle(int x, int y, GraphicsContext context){
            context.strokeOval(x,y,x+50,y+50);
    
    }
            
    public void rectangle(int x, int y, GraphicsContext context){
            context.strokeRect(x,y,x+50,y+50);
    
    }
}
