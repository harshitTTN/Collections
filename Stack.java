package Collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Stack {
    @Override
    public String toString() {
        return "("+ s + ")" ;
    }
    private List<String> s = new ArrayList<String>();
    public String peek() {
        if (s.isEmpty()) {
            return null;
        }
        return s.get(s.size() - 1);
    }
    public String getMin(){
        if(s.isEmpty()){
            return null;
        }
        Collections.sort(s);
        return s.get(0);
    }

    public String pop() {
        if (s.isEmpty()) {
            return null;
        }
        String top = s.get(s.size() - 1);
        s.remove(s.size() - 1);
        return top;
    }
    public void push(String val) {
        s.add(val);
    }
    public int size() {
        return s.size();
    }
    public boolean isEmpty() {
        return s.isEmpty();
    }

    public static void main(String[] args) {

        Stack stack = new Stack(); //object of stack class
        System.out.println("Is Stack Empty:"+stack.isEmpty());
        stack.push("Harshit");
        stack.push("Sita");
        stack.push("Sumit");
        stack.push("Dhamu");
        System.out.println("Is Stack Empty:"+stack.isEmpty());
        System.out.println(stack);
        System.out.println("Size:"+stack.size());
        System.out.println("Peek Top "+stack.peek());
        System.out.println("Pop :"+stack.pop());
        System.out.println("After pop:"+stack);
        System.out.println("Stack Size now:"+stack.size());
        System.out.println("Min Element:"+stack.getMin());


    }
}