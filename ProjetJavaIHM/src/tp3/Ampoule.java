/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Ampoule extends JPanel{
    
    private Color couleurOn;
    private Color couleurOff = Color.WHITE;
    private boolean on = false;

    public void setCouleurOn(Color couleurOn) {
        this.couleurOn = couleurOn;
        repaint();
    }
    
    public void allumer(){
        on = true;
        repaint();
    }
    
    public void eteindre(){
        on = false;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); //To change body of generated methods, choose Tools | Templates.
        if (on){
            g.setColor(couleurOn);
        }else{
            g.setColor(couleurOff);
        }
        g.fillOval(0, 0, getWidth(), getHeight());
    }
    
    
    
}
