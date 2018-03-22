/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3;

import java.awt.Color;
import javax.swing.Timer;

/**
 *
 * @author uzanl
 */
public final class Exercice3 extends javax.swing.JFrame {

    private final Timer timerMarcheRouge = new Timer(2000, this::timerMarcheRougeActionPerformed);
    private final Timer timerMarcheRougeOrange = new Timer(1000, this::timerMarcheRougeOrangeActionPerformed);
    private final Timer timerMarcheVert = new Timer(3000, this::timerMarcheVertActionPerformed);
    private final Timer timerMarcheVertEteind = new Timer(1000, this::timerMarcheVertEteindActionPerformed);   
    private final Timer timerMarcheVertClignote = new Timer(1000, this::timerMarcheVertClignoteActionPerformed);
    private final Timer timerMarcheOrange = new Timer(1500, this::timerMarcheOrangeActionPerformed);
    private final Timer timerPanneOrange = new Timer(1000, this::timerPanneOrangeActionPerformed);
    private final Timer timerPanneEteind = new Timer(500, this::timerPanneEteindActionPerformed);   
    
    public enum Etat {E1, E2, E3, E4, E5, E6, E7, E8, E9};
    public Etat etat;
    public int compteur;
    
    /**
     * Creates new form Exercice1
     */
    public Exercice3() {
        initComponents();
        this.GreenLight.setCouleurOn(Color.GREEN);
        this.RedLight.setCouleurOn(Color.RED);
        this.OrangeLight.setCouleurOn(Color.ORANGE);
        etat = Etat.E4;
        presentationE4();
        initCompteur();
    }
    
    public void initCompteur(){
        this.compteur = 0;
    }
    
    public void incCompteur(){
        this.compteur++;
    }

    public void stopAllTimers(){
        timerMarcheRouge.stop();
        timerMarcheRougeOrange.stop();
        timerMarcheVert.stop();
        timerMarcheVertEteind.stop();
        timerMarcheVertClignote.stop();
        timerMarcheOrange.stop();
        timerPanneOrange.stop();
        timerPanneEteind.stop();
    }
    
