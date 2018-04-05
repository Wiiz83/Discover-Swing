/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp5;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

/**
 *
 * @author Racim
 */
public class PieChart extends JPanel implements View {
    private Color colorRemplie;
    private Color colorVide;
    private int angle;

    public PieChart() {
        this(Color.ORANGE, Color.LIGHT_GRAY);
    }

    public PieChart(Color colorRemplie, Color colorVide) {
        this.colorRemplie = colorRemplie;
        this.colorVide = colorVide;
        this.angle = 0;
        this.setSize(100, 100);
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.clearRect(0, 0, this.getWidth(), this.getHeight());
        g2.setColor(colorVide);
        g2.fillOval(0, 0, Math.min(this.getWidth(), this.getHeight()), Math.min(this.getWidth(), this.getHeight()));
        g2.setColor(new Color(colorRemplie.getRed(), colorRemplie.getGreen(), colorRemplie.getBlue()));
        g2.fillArc(0, 0, Math.min(this.getWidth(), this.getHeight()), Math.min(this.getWidth(), this.getHeight()), 0, angle);
    }
    
    private void setAngle(int percent){
        this.angle = 360 * percent / 100;
        repaint();
    }

    @Override
    public void notify(int value) {
        this.setAngle(value);
    }
}
