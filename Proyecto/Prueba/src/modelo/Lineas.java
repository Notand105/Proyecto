/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import javafx.scene.Cursor;
import javafx.scene.Node;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Line;
import javafx.scene.shape.Shape;
import prueba.Prueba;

public class Lineas {
    
        public void MovLinea(Line line, Node arco){
                    final Measure dragMeasure1 = new Measure();
                    final Measure position1 = new Measure();
                    line.setOnMousePressed(mouseEvent -> {
                        dragMeasure1.x = mouseEvent.getSceneX() - position1.x;
                        dragMeasure1.y = mouseEvent.getSceneY() - position1.y;
                        line.setCursor(Cursor.MOVE);
                    });

                    line.setOnMouseDragged(mouseEvent -> {
                        position1.x = mouseEvent.getSceneX() - dragMeasure1.x;
                        position1.y = mouseEvent.getSceneY() - dragMeasure1.y;
                        //line.setTranslateX(position.x);
                        line.setEndX(position1.x);
                        line.setEndY(position1.y);
                        
                        //line.setTranslateY(position.y);

                    });
                    line.setOnMouseReleased(mouseEvent -> line.setCursor(Cursor.HAND));
                    line.setOnMouseEntered(mouseEvent -> line.setCursor(Cursor.HAND));
                    
   
        

        
    
               
                
                
               
}
         class Measure {
                    double x, y;

                 public Measure() {
                      x = 0; y = 0;
            }
        }
        
}