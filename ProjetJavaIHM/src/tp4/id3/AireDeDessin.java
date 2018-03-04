package tp4.id3;

import java.awt.*;
import java.awt.image.*;
import javax.swing.*;

class AireDeDessin extends JComponent {
	
    BufferedImage mon_image;
    Graphics2D graphic;
    Point depart = null;

    // on dessine les traits
    public void dessine(Point p) {
    	if(depart == null){
    		//donothing
    	}else {
    		graphic.drawLine(depart.x, depart.y, p.x, p.y);
    	}
    	depart = p;
    }
    
    // on redimmensionne !
    public void redimensionnement(Dimension newSize){
    	int width = (int) newSize.getWidth();
    	int height = (int) newSize.getHeight();
    	
        mon_image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        graphic = mon_image.createGraphics();
        
        graphic.setPaint(Color.white);
        graphic.fillRect(0, 0, width, height);
        graphic.setPaint(Color.black);
    }

    public void paintComponent(Graphics g) {
        Graphics2D drawable = (Graphics2D) g;
        drawable.drawImage(mon_image, 0, 0, null);
  
    }
}