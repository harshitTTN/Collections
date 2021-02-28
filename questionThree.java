package Collections;

import java.util.HashMap;
import java.util.Map;

public class questionThree {
    public static void main(String[] args) {
        String inputString ="harshit";
        HashMap<Character, Integer> h
                = new HashMap<Character, Integer>();


        char[] strArray = inputString.toCharArray();

        for (char c : strArray) {
            if (h.containsKey(c)) {


                h.put(c, h.get(c) + 1);
            } else {

               h.put(c, 1);
            }
        }

        for (Map.Entry entry : h.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
}
