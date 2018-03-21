package bkup.id1;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

public class EcouteurDeComposant implements ComponentListener {
	
    AireDeDessin aire;

    EcouteurDeComposant(AireDeDessin a) {
        aire = a;
    }
	
    public void componentHidden(ComponentEvent e) {
 
    }
 
    public void componentMoved(ComponentEvent e) {

    }
 
    public void componentResized(ComponentEvent e) {    
    	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    	int width = (int) screenSize.getWidth();
    	int height = (int) screenSize.getHeight();
    	aire.redimensionnement(width, height);
    }
 
    public void componentShown(ComponentEvent e) {
 
    }

}
