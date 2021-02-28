package Collections;

import java.util.Scanner;

public class questionTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        StringBuffer s = new StringBuffer(s1);
        for (int i = 0; i < s.length(); i++) {
            int count = 0;
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    s.deleteCharAt(j);
                    j--;
                    count++;
                }
            }
            if (count >= 1) {
                s.deleteCharAt(i);
                i--;
            }
        }
        System.out.println(s.length());
    }
}
