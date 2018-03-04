package tp4.id1;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.*;
class EffacerDessin implements ActionListener {

    AireDeDessin mon_dessin;

    public EffacerDessin(AireDeDessin d) {
        mon_dessin = d;
    }

    public void actionPerformed(ActionEvent e) {
    	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    	int width = (int) screenSize.getWidth();
    	int height = (int) screenSize.getHeight();
        mon_dessin.nouveau(width, height);
    }
}
	
	
	