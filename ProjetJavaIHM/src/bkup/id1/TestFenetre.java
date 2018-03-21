package bkup.id1;


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class TestFenetre implements Runnable {
    AireDeDessin mon_dessin;
    
    public void run() {
        
        // Creation du composant de dessin qui va aller chercher dans
        // l'application les infos sur ce qu'il doit faire
        mon_dessin = new AireDeDessin();

        // Creation d'une fenetre
        JFrame frame = new JFrame("Exercice 1");

        // Ajout de notre composant de dessin dans la fenetre
        frame.add(mon_dessin);
        
        EcouteurDeSouris listener = new EcouteurDeSouris(mon_dessin);
        EcouteurDeComposant component_listener = new EcouteurDeComposant(mon_dessin);
        
        mon_dessin.addComponentListener(component_listener);
        mon_dessin.addMouseListener(listener);
        mon_dessin.addMouseMotionListener(listener);

        // Creation d'un menu
        // Menu principal
        JMenu menu = new JMenu("Principal");

        JMenuItem nouveau = new JMenuItem("Nouveau");
        nouveau.addActionListener(new EffacerDessin(mon_dessin));
        menu.add(nouveau);
        
        JMenuItem item = new JMenuItem("Quitter");
        item.addActionListener(new QuitterApplication());
        menu.add(item);

        // Barre de menu
        JMenuBar barre = new JMenuBar();
        barre.add(menu);
        frame.setJMenuBar(barre);

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
