package tp4.ex3;

import java.awt.event.*;
import javax.swing.SwingUtilities;

class EcouteurDeSouris implements MouseListener, MouseMotionListener {
    AireDeDessin aire;

    EcouteurDeSouris(AireDeDessin a) {
        aire = a;
    }
    
    @Override
    public void mousePressed(MouseEvent e) {
        if(SwingUtilities.isLeftMouseButton(e)){
            aire.setOrigin(e.getPoint());
        }
    }

    @Override
    public void mouseDragged(MouseEvent e) {
       if(SwingUtilities.isLeftMouseButton(e)){
            aire.drawPreview(e.getPoint());
        }
    }
    
    @Override
    public void mouseReleased(MouseEvent e) {
       aire.drawFinish();
    }


    @Override
    public void mouseMoved(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
    	
    }
    @Override
    public void mouseExited(MouseEvent e) {
    	
    }
    @Override
    public void mouseClicked(MouseEvent e) {
    	
    }
}