package tp4.ex1;

import tp4.ex1.AireDeDessin;
import java.awt.Dimension;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

public class EcouteurDeComposant implements ComponentListener {
	
    AireDeDessin aire;

    EcouteurDeComposant(AireDeDessin a) {
        aire = a;
    }
	
    @Override
    public void componentHidden(ComponentEvent e) {

    }
 
    @Override
    public void componentMoved(ComponentEvent e) {

    }
 
    @Override
    public void componentResized(ComponentEvent e) {   
    	Dimension newSize = e.getComponent().getBounds().getSize();  
    	aire.redimensionnement(newSize);
    }
 
    @Override
    public void componentShown(ComponentEvent e) {

 
    }

}
