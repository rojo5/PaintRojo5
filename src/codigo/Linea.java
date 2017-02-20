/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Usuario
 */
public class Linea {
    int x1, x2, y1, y2;
    Color color;
    
    public Linea(int _x1, int _y1, Color _color){
        this.x1 = _x1;
        this.y1 = _y1;
        this.color = _color;
    }
    
    public  void pintaLinea(Graphics g, int posX, int posY){
        
        this.x2= posX;
        this.y2 =posY;
        
        g.drawLine(x1, y1, x2, y2);
    }
    
}
