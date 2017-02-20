/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Polygon;

/**
 *
 * @author Rojo5
 */
public class Forma extends Polygon {

    Color color = null;
    boolean relleno = false;
    int x = 0;
    int y = 0;
    int numLados;
    
    //Constructor
    public Forma(int _posX, int _posY, int[] _puntosX, int[] _puntosY, Color _color, boolean _relleno, int _numLados) {
        super(_puntosX, _puntosY, _numLados);
        numLados = _numLados;
        //This se refiere a la clase forma
        this.x = _posX;
        this.y = _posY;
        color = _color;
        relleno = _relleno;
        calculaPuntos(1,0);
    }
    
  
    //Metodo que calcula las coordenadas de los vertices del poligono e implementa
    //el grio de la figura
    public void calculaPuntos(int _radio, double _giro){
        for(int i=0;i <numLados;i++){
            this.xpoints[i] = (int)(this.x + _radio* Math.cos((2 * Math.PI * i + _radio)/npoints));
            this.ypoints[i] = (int)(this.y + _radio* Math.sin((2 * Math.PI * i + _radio)/npoints));
        }
    }
    
    public void dibujate(Graphics2D g2, int posX, int posY){
        int radio = this.y - posY;
        int giro = this.x - posX;
        calculaPuntos(radio, giro);
        g2.setColor(color);
        if(relleno){
            g2.fill(this);
        }
        else{
            g2.draw(this);
        }
        
    }
}
