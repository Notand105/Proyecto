package modelo;

import java.util.ArrayList;
import javafx.scene.Cursor;
import javafx.scene.Node;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Line;
import prueba.Prueba;

/**
 *
 * @author Fernando
 */
public class Atomos {
     class Measure {
                    double x, y;

                 public Measure() {
                      x = 0; y = 0;
            }
        }

        Line punto= new Line();
       public void MovAtomo(Node arco, Node label, Line line,ArrayList<Arc> atomos,Node en1,Node en2,Node en3,Node en4,Node en5,Node en6,Node en7,Node en8, Line l1, Line l2, Line l3, Line l4, Line l5, Line l6, Line l7, Line l8) {

        final Measure dragMeasure = new Measure();
        final Measure position = new Measure();
        arco.setOnMousePressed(mouseEvent -> {
            dragMeasure.x = mouseEvent.getSceneX() - position.x;
            dragMeasure.y = mouseEvent.getSceneY() - position.y;
            arco.setCursor(Cursor.MOVE);
        });
        arco.setOnMouseDragged(mouseEvent -> {
            position.x = mouseEvent.getSceneX() - dragMeasure.x;
            position.y = mouseEvent.getSceneY() - dragMeasure.y;
            arco.setTranslateX(position.x);
            arco.setTranslateY(position.y);
            en1.setTranslateX(position.x);
            en1.setTranslateY(position.y);
            en2.setTranslateX(position.x);
            en2.setTranslateY(position.y);
            en3.setTranslateX(position.x);
            en3.setTranslateY(position.y);
            en4.setTranslateX(position.x);
            en4.setTranslateY(position.y);
            en5.setTranslateX(position.x);
            en5.setTranslateY(position.y);
            en6.setTranslateX(position.x);
            en6.setTranslateY(position.y);
            en7.setTranslateX(position.x);
            en7.setTranslateY(position.y);
            en8.setTranslateX(position.x);
            en8.setTranslateY(position.y);
            label.setTranslateX(position.x);
            label.setTranslateY(position.y);
            line.setTranslateX(position.x);
            line.setTranslateY(position.y);
            l1.setTranslateX(position.x);
            l1.setTranslateY(position.y);
            l2.setTranslateX(position.x);
            l2.setTranslateY(position.y);
            l3.setTranslateX(position.x);
            l3.setTranslateY(position.y);
            l4.setTranslateX(position.x);
            l4.setTranslateY(position.y);
            l5.setTranslateX(position.x);
            l5.setTranslateY(position.y);
            l6.setTranslateX(position.x);
            l6.setTranslateY(position.y);
            l7.setTranslateX(position.x);
            l7.setTranslateY(position.y);
            l8.setTranslateX(position.x);
            l8.setTranslateY(position.y);
            punto.setStartX(line.getEndX());
            punto.setStartY(line.getEndY());
            punto.setEndX(line.getEndX());
            punto.setEndY(line.getEndY());
            punto.setStrokeWidth(4);
            punto.setStroke(line.getStroke());
            int i=0;
            while(i<atomos.size()){
                if (punto.intersects(atomos.get(i).getBoundsInLocal())) {
                    line.setEndX(atomos.get(i).getLayoutX());
                    line.setEndY(atomos.get(i).getLayoutY());
                    line.setFill(Color.RED);
                }
                i++;
            }
            

        });
            arco.setOnMouseReleased(mouseEvent -> arco.setCursor(Cursor.HAND));
            arco.setOnMouseEntered(mouseEvent -> arco.setCursor(Cursor.HAND));
        }
         
       
       
                
}         
