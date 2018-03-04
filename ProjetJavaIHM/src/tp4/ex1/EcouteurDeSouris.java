package tp4.ex1;

import tp4.ex1.AireDeDessin;
import java.awt.event.*;
import javax.swing.SwingUtilities;

class EcouteurDeSouris implements MouseListener, MouseMotionListener {
    AireDeDessin aire;

    EcouteurDeSouris(AireDeDessin a) {
        aire = a;
    }
    
    public void mousePressed(MouseEvent e) {
        if(SwingUtilities.isLeftMouseButton(e)){
            aire.setOrigin(e.getPoint());
        }
    }

    public void mouseDragged(MouseEvent e) {
       if(SwingUtilities.isLeftMouseButton(e)){
            aire.drawPreview(e.getPoint());
        }
    }
    
    public void mouseReleased(MouseEvent e) {
       aire.drawFinish();
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