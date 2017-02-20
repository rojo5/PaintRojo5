/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

/**
 *
 * @author rojo5
 */
public class Pincel extends Ellipse2D.Double{
   
    Color color = null;
    boolean relleno= true;
    
    public Pincel(int _posX, int _posY, int _radio, Color _color){
        this.x=  _posX;
        this.y = _posY;
        this.width = _radio;
        this.height = _radio;
        this.color = _color;
        relleno = true;
    }
    
    public void pinta(Graphics2D g2, int posX, int posY){
        this.x = posX;
        this.y= posY;
        
        g2.setColor(color);
       if(relleno){
            g2.fill(this);
        }
        else{
            g2.draw(this);
        }
    }
    
}

