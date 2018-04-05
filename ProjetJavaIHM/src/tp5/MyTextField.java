/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp5;

import javax.swing.JTextField;

/**
 *
 * @author uzanl
 */
public class MyTextField extends JTextField implements View {

    @Override
    public void notify(int value) {
        this.setText(String.valueOf(value));
    }
    
}
