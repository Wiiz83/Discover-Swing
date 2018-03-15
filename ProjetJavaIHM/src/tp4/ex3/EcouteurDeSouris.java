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
        /*if(SwingUtilities.isLeftMouseButton(e)){
            aire.originDraw(e.getPoint());
        }*/
        if(SwingUtilities.isLeftMouseButton(e)){
            aire.originDraw(e.getPoint());
            aire.previewDraw(e.getPoint());
            aire.repaint();
            
        }
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        if(SwingUtilities.isLeftMouseButton(e)){
            aire.previewDraw(e.getPoint());
            aire.repaint();
        }
                /*
       if(SwingUtilities.isLeftMouseButton(e)){
            aire.previewDraw(e.getPoint());
        }*/
    }
    
    @Override
    public void mouseReleased(MouseEvent e) {
        if(SwingUtilities.isLeftMouseButton(e)){
            aire.finishDraw();
            aire.repaint();
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