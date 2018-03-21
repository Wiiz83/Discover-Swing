package bkup.id3;

import java.awt.Dimension;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.image.BufferedImage;

public class EcouteurDeComposant implements ComponentListener {
	
    AireDeDessin aire;

    EcouteurDeComposant(AireDeDessin a) {
        aire = a;
    }
	
    public void componentHidden(ComponentEvent e) {
        System.out.println("componentHidden");
 
    }
 
    public void componentMoved(ComponentEvent e) {
    	System.out.println("componentMoved");
    }
 
    public void componentResized(ComponentEvent e) {
    	System.out.println("componentResized");    
    	Dimension newSize = e.getComponent().getBounds().getSize();  
    	aire.redimensionnement(newSize);
    }
 
    public void componentShown(ComponentEvent e) {
    	System.out.println("componentShown");
 
    }

}