    //MarcheVert
    public void presentationE1() {
        this.GreenLight.allumer();
        this.RedLight.eteindre();
        this.OrangeLight.eteindre();
        this.PlayButton.setEnabled(false);
        this.StopButton.setEnabled(true);
        this.PanneButton.setEnabled(true);
        stopAllTimers();
        timerMarcheVert.start();
    }
    //MarcheOrange
    public void presentationE2() {
        this.GreenLight.eteindre();
        this.RedLight.eteindre();
        this.OrangeLight.allumer();
        this.PlayButton.setEnabled(false);
        this.StopButton.setEnabled(true);
        this.PanneButton.setEnabled(true);
        stopAllTimers();
        timerMarcheOrange.start();
    }   
    //MarcheRouge
    public void presentationE3() {
        this.GreenLight.eteindre();
        this.RedLight.allumer();
        this.OrangeLight.eteindre();
        this.PlayButton.setEnabled(false);
        this.StopButton.setEnabled(true);
        this.PanneButton.setEnabled(true);
        stopAllTimers();
        timerMarcheRouge.start();
    }   
    //FEUX ARRETES = STOP
    public void presentationE4() {
        this.GreenLight.eteindre();
        this.RedLight.eteindre();
        this.OrangeLight.eteindre();
        this.PlayButton.setEnabled(true);
        this.StopButton.setEnabled(false);
        this.PanneButton.setEnabled(false);
        stopAllTimers();
    }
    //PanneOrange
    public void presentationE5() {
        this.GreenLight.eteindre();
        this.RedLight.eteindre();
        this.OrangeLight.allumer();
        this.PlayButton.setEnabled(true);
        this.StopButton.setEnabled(true);
        this.PanneButton.setEnabled(false);
        stopAllTimers();
        timerPanneOrange.start();
    }   
    //PanneEteind
    public void presentationE6() {
        this.GreenLight.eteindre();
        this.RedLight.eteindre();
        this.OrangeLight.eteindre();
        this.PlayButton.setEnabled(true);
        this.StopButton.setEnabled(true);
        this.PanneButton.setEnabled(false);
        stopAllTimers();
        timerPanneEteind.start();
    }
    //MarcheRougeOrange
    public void presentationE7() {
        this.GreenLight.eteindre();
        this.RedLight.allumer();
        this.OrangeLight.allumer();
        this.PlayButton.setEnabled(false);
        this.StopButton.setEnabled(true);
        this.PanneButton.setEnabled(true);
        stopAllTimers();
        timerMarcheRougeOrange.start();
    }
    //MarcheVertEteind
    public void presentationE8() {
        this.GreenLight.eteindre();
        this.RedLight.eteindre();
        this.OrangeLight.eteindre();
        this.PlayButton.setEnabled(false);
        this.StopButton.setEnabled(true);
        this.PanneButton.setEnabled(true);
        stopAllTimers();
        timerMarcheVertEteind.start();
    }
    //MarcheVertClignote
    public void presentationE9() {
        this.GreenLight.allumer();
        this.RedLight.eteindre();
        this.OrangeLight.eteindre();
        this.PlayButton.setEnabled(false);
        this.StopButton.setEnabled(true);
        this.PanneButton.setEnabled(true);
        stopAllTimers();
        timerMarcheVertClignote.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        StopButton = new javax.swing.JButton();
        PanneButton = new javax.swing.JButton();
        PlayButton = new javax.swing.JButton();
        RedLight = new tp3.Ampoule();
        GreenLight = new tp3.Ampoule();
        OrangeLight = new tp3.Ampoule();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        StopButton.setText("Stop");
        StopButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StopButtonActionPerformed(evt);
            }
        });

        PanneButton.setText("Panne");
        PanneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PanneButtonActionPerformed(evt);
            }
        });

        PlayButton.setText("Play");
        PlayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlayButtonActionPerformed(evt);
            }
        });

        RedLight.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout RedLightLayout = new javax.swing.GroupLayout(RedLight);
        RedLight.setLayout(RedLightLayout);
        RedLightLayout.setHorizontalGroup(
            RedLightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        RedLightLayout.setVerticalGroup(
            RedLightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        GreenLight.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout GreenLightLayout = new javax.swing.GroupLayout(GreenLight);
        GreenLight.setLayout(GreenLightLayout);
        GreenLightLayout.setHorizontalGroup(
            GreenLightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        GreenLightLayout.setVerticalGroup(
            GreenLightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        OrangeLight.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout OrangeLightLayout = new javax.swing.GroupLayout(OrangeLight);
        OrangeLight.setLayout(OrangeLightLayout);
        OrangeLightLayout.setHorizontalGroup(
            OrangeLightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        OrangeLightLayout.setVerticalGroup(
            OrangeLightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(OrangeLight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GreenLight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RedLight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(StopButton, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PlayButton, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanneButton, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(RedLight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PlayButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(OrangeLight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanneButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(GreenLight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(StopButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
  
    
    /*
    Le feu Rouge (E3) s'allume pendant 2 secondes puis passe au RougeOrange (E7)
    */
    private void timerMarcheRougeActionPerformed(java.awt.event.ActionEvent evt) {                                         
        switch(etat){
            case E1 :
                break;
            case E2 :
                break;
            case E3 :
                etat = Etat.E7;
                presentationE7();
                break;
            case E4 :
                break;
            case E5 :
                break;
            case E6 :
                break;
            case E7 :
                break;
            case E8 :
                break;
            case E9 :
                break;
        }
    } 
    /*
    Les feux Rouge et Orange (E7) s'allument pendant 1 seconde puis passe au Vert (E1)
    */
    private void timerMarcheRougeOrangeActionPerformed(java.awt.event.ActionEvent evt) {                                         
        switch(etat){
            case E1 :
                break;
            case E2 :
                break;
            case E3 :
                break;
            case E4 :
                break;
            case E5 :
                break;
            case E6 :
                break;
            case E7 :
                etat = Etat.E1;
                presentationE1();
                break;
            case E8 :
                break;
            case E9 :
                break;
        }
    } 
    /*
    Le feu Vert (E1) s'allume pendant 3 secondes puis passe à tout éteind (E8)
    */
    private void timerMarcheVertActionPerformed(java.awt.event.ActionEvent evt) {                                         
        switch(etat){
            case E1 :
                etat = Etat.E8;
                presentationE8();
                break;
            case E2 :
                break;
            case E3 :
                break;
            case E4 :
                break;
            case E5 :
                break;
            case E6 :
                break;
            case E7 :
                break;
            case E8 :
                break;
            case E9 :
                break;
        }
    } 
    /*
    Tous les feux sont éteinds (E8) pendant 1 seconde puis passe au Vert clignotant (E9)
    */
    private void timerMarcheVertEteindActionPerformed(java.awt.event.ActionEvent evt) {                                         
        switch(etat){
            case E1 :
                break;
            case E2 :
                break;
            case E3 :
                break;
            case E4 :
                break;
            case E5 :
                break;
            case E6 :
                break;
            case E7 :
                break;
            case E8 :
                incCompteur();
                etat = Etat.E9;
                presentationE9();
                break;
            case E9 :
                break;
        }
    } 
    /*
    Le feu vert s'allume (E9) pendant 1 seconde puis passe au Orange (E2) si cpt > 4 sinon Tout éteind (E8)
    */
    private void timerMarcheVertClignoteActionPerformed(java.awt.event.ActionEvent evt) {                                         
        switch(etat){
            case E1 :
                break;
            case E2 :
                break;
            case E3 :
                break;
            case E4 :
                break;
            case E5 :
                break;
            case E6 :
                break;
            case E7 :
                break;
            case E8 :
                break;
            case E9 :
                if(compteur >= 4){
                    etat = Etat.E2;
                    presentationE2();
                } else {
                    etat = Etat.E8;
                    presentationE8();
                }
                break;
        }
    } 
    /*
    Le feu Orange s'allume (E2) pendant 1.5 seconde puis passe au Rouge (E3)
    */
    private void timerMarcheOrangeActionPerformed(java.awt.event.ActionEvent evt) {                                         
        switch(etat){
            case E1 :
                break;
            case E2 :
                etat = Etat.E3;
                presentationE3();
                initCompteur();
                break;
            case E3 :
                break;
            case E4 :
                break;
            case E5 :
                break;
            case E6 :
                break;
            case E7 :
                break;
            case E8 :
                break;
            case E9 :
                break;
        }
    } 
    /*
    Le feu orange de la panne (E5) s'allume pendant 1 seconde puis passe à tout éteind (E6)
    */
    private void timerPanneOrangeActionPerformed(java.awt.event.ActionEvent evt) {                                         
        switch(etat){
            case E1 :
                break;
            case E2 :
                break;
            case E3 :
                break;
            case E4 :
                break;
            case E5 :
                etat = Etat.E6;
                presentationE6();
                break;
            case E6 :
                break;
            case E7 :
                break;
            case E8 :
                break;
            case E9 :
                break;
        }
    } 
    /*
    Tous les feux sont éteind (E6) pour la panne pendant 0.5 seconde puis passe au Orange Panne (E5)
    */
    private void timerPanneEteindActionPerformed(java.awt.event.ActionEvent evt) {                                         
        switch(etat){
            case E1 :
                break;
            case E2 :
                break;
            case E3 :
                break;
            case E4 :
                break;
            case E5 :
                break;
            case E6 :
                etat = Etat.E5;
                presentationE5();
                break;
            case E7 :
                break;
            case E8 :
                break;
            case E9 :
                break;
        }
    } 
    
    private void StopButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StopButtonActionPerformed
        switch(etat){
            case E1 :
                etat = Etat.E4;
                presentationE4();
                break;
            case E2 :
                etat = Etat.E4;
                presentationE4();
                break;
            case E3 :
                etat = Etat.E4;
                presentationE4();
                break;
            case E4 :
                etat = Etat.E4;
                presentationE4();
                break;
            case E5 :
                etat = Etat.E4;
                presentationE4();
                break;
            case E6 :
                etat = Etat.E4;
                presentationE4();
                break;
            case E7 :
                etat = Etat.E4;
                presentationE4();
                break;
            case E8 :
                etat = Etat.E4;
                presentationE4();
                break;
            case E9 :
                etat = Etat.E4;
                presentationE4();
                break;
        }
    }//GEN-LAST:event_StopButtonActionPerformed

    private void PanneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PanneButtonActionPerformed
        switch(etat){
            case E1 :
                etat = Etat.E5;
                presentationE5();
                break;
            case E2 :
                etat = Etat.E5;
                presentationE5();
                break;
            case E3 :
                etat = Etat.E5;
                presentationE5();
                break;
            case E4 :
                break;
            case E5 :
                break;
            case E6 :
                break;
            case E7 :
                etat = Etat.E5;
                presentationE5();
                break;
            case E8 :
                etat = Etat.E5;
                presentationE5();
                break;
            case E9 :
                etat = Etat.E5;
                presentationE5();
                break;
        }
    }//GEN-LAST:event_PanneButtonActionPerformed

    private void PlayButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlayButtonActionPerformed
        switch(etat){
            case E1 :
                break;
            case E2 :
                break;
            case E3 :
                break;
            case E4 :
                etat = Etat.E3;
                presentationE3();
                break;
            case E5 :
                etat = Etat.E3;
                presentationE3();
                break;
            case E6 :
                etat = Etat.E3;
                presentationE3();
                break;
            case E7 :
                break;
        }
    }//GEN-LAST:event_PlayButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Exercice3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Exercice3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Exercice3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Exercice3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Exercice3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private tp3.Ampoule GreenLight;
    private tp3.Ampoule OrangeLight;
    private javax.swing.JButton PanneButton;
    private javax.swing.JButton PlayButton;
    private tp3.Ampoule RedLight;
    private javax.swing.JButton StopButton;
    // End of variables declaration//GEN-END:variables
}
