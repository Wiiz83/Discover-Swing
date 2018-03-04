package tp4.id2;

import java.awt.*;
import java.awt.image.*;
import javax.swing.*;

class AireDeDessin extends JComponent {
	
    BufferedImage mon_image;
    Graphics2D graphic;
    Point depart = null;

    
    public void dessine(Point p) {
    	if(depart == null){
    		//donothing
    	}else {
    		graphic.drawLine(depart.x, depart.y, p.x, p.y);
    	}
    	depart = p;
    }
    
    //on efface en dessinant un rectangle blanc
    public void efface(Point p) {
        graphic.setPaint(Color.white);
        graphic.fillRect(p.x, p.y, 10, 10);
    }

    public void paintComponent(Graphics g) {
        Graphics2D drawable = (Graphics2D) g;

        if (mon_image == null) {
            // On reccupere quelques infos
            int width = getSize().width;
            int height = getSize().height;
            
            mon_image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
            graphic = mon_image.createGraphics();
            
            graphic.setPaint(Color.white);
            graphic.fillRect(0, 0, width, height);
            graphic.setPaint(Color.black);
            
        } else {
            drawable.drawImage(mon_image, 0, 0, null);
        }

    }
}