package Collections;
import java.util.Comparator;
import java.util.HashMap;

public class questionSix{
public static void main(String[] args) {
int[] arr = {1,2,3,4,5,6,7,8,9,9,9,5,4,5,3,4,2,1,6,8};
HashMap<Integer, Integer> map1 = new HashMap(); //frequency
HashMap<Integer, Integer> map2 = new HashMap(); //index

for(int i=0;i<arr.length;i++){
if(map1.containsKey(arr[i])){
int val = map1.get(arr[i]);
map1.put(arr[i], val+1);
}else{
map1.put(arr[i], 1);
}
}

for(int i=0;i<arr.length;i++){
if(map2.containsKey(arr[i])){
continue;
}else{
map2.put(arr[i], i);
}
}
}
}