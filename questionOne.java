package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class questionOne {
    public static void main(String[] args){
        float sum = 0;
        List<Float> list = new ArrayList<Float>();
        list.add(10.2f);
        list.add(30.5f);
        list.add(50.6f);
        list.add(7.5f);
        list.add(9.7f);

        Iterator<Float> i = list.iterator();
        while(i.hasNext()){
            sum+=i.next();
        }
        System.out.println(sum);
    }
}
