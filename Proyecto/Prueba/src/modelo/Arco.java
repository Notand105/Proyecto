
package modelo;


import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;

public class Arco extends Arc {
    Arc arc= new Arc();
    String name;
    public Arco(int a, int b, int c, int d, int e, int f){
        
       arc.setCenterX(a);
        arc.setCenterY(b);
        arc.setRadiusX(c);
        arc.setRadiusY(d);
        arc.setStartAngle(e);
        arc.setLength(f);
        arc.setType(ArcType.ROUND);
        
    }
    
   public Arc get(){
    return arc;
   } 
    
    
}
