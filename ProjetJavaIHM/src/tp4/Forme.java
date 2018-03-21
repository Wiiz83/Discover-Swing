/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp4;

/**
 *
 * @author uzanl
 */
public class Forme {
    
    public enum Type {Ligne, Cercle, Rectangle};
    public Type type;
    
    public int x1; 
    public int y1;
    public int x2;
    public int y2;   

    public Forme(int x1, int y1, int x2, int y2, Type type) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.type = type;
    }               
}
