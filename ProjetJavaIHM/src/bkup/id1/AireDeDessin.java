package bkup.id1;

import java.awt.*;
import java.awt.image.BufferedImage;
import javax.swing.*;

class AireDeDessin extends JComponent {
    BufferedImage mon_image;
    Graphics2D graphic;
    Point origin;
	int width;
	int height;

    public AireDeDessin() {
        mon_image = null;
        origin = null;
    }

    public void setOrigin(Point p) {
        origin = p;
    }

    public void drawTo(Point p) {
    	graphic.setPaint(Color.black);
    	graphic.drawLine(origin.x, origin.y, p.x, p.y);
        origin = p;
    }

    //on efface en dessinant un rectangle blanc
    public void efface(Point p) {
        graphic.setPaint(Color.white);
        graphic.fillRect(p.x, p.y, 10, 10);
    }
    
    //on efface tout
    public void nouveau(int w, int h) {
    	width = w;
    	height = h;
    	
        mon_image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        graphic = mon_image.createGraphics();
        
        graphic.setPaint(Color.white);
        graphic.fillRect(0, 0, width, height);
        
        repaint();
    }
    
    // on redimmensionne // ne fonctionne pas correctement car efface les dessins
    public void redimensionnement(int w, int h){
       	width = w;
    	height = h;
    	
        mon_image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        graphic = mon_image.createGraphics();
        
        graphic.setPaint(Color.white);
        graphic.fillRect(0, 0, width, height);
        graphic.setPaint(Color.black);
    }
    

    public void paintComponent(Graphics g) {
        Graphics2D drawable = (Graphics2D) g;

        // On reccupere quelques infos
        int width = getSize().width;
        int height = getSize().height;

        if (mon_image == null) {
        	mon_image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        	graphic = mon_image.createGraphics();
        	graphic.setPaint(Color.white);
        	graphic.fillRect(0, 0, width, height);
        	graphic.setPaint(Color.black);
        }

        drawable.drawImage(mon_image, 0, 0, null);
    }

    }
