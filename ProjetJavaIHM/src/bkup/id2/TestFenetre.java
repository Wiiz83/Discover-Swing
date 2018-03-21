package bkup.id2;

import java.awt.*;
import javax.swing.*;

public class TestFenetre implements Runnable {
	
    public void run() {
        // Creation d'une fenetre
        JFrame frame = new JFrame("Exercice 5");

        // Creation du composant de dessin et ajout de l'objet de traitement
        // des evenements provenant de la souris
        //AireDeDessin dessin = new AireDeDessin();
        AireDeDessin dessin = new AireDeDessin();
        
        EcouteurDeSouris listener = new EcouteurDeSouris(dessin);
        
        dessin.addMouseListener(listener);
        dessin.addMouseMotionListener(listener);
        
        // Ajout de notre composant de dessin dans la fenetre
        frame.add(dessin);

        // Un clic sur le bouton de fermeture clos l'application
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // On fixe la taille et on demarre
        frame.setSize(500, 500);
        frame.setVisible(true);
    }

    public static void main(String [] args) {
        SwingUtilities.invokeLater(new TestFenetre());
    }
}