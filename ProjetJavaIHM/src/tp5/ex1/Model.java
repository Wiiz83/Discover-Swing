package tp5.ex1;

import java.util.List;
import java.util.ArrayList;

public class Model {
    private int value;
    private List<View> list = new ArrayList<>();

    public Model(int value) {
        this.value = value;
    }

    public void setValue(int value) {
        this.value = value;
        notifyViews();
    }
    
    public void addView(View v){
        list.add(v);
        v.notify(value);
    }
    
    private void notifyViews(){
        for (View v : list){
            v.notify(value);
        }
    }
}
