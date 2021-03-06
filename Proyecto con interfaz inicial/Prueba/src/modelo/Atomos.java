package modelo;

import java.util.ArrayList;
import javafx.scene.Cursor;
import javafx.scene.Node;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Line;
import prueba.Prueba;
import modelo.Objet;
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
       public void MovAtomo(Node arco, Node label, Line line,Node en1,Node en2,Node en3,Node en4,Node en5,Node en6,Node en7,Node en8) {

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
            punto.setStartX(line.getEndX());
            punto.setStartY(line.getEndY());
            punto.setEndX(line.getEndX());
            punto.setEndY(line.getEndY());
            punto.setStrokeWidth(4);
            punto.setStroke(line.getStroke());
            int i=0;

            

        });
            arco.setOnMouseReleased(mouseEvent -> arco.setCursor(Cursor.HAND));
            arco.setOnMouseEntered(mouseEvent -> arco.setCursor(Cursor.HAND));
        }
         
       public void MovGroup( Arc arco, ArrayList<Objet> AtomosGroup) {

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
            int i=0;
            while (i<AtomosGroup.size()){
                AtomosGroup.get(i).getArco().setTranslateX(position.x);
                AtomosGroup.get(i).getArco().setTranslateY(position.y);
                
                AtomosGroup.get(i).getEn1().setTranslateX(position.x);
                AtomosGroup.get(i).getEn1().setTranslateY(position.y);
                
                AtomosGroup.get(i).getEn2().setTranslateX(position.x);
                AtomosGroup.get(i).getEn2().setTranslateY(position.y);
                
                AtomosGroup.get(i).getEn3().setTranslateX(position.x);
                AtomosGroup.get(i).getEn3().setTranslateY(position.y);
                
                AtomosGroup.get(i).getEn4().setTranslateX(position.x);
                AtomosGroup.get(i).getEn4().setTranslateY(position.y);
                
                AtomosGroup.get(i).getEn5().setTranslateX(position.x);
                AtomosGroup.get(i).getEn5().setTranslateY(position.y);
                
                AtomosGroup.get(i).getEn6().setTranslateX(position.x);
                AtomosGroup.get(i).getEn6().setTranslateY(position.y);
                
                AtomosGroup.get(i).getEn7().setTranslateX(position.x);
                AtomosGroup.get(i).getEn7().setTranslateY(position.y);
                
                AtomosGroup.get(i).getEn8().setTranslateX(position.x);
                AtomosGroup.get(i).getEn8().setTranslateY(position.y);
                AtomosGroup.get(i).getLabel().setTranslateX(position.x);
                AtomosGroup.get(i).getLabel().setTranslateY(position.y);
                i=i+1;
            
            }
            
        });
            arco.setOnMouseReleased(mouseEvent -> arco.setCursor(Cursor.HAND));
            arco.setOnMouseEntered(mouseEvent -> arco.setCursor(Cursor.HAND));
        }
       
                
}         
