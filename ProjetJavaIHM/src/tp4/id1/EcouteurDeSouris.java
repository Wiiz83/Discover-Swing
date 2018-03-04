package tp4.id1;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class EcouteurDeSouris implements MouseListener, MouseMotionListener {
    AireDeDessin aire;

    EcouteurDeSouris(AireDeDessin a) {
        aire = a;
    }


    public void mousePressed(MouseEvent e) {
        if(SwingUtilities.isLeftMouseButton(e)){
            aire.setOrigin(e.getPoint());
            aire.drawTo(e.getPoint());
            aire.repaint();
            
        }

        if(SwingUtilities.isRightMouseButton(e)){
            aire.efface(e.getPoint());
            aire.repaint();
        }
    }

    public void mouseDragged(MouseEvent e) {
        if(SwingUtilities.isLeftMouseButton(e)){
            aire.drawTo(e.getPoint());
            aire.repaint();
        }

        if(SwingUtilities.isRightMouseButton(e)){
            aire.efface(e.getPoint());
            aire.repaint();
        }
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