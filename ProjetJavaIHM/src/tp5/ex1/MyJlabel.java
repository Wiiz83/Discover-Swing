/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp5.ex1;

import javax.swing.JLabel;

/**
 *
 * @author mcj1099a
 */
public class MyJlabel extends JLabel implements View{

    @Override
    public void notify(int value) {
        setText(""+value);
    }
    
}
