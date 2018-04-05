/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp5;

import java.util.ArrayList;
import tp5.View;

/**
 *
 * @author uzanl
 */
public class Model {
    private int value;
    private ArrayList<View> list = new ArrayList<>();
    
    public Model(int value){
        this.value = value;
    }
    
    public void setValue(int value){
        this.value = value;
        notifyViews();
    }
    
    public void addView(View v){
        list.add(v);
        v.notify(value);
    }
    
    private void notifyViews(){
        for(View v : list){
            v.notify(value);
        }
    }
    
    
    
}
