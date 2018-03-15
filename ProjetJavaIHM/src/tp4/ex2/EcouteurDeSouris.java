package tp4.ex2;

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
            aire.lineStart(e.getPoint());
        }
        
        if(SwingUtilities.isRightMouseButton(e)){
            aire.efface();
        }
    }

    @Override
    public void mouseDragged(MouseEvent e) {
       if(SwingUtilities.isLeftMouseButton(e)){
            aire.linePreview(e.getPoint());
        }
    }
    
    @Override
    public void mouseReleased(MouseEvent e) {
        if(SwingUtilities.isLeftMouseButton(e)){
            aire.lineFinish();
        }
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