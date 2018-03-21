package bkup.id3;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class EcouteurDeSouris implements MouseListener, MouseMotionListener {
    AireDeDessin aire;

    EcouteurDeSouris(AireDeDessin a) {
        aire = a;
    }
    
    public void mousePressed(MouseEvent e) {

    }

    public void mouseDragged(MouseEvent e) {
        aire.dessine(e.getPoint());
        aire.repaint();
    }
    
    public void mouseReleased(MouseEvent e) {
    }


    public void mouseMoved(MouseEvent e) {
    }

    public void mouseEntered(MouseEvent e) {
    	
    }
    public void mouseExited(MouseEvent e) {
    	
    }
    public void mouseClicked(MouseEvent e) {
    	
    }
}