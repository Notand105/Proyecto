/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Line;
import prueba.Prueba;
/**
 *
 * @author Fernando
 */
public class Objet {
    
    private Arc arco=new Arc();
    private Arc en1=new Arc();
    private Arc en2=new Arc();
    private Arc en3=new Arc();
    private Arc en4=new Arc();
    private Arc en5=new Arc();
    private Arc en6=new Arc();
    private Arc en7=new Arc();
    private Arc en8=new Arc();
    private Label label=new Label();
    private Line  line=new Line();
    private int id;
    
    public Objet(Arc arco,Arc en1,Arc en2,Arc en3,Arc en4,Arc en5,Arc en6,Arc en7,Arc en8,Label label,Line line,int id){
        this.arco=arco;
        this.en1=en1;
        this.en2=en2;
        this.en3=en3;
        this.en4=en4;
        this.en5=en5;
        this.en6=en6;
        this.en7=en7;
        this.en8=en8;
        this.label=label;
        this.line=line;
        this.id=id;
    }

    public Arc getArco() {
        return arco;
    }

    public Arc getEn1() {
        return en1;
    }

    public Arc getEn2() {
        return en2;
    }

    public Arc getEn3() {
        return en3;
    }

    public Arc getEn4() {
        return en4;
    }

    public Arc getEn5() {
        return en5;
    }

    public Arc getEn6() {
        return en6;
    }

    public Arc getEn7() {
        return en7;
    }

    public Arc getEn8() {
        return en8;
    }

    public Label getLabel() {
        return label;
    }

    public Line getLine() {
        return line;
    }

    public int getId() {
        return id;
    }

    public void setLabel(Label label) {
        this.label = label;
    }
    
    
    
}
