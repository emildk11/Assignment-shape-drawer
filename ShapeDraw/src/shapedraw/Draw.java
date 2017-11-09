/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapedraw;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/**
 *
 * @author MrEss
**/
public class Draw {

    public void draw (GraphicsContext context) 
    {
        context.setFill(Color.BLACK);
        context.setStroke(Color.BLACK);
        context.setLineWidth(2);
        context.scale(3, 3);
    }

}
